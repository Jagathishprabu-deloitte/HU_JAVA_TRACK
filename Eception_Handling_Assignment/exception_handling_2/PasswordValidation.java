package exception_handling_2;

import java.util.Scanner;

import static exception_handling_2.Validator.valid;

public class PasswordValidation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        try {
            valid(password);
            System.out.println("Valid Password");
        }
        catch (InvalidException e){
            System.out.println(e.getMessage());
            System.out.println(e.message());
        }
    }
}
