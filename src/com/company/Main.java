package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
       Fibonacci fib = new Fibonacci();
       int fark;
       Integer[] donus = fib.fibonacci(50);
       fark = donus[0] - donus[1];
       System.out.println("max : "+donus[0]+ ", min : " + donus[1]);
       System.out.println("Fark : " + fark);
    }

    }

