// Write a program to sort a list of strings using multithreading. Create one of the threads
// that take a string as input from the user, another thread that sorts the strings and finally
// another thread that displays the sorted list of strings. Each of the input, sort, and display
// methods is to be synchronized.
package OOPS.Thread;

import java.util.Scanner;

class Sharedresource{
    private String[] strings = new String[100];
    private int count =0;

    //thread for add string
    public synchronized void addString(String str){
        if(count<strings.length){
            strings[count++] = str;
            System.out.println(" Added " + str);
        }
        else{
            System.out.println("Array is full");
        }
    }

    //thread for sorting
    public synchronized void sortString(){
        for(int i=0 ; i<strings.length-1;i++){
            for(int j=0 ; j<strings.length-i-1 ; j++){
                if(strings[j].compareTo(strings[j+1]) < 0){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }
        System.out.println("sorted");
    }

    //displaty thread
    public synchronized void display(){
        System.out.print("Sorted Strings: ");
        for (int i = 0; i < count; i++) {
            System.out.print(strings[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println();
    }
}

public class problem2 {
    
    public static void main(String[] args) {
        Sharedresource sharedresource = new Sharedresource();
        
        Thread inputThread = new Thread(()->{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");
            while(true){
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("exit")) break;
                sharedresource.addString(input);
            }
        });

        Thread sortthread = new Thread(()->{
            try{
                inputThread.join();
                sharedresource. sortString();
            }catch(InterruptedException e){
System.out.println("InterruptedException");
            }
        });
//display thread
Thread displaythread = new Thread(()->{
    try {
        sortthread.join();
        sharedresource.display();
    } catch (InterruptedException e) {
       System.out.println("InterruptedException");
    }
   
});
        
inputThread.start();
sortthread.start();
displaythread.start();
    }
}
