package com.threadExample;

class MyThread3 implements Runnable 
{
    public void run()
    {

        for(int i=0;i<=100;i++){
            if((i%2)==0){
                System.out.println(i);
            }
            try{
            Thread.sleep(100);
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
    }

public class Thread3
{
    public static void main(String [] args){
     MyThread3 t1=new MyThread3();
     Thread t = new Thread( t1);
     t.start();

    }
}
}
