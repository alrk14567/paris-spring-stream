package com.joeunseo.hotel.lambda;

import java.util.function.BiFunction;

import lombok.RequiredArgsConstructor;

public class CalculatorLambda {

        @RequiredArgsConstructor enum Operation{
        PLUS("+", (x, y)->(x + y)),
        MINUS("-", (x, y)->(x - y)),
        MULTI("*", (x, y)->(x * y)),
        DIVIDE("/", (x, y)->(x / y)),
        ;
        private final String opcode;
        private final BiFunction<Integer, Integer,Integer> f;
        @Override public String toString() { return opcode;}
        public int apply(int a, int b){return f.apply(a, b);}
    }
    
/** 위의 코드를 실행하는 예제 소스
    @Test
    void calculatorTest(){
        System.out.println("+: "+Operation.PLUS.apply(7, 5));
        System.out.println("-: "+Operation.MINUS.apply(7, 5));
        System.out.println("*: "+Operation.MULTI.apply(7, 5));
        System.out.println("/: "+Operation.DIVIDE.apply(7, 5));
    }
        */
    
}
