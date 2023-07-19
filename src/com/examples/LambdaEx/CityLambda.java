package com.examples.LambdaEx;

import java.util.Arrays;
import java.util.List;

public class CityLambda {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("pune","ahmednagar","ahmadabad","kolkata","bhopal","chandigarh");
      //  l.stream().filter(s->s.matches("^[abcABC].*")).forEach(s-> System.out.println(s));

        l.forEach(s->{if(s.matches("^[abcABC].*")){System.out.println(s);}});

       //l.forEach(s->System.out.println(s));
       // l.stream().forEach(s->System.out.println(s));

    }
}