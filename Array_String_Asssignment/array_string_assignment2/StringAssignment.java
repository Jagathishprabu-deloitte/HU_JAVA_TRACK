package array_string_assignment2;

import java.util.*;

public class StringAssignment {


    private static String shuffle(String str1, String str2, String str3) {
        int i=0,j=0,k=0;
        if(str1.length()+str2.length() != str3.length()){
            return "Invalid Shuffle";
        }
        while(k < str3.length()){
            if( i < str1.length() && str1.charAt(i) == str3.charAt(k)){
                i++;
            }
            else if(j < str2.length() && str2.charAt(j)==str3.charAt(k)){
                j++;
            }
            else{
                return "Invalid Shuffle";
            }
            k++;
        }
        if(!(i==str1.length() && j==str2.length() && k==str3.length())){
            return "Invalid Shuffle";
        }
        return "Valid Shuffle";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println(shuffle(str1,str2,str3));
    }
}
