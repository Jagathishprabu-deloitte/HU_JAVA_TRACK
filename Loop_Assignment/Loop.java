package loop_assignment;

import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int space = num-1;
        int star = 1;
        for(int i = 0 ; i < num ; i++){
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }
            space--;
            for(int k = 0 ; k < star ; k++){
                System.out.print("*");
            }
            star++;
            System.out.println();
        }
        space = space + 2;
        star = star - 2;
        for(int i=0 ; i < num ; i++){
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }
            space++;
            for(int k = 0 ; k < star ; k++){
                System.out.print("*");
            }
            star--;
            System.out.println();
        }
    }
}
