package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9 {

    static int factorial(int n) {
       
        int fact = 1;
        
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        return fact;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
