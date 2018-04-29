/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
public class Multi2 implements  Runnable {
    public void run(){
        System.out.println("thread is runnning...!");
        
    }
    public static void main(String arg[]){
        Multi2 obj = new Multi2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
    
}
