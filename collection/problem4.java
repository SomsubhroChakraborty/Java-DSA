package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name : ");
        while(true){
            String inputname = sc.nextLine();
            if(inputname.equals("exit")) break;
            if(!list.contains(inputname)){
                list.add(inputname);
            }
        }
        System.out.println("Enter a name for search");
        String searchname = sc.nextLine();
        if(list.contains(searchname)){
            System.out.println("It is in the list . ");
        }
        else{
            System.out.println("Not in the list . ");
        }
    }
}
