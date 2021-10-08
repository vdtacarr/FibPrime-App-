package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci extends AsalMi {


    public Integer[] fibonacci(int sayi) {
        List<Integer> numbersList = new ArrayList<>();
        Integer minmax[] = {0,0};
        Boolean response;
        int first = 0, second = 1, fib;
        numbersList.add(first);
        numbersList.add(second);

        for(int i = 2; i < sayi; i++) {
            fib = second + first;
            first = second;
            second = fib;
            if (fib > 500000 && asalmi(fib) == true) {
                minmax[0] = fib;
                break;
            }
            else if(fib < 500000 && asalmi(fib) == true){
               minmax[1] = fib;
            }
        }
        return minmax;
    }
}
