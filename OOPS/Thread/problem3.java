package OOPS.Thread;

class Mythread1 extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(this.getName());
            }
            catch(Exception e){};
        }
    }
}
public class problem3 {
    public static void main(String[] args) {
        Mythread1 ping = new Mythread1();
        Mythread1 pong = new Mythread1();
        ping.setName ("Ping");
        pong.setName ("Pong");

        ping.start();
        pong.start();
    }
}


