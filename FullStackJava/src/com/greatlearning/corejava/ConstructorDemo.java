package com.greatlearning.corejava;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("I am default constructor");
    }
    public ConstructorDemo(int i, float f, String s, char c){
        System.out.println("I am parameterized constructor");
        System.out.println("Squares, int: " + i*i + "float: " + f*f);
        System.out.println("String: "+ s);
        System.out.println("Char: "+ c);
    }

    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo();
        ConstructorDemo c2 = new ConstructorDemo(10,3.14f, "Pranav", 'X');
    }
}
