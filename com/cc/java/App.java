package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29, true);

        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));

        for (int i = 0; i < 4; i++) {
            try {
                output(Integer.toString(cat.getAge()));  
            } catch (Exception e) {
                output(e.toString());
            } 
        }
                
        output("-------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35, false);

        output(cat2.getStringAttributes("#name"));
        output(cat2.getStringAttributes("#color"));

        try {
           output(Integer.toString(cat2.getAge()));  
        } catch (Exception e) {
            output(e.toString());
        }
        

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

