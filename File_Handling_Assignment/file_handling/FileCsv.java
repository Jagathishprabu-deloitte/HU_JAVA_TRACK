package file_handling;

import java.io.*;
import java.util.*;

public class FileCsv {
    public static void main(String[] args) {
        String file="src\\StudentData.csv";
        BufferedReader reader=null;
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("src\\SelectedStudents.csv"));
            writer.write("Name,10th,12th,b-tech,rank"+"\n");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line="";
        try {
            reader=new BufferedReader(new FileReader(file));
            ArrayList<Integer> list =new ArrayList<>();
            int count=0;
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(count!=0) {
                    list.add(Integer.valueOf(row[4]));
                }
                count++;
            }
            reader.close();
            reader=new BufferedReader(new FileReader(file));
            Collections.sort(list);
            int count2=0,comma;
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if((count2!=0)) {
                    if (Integer.valueOf(row[4]).equals(list.get(0)) || Integer.valueOf(row[4]).equals(list.get(1)) || Integer.valueOf(row[4]).equals(list.get(2)) || Integer.valueOf(row[4]).equals(list.get(3)) || Integer.valueOf(row[4]).equals(list.get(4))) {
                        comma=0;
                        for (String index : row) {
                            System.out.printf("%-25s", index);
                            writer.write(index);
                            if(comma<4){
                                writer.write(",");
                            }
                            comma++;
                        }
                        writer.write("\n");
                        System.out.println();
                    }
                }
                count2++;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
