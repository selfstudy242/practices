package com.threds.trails;

public class Multi extends Thread{  
public void run(){ //throws IllegalThreadStateException{  
try {
	
} catch (IllegalThreadStateException e) {
	// TODO Auto-generated catch block
	System.out.println(e);
	//e.printStackTrace();
}
	System.out.println("thread1 is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();
t1.start();
 }  
}  

