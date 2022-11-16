package com.mp;

public class WaitAndNotifyDemo {
    public static void main(String[] args){
        ThreadOne obj = new ThreadOne();
        obj.start();
        synchronized(obj){
            try{
                System.out.println("Waiting...");
                obj.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is: " + obj.total);
        }
    }
}
class ThreadOne extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<10 ; i++){
                total += i;
            }
            notify();
        }
    }
}
