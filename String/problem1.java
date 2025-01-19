// Write a Java program to pass the string “Have a nice day!” from the command line, and
// display each word in a new line. Use proper import statement for this program.

package String;

// import java.util.StringTokenizer;

public class problem1 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("please enter a valid input");
            return ;
        }

        String input =args[0];
       String[] words = input.split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
}
