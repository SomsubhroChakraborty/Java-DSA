// Write a Java class called CountAndPrintArgs to print the number of arguments passed on
// the command-line as well as the 1st letter of the arguments. For example, if the command
// line arguments are: “Mango Cucumber Apple” then the output will be
// No. of arguments – 3 MCA
// Write a main method to test the class.


package String;

class CountAndPrintArgs{
  int CountArgs(String[] args){
    return args.length;
  }

  String FirstLetters(String[] args){
    StringBuilder firstletter = new StringBuilder();
    for(String arg : args){
      firstletter.append(arg.charAt(0));
    }
    return firstletter.toString();
  }
} 

 
public class problem2 {
  public static void main(String[] args) {
    
    CountAndPrintArgs str = new CountAndPrintArgs();
    System.out.println(str.CountArgs(args)+ " " + str.FirstLetters(args));
   
  }
}
  
  
  

