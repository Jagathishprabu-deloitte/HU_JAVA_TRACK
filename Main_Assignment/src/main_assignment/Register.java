package main_assignment;

import exception.InvalidException;
import exception.Validator;

import java.io.*;
import java.util.Scanner;

public class Register {
    public void register(){
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        Main user = new Main();
        System.out.println("---Welcome to Registration Page---");
        System.out.println("Enter Username:- ");
        String username = scanner.next();
        String file="src\\StudentRegister.csv";
        BufferedReader reader=null;
        String line="";
        try {
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(row[0].equals(username)){
                    System.out.println("Username already Registered");
                    System.out.println("Login or Register again");
                    register();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Enter Password:- ");
        String password = scanner.next();
        try {
            validator.passcheck(password);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
            System.out.println(e.message());
            System.out.println("---Enter valid Password---");
            register();
        }
        System.out.println("Re-enter Password:- ");
        String confirmpassword = scanner.next();
        if(!(password.equals(confirmpassword))){
            System.out.println("***Both passwords should be same***");
            register();
        }
        else{
            saveRegister(username,password);
            System.out.println("Registration Successful");
            user.choices();
        }
    }
    public void saveRegister(String username,String password){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("src\\StudentRegister.csv",true));
            writer.write(username);
            writer.write(",");
            writer.write(password);
            writer.write("\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
