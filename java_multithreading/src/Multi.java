/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
public class Multi extends Thread{
    public void run(){
        System.out.println("thread is runnning");
    }
    public static void main(String args[]){
        Multi obj = new Multi();
        obj.start();
    }
}
