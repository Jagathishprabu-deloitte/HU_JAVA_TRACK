package collection_assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        while(true)
        {
            String str=scanner.next();
            if(str.equals("0")){
                break;
            }
            list.add(str);
        }
        List<String> newlist = list;
        Collections.reverse(newlist);
        newlist.forEach(System.out::println);
    }
}
