package com.codingtest.test;

import java.util.Arrays;

public class test10 {

	public static void main(String[] args) {
		// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
		// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
		int x = 2;
		int n = 5;
		
		System.out.println(solution(x,n));
		
		x = 4;
		n = 3;
		
		System.out.println(solution(x,n));
		
		x = -4;
		n = 2;
		
		System.out.println(solution(x,n));
	}

	public static String solution(int x, int n) {
		long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return Arrays.toString(answer);
    }
}
