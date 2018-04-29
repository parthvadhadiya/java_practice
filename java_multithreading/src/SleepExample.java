/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
public class SleepExample extends Thread {
    public void run(){
        for(int i=1; i<5; i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String arg[]){
        SleepExample obj = new SleepExample();
        SleepExample obj2 = new SleepExample();
        
        obj.start();
        obj2.start();
    }
}
