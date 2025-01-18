package OOPS.Inheritance;


class Staff{
String name;
String code;
public Staff(String name , String code){
    this.name = name;
    this.code = code;
}

public void info(){
    System.out.println("Name is :" + name + "Code is" + code);
}
}
//teacher
class Teacher extends Staff{
    String subject;
    String publication;

  public Teacher(String name , String code,String subject, String publication){
    super(name,code);

    this.subject = subject;
    this.publication = publication;
}
@Override
public void info(){
    super.info();
    System.out.println("subject is :" + subject + "publication is" + publication);
}  
}
//Officer
class Officer extends Staff{
    String grade;
    

  public Officer(String name , String code,String grade){
    super(name,code);

    this.grade = grade;
   
}
@Override
public void info(){
    super.info();
    System.out.println("Grade is :" + grade );
}  
}
//Typist
class Typist extends Staff{
    int speed;
    

  public Typist(String name , String code,int speed){
    super(name,code);
    this.speed = speed;
   
}
@Override
public void info(){
    super.info();
    System.out.println("Speed is :" + speed );
}  
}

//RegularTypist
class RegularTypist extends Typist{
    int remuneration;
    

  public RegularTypist(String name , String code,int speed,int remuneration){
    super(name,code,speed);

    this.remuneration = remuneration;
   
}
@Override
public void info(){
    super.info();
    System.out.println("remuneration is :" + remuneration );
}  
}

class CasualTypist extends Typist{
    int daily_wages;
    

  public CasualTypist(String name , String code,int speed,int daily_wages){
    super(name,code,speed);

    this.daily_wages = daily_wages;
   
}
@Override
public void info(){
    super.info();
    System.out.println("Daily wages is : " + daily_wages );
}  
}
public class problem4 {
    public static void main(String[] args) {
        System.out.println("teacher details");
        Staff teacher = new Teacher(" amar " ," A00 "," physics "," parul ");
        teacher.info();
        System.out.println("Officer details");
        Staff officer = new Officer(" kamal ", " A21 ", " A ");
        officer.info();
        System.out.println("Typist details");
        Staff typist = new Typist(" amal "," 22q ",140);
        typist.info();
    }
}
