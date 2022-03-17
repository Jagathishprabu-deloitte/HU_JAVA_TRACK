package collection_assignment2;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(2);
        for(int i = 1 ; i < 3 ; i++){
            System.out.println("Enter String "+i+" : ");
            list.add(scanner.next());
        }
        char[] char1 = list.get(0).toLowerCase().toCharArray();
        char[] char2 = list.get(1).toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}
