package com.fbaa.java.parallelstream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);//500500
        //480496
        //487944
        //478872
        System.out.println(sum.getTotal());
    }
}
