package main_assignment;

import java.io.*;
import java.util.Scanner;

public class DeleteUser {
    public static void deleteUserData(){
        Scanner sc=new Scanner(System.in);
        Login login = new Login();
        File inputFile = new File("src\\UserData.csv");
        File tempFile = new File("src\\myTempFile.csv");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter the UserId to delete");
        String userIdDelete=sc.nextLine();
        String file="src\\UserData.csv";
        BufferedReader reader1=null;
        int flag=0,count=0;
        String line="",data="",data1="";
        try {
            reader1=new BufferedReader(new FileReader(file));
            while((line=reader1.readLine())!=null){
                data="";
                count++;
                String[] row=line.split(",");
                if(row[0].equals(userIdDelete)) {
                    flag=1;
                    for (String index : row) {
                        data+=index+",";
                    }
                }
            }
            if(flag==0){
                System.out.println("User Id not found");
            }else{
                data1=data.substring(0,data.length()-1);
                System.out.println(data1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String lineToRemove = data1;
        String currentLine = null;
        while(true) {
            try {
                if (!((currentLine = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) continue;
            try {
                writer.write(currentLine + System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            login.choices();
        }
        boolean successful = tempFile.renameTo(inputFile);
        System.out.println(successful);
    }
}

