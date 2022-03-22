package main_assignment;

import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        choices();
    }
    public static void choices(){
        Scanner scanner =new Scanner(System.in);
        Login lg = new Login();
        Register rt = new Register();
        System.out.println("******Welcome to User Database*******");
        System.out.println("1.Login \n2. Registration");
        System.out.println("Enter: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                lg.login();
                break;
            case 2:
                rt.register();
                break;
            default:
                System.out.println("---Enter Valid Choice---");
                choices();
        }
    }
}
