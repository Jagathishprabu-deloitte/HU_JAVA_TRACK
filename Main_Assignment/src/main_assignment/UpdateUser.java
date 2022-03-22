package main_assignment;

import com.opencsv.*;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class UpdateUser {
    public void updateUserData(){
        Scanner scanner = new Scanner(System.in);
        DisplayUser displayUser = new DisplayUser();
        Login login =new Login();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("src\\UserDatabase.csv"));
        } catch (FileNotFoundException e) {
        }
        List<String[]> csvBody = null;
        try {
            csvBody = reader.readAll();
        } catch (IOException e) {
        }
        System.out.println("Please Enter UserId of the Field that needs to be Updated");
        String str=scanner.next();
        int count=0;
        for(int i=0;i < csvBody.size();i++){
            String[] strArray=csvBody.get(i);
            if(strArray[1].contains(str)){
                count++;
                int num;
                System.out.println("Please enter the field that needs to be updated");
                System.out.println("3)Name\n5)Age\n7)Company-Name\n9)Designation\n11)Salary\n13)Address\n15)Phone Number");
                num = scanner.nextInt();
                System.out.println("Enter Value:");
                String name = scanner.next();
                csvBody.get(i)[num] = name;
                System.out.println("Userdata Updated");
            }
        }
        if(count==0){
            System.out.println("UserId does not match, Enter proper UserId");
            updateUserData();
        }
        try {
            reader.close();
        } catch (IOException e) {
        }
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter("src\\UserDatabase.csv"),',');
        } catch (IOException e) {
        }
        writer.writeAll(csvBody);
        try {
            writer.flush();
        } catch (IOException e) {
        }
        try {
            writer.close();
        } catch (IOException e) {
        }
        finally {
            login.choices();
        }
        displayUser.displayUserData();
    }
}
