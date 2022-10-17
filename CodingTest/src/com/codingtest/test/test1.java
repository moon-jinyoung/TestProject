package com.codingtest.test;

import java.util.Random;

public class test1 {

	public static void main(String[] args) {
		// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
		int num = (int)(Math.random() * 100);
		
		System.out.println(num);
		System.out.println(solution(num));
	}
	
	public static String solution(int num) {
        String answer = "";
        
        if(num % 2 == 1) {
        	answer = "Odd";
        }else {
        	answer = "Even";
        }
        
        //answer = num % 2 == 0 ? "Even" : "Odd";
        
        return answer;
    }
}
