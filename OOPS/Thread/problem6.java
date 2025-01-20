// 8. Write a program, which will create a deadlock.

package OOPS.Thread;

public class problem6 {
    public static void main(String[] args) {
        final String resource1 = "Ram";
        final String resource2 = "Rahim";

        Thread t1 = new Thread() {  
            public void run() {  
                synchronized (resource1) {  
                 System.out.println("Thread 1: locked resource 1");  
        
                 try { Thread.sleep(100);} catch (Exception e) {}  
        
                 synchronized (resource2) {  
                  System.out.println("Thread 1: locked resource 2");  
                 }  
               }  
            }  
          };  
        
         Thread t2 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 2 : locked resource 1");
                    try{Thread.sleep(100);}catch(Exception e){}
                }
                synchronized(resource2){
                    System.out.println("Thread 2 : locked resource 2");
                }
            }
         } ;

         t1.start();
         t2.start();
}
}
