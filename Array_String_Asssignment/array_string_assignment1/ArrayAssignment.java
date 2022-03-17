package array_string_assignment1;
import java.util.Scanner;
public class ArrayAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i < len; i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i < len; i++){
            for(int j = i; j < len; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
