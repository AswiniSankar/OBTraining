package com.corejava.assignments.day8.threads;

public class SuspendThread extends Thread {
	public synchronized void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		  // creating three threads   
        SuspendThread t1=new SuspendThread ();    
        SuspendThread t2=new SuspendThread();   
        SuspendThread t3=new SuspendThread();   
        // call run() method   
        t1.start();  
     
        t2.start();  
        // suspend t2 thread   
       t2.suspend(); 
        // call run() method   
        
        t3.start();  
	}

}
