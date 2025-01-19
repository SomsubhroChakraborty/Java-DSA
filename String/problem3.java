package String;
// Write a program that takes a String from the user on the command-line and print it in
// reverse.“This is a test” must be printed as: “test a is This”.

public class problem3 {
    public static void main(String[] args) {
        String str = args[0];
        String splitString[] = str.split(" ");
        String reverse = " ";


        for(int i=splitString.length-1; i>=0; i--){
            reverse = reverse +splitString[i];
        }
        System.out.println(reverse);

    }
}

