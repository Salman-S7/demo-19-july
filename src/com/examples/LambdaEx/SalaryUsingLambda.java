package com.examples.LambdaEx;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class SalaryUsingLambda {
    public static void main(String[] args) {
        List<Double> l = asList(23000.3,5400.44,222000.44,500005.5,340000.1,230000.55);
        //printing all elements
        l.stream().forEach(m-> System.out.println(m));

        System.out.println("salary after bonus");
        l.stream().filter(m->m<20000.0).forEach(m-> System.out.println(m+5500));

        System.out.println("salary after deduction of 10%");
        l.stream().filter(m->m>=50000.00).forEach(m-> System.out.println(0.9*m));

        // Comparator<Double> d = Comparator.reverseOrder();
        Comparator<Double> d = (d1,d2)->{
            return d2.compareTo(d1);
        };
        l.sort(d);
        System.out.println("salaries after sorting are"+l);

        System.out.println("max is "+l.get(0));
        System.out.println("min is "+ l.get(l.size()-1));

        System.out.println("Total sum of salary is: "+ l.stream().reduce(0.0,(sum,sal)-> sum + sal));


        /*sum = 0;
        for(int i = 0; 2;i++){
        sum = sum + sal;
        }
         */



    }
}
