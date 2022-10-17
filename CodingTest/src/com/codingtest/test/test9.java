package com.codingtest.test;

import java.util.*;

public class test9 {

	public static void main(String[] args) {
		// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
		
		String x = "1234";
		
		System.out.println(solution(x));
		
		x = "-1234";
		
		System.out.println(solution(x));
	}

	public static int solution(String x) {
		 int answer = 0;
		 
		 answer = Integer.valueOf(x);
		 
         return answer;
    }
}
