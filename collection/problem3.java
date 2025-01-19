// Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
// each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
// printed in ascending sorted order.]
package collection;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input :");
        String input = sc.nextLine();

      StringTokenizer tokenizer  = new StringTokenizer(input); // the main function of tokenizer is to spit the input 
      TreeSet<String> treeSet = new TreeSet<>();

      while(tokenizer.hasMoreTokens()){
        treeSet.add(tokenizer.nextToken());

    }
    for(String token: treeSet){              //treeset is always sorted in nature
        System.out.println(token);
    }
    }
}
