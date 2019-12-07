package com.kodilla.test;

public class Test {
    public int add(int a, int b){
        return a + b;
    }
    public int subtract (int a, int b){
        return a - b;
    }
}

class Application{
    public static void main (String[]args){
        Test test =new Test();
        System.out.println(test.add(2,2));
        System.out.println(test.subtract(6,2));
    }
}
