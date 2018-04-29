/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
    class Simple{}  
      
    class Test{  
     public static void main(String args[]) throws ClassNotFoundException{  
      Class c=Class.forName("Simple");  
      System.out.println(c.getName());  
     }  
    } 
