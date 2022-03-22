package main_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Welcome to Login Page---");
        System.out.println("Enter Username: ");
        String username = scanner.next();

        System.out.println("Enter Password: ");
        String password = scanner.next();
        String file="src\\StudentRegister.csv";
        BufferedReader reader=null;
        String line="";
        int count=0;
        try {
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(row[0].equals(username)){
                    count++;
                    if(row[1].equals(password)){
                        System.out.println("Login Successful");
                        choices();
                    }
                    else{
                        System.out.println("---Password did not match---");
                        System.out.println("Login Again");
                        login();
                    }
                }
            }
            if(count==0){
                System.out.println("Username not found, Please register again or try different Username");
                login();
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
    }
    public void choices(){
        Scanner scanner = new Scanner(System.in);
        Main user = new Main();
        AddUser addUser = new AddUser();
        DisplayUser displayUser = new DisplayUser();
        UpdateUser updateUser = new UpdateUser();
        DeleteUser deleteUser = new DeleteUser();
        System.out.println("******Welcome to User Database*******");
        System.out.println("1. Add User Data \n2.List User Data \n3.Update User Data \n4.Delete User Data \n5.Exit");
        System.out.println("Enter: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                addUser.addUserData();
                break;
            case 2:
                displayUser.displayUserData();
                break;
            case 3:
                updateUser.updateUserData();
                break;
            case 4:
                deleteUser.deleteUserData();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("---Enter Valid Choice---");
                choices();
        }
    }
}
