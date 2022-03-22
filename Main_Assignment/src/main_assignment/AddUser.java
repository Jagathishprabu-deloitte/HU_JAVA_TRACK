package main_assignment;

import exception.InvalidException;
import exception.Validator;

import java.io.*;
import java.util.*;

public class AddUser {
    static Scanner scanner = new Scanner(System.in);
    static Validator validator = new Validator();
    Login login = new Login();
    public void addUserData() {
        System.out.println("Enter values to be added:- ");
        String userId = addUserId();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        int age1=addAge();
        System.out.println("Company-Name: ");
        String companyName = scanner.nextLine();
        System.out.println("Designation: ");
        String designation = scanner.nextLine();
        int salary1=addSalary();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        long phoneNumber1=addphoneNumber();
        System.out.println("Added");
        saveUser(userId,name,age1,companyName,designation,salary1,address,phoneNumber1);
        System.out.println("User data added Successfully");
        System.out.println("----------------------------------------------------------------");
        login.choices();
    }
    public String addUserId(){
        System.out.println("User_ID:");
        String userId = scanner.next();
        scanner.nextLine();
        String file="src\\UserDatabase.csv";
        BufferedReader reader=null;
        String line="";
        try {
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(row[1].equals(userId)){
                    System.out.println("UserId already exists");
                    System.out.println("Enter new User Id");
                    addUserData();
                }
            }
        }catch (Exception e){
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return userId;
    }
    public int addAge() {
        System.out.println("Age: (Age should be greater than 18 and less than 90):-");
        int age = Integer.parseInt(scanner.next());
        scanner.nextLine();
        try{
            validator.agecheck(age);
        }
        catch(InvalidException e){
            System.out.println(e.getMessage());
            System.out.println(e.message());
            addUserData();
        }
        return age;
    }
    public int addSalary() {
        System.out.println("Salary: (Salary should be greater than 0):-");
        int salary = Integer.parseInt(scanner.next());
        scanner.nextLine();
        try{
            validator.salarycheck(salary);
        }
        catch (InvalidException e){
            System.out.println(e.getMessage());
            System.out.println(e.message());
            addUserData();
        }
        return salary;
    }
    public long addphoneNumber() {
        System.out.println("Phone Number: (Phone Number should be 10 digits):-");
        long phoneNumber = Long.parseLong(scanner.next());
        try{
            validator.phonenocheck(phoneNumber);
        }
        catch (InvalidException e){
            System.out.println(e.getMessage());
            System.out.println(e.message());
            addUserData();
        }
            return phoneNumber;
    }
    public void saveUser(String userId,String name,int age,String companyName,String designation,int salary,String address,long phoneNumber){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("src\\UserDatabase.csv",true));
            writer.write("User-ID: "+","+userId+","+"Name: "+","+name+","+"Age:"+","+age+","+"Company-Name: "+","+companyName+","
                    +"Designation: "+","+designation+","+"Salary: "+","+salary+","+"Address: "+","+address+","+"Phone Number:"+","+phoneNumber);
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
