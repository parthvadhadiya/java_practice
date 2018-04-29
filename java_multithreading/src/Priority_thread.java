/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
public class Priority_thread extends Thread {
    public void run(){
        System.out.println("thread name is: "+Thread.currentThread().getName());
        System.out.println("thread priority: "+Thread.currentThread().getPriority());
        
    }
    Priority_thread obj = new Priority_thread();
    Priority_thread obj1 = new Priority_thread();
    obj.setPriority(Thread.MIN_PRIORITY);
    
    
}
