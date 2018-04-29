/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parth
 */
public class class_exa {

    void print() {
        System.out.println("hello");
    }

    public static void main(String arg[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("class_exa");
        class_exa obj = (class_exa) c.newInstance();
        obj.print();
    }
}
