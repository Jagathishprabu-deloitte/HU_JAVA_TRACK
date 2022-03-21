package exception_handling_1;

import java.util.Scanner;

public class Arithmetic extends Throwable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred. Zero is not a valid input for B");
        }
        finally{
            System.out.println("Thank You");
        }
    }
}
