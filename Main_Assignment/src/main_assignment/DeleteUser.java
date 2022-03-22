package main_assignment;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class DeleteUser {
    public static void deleteUserData(){
        Scanner scanner=new Scanner(System.in);
        Login login = new Login();
        DisplayUser displayUser = new DisplayUser();
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
        for(int i=0;i<csvBody.size();i++) {
            String[] strArray = csvBody.get(i);
            if(strArray[1].contains(str)){
                count++;
                csvBody.remove(i);
            }
        }
        if(count==0){
            System.out.println("UserID not found, please Enter the correct UserID");
            deleteUserData();
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

