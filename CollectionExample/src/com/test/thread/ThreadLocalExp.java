package com.test.thread;

 class MyRunnable implements Runnable    
{   
    private ThreadLocal<Integer> threadLocal =   
           new ThreadLocal<Integer>();   
   @Override   
    public void run() {   
        threadLocal.set( (int) (2 * 50D) );   
        try    
        {   
            Thread.sleep(1000);   
        } catch (InterruptedException e) {   
        }   
        System.out.println(threadLocal.get());   
    }   
}
public class ThreadLocalExp   
{   
    
      
   public static void main(String[] args)    
   {   
       MyRunnable runnableInstance = new MyRunnable();    
       Thread t1 = new Thread(runnableInstance);   
       Thread t2 = new Thread(runnableInstance);   
      // this will call run() method    
       t1.start();   
       t2.start();   
   }   
} 
