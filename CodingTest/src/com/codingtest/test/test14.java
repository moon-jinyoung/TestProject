package com.codingtest.test;

public class test14 {

	public static void main(String[] args) {
		// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		// 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		
		int a = 3;
		int b = 5;
		
		System.out.println(solution(a,b));
		
		a = 3;
		b = 3;
		
		System.out.println(solution(a,b));
		
		a = 5;
		b = 3;
		
		System.out.println(solution(a,b));
	}

	public static int solution(int a, int b) {
		int answer = 0;
		
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
		    answer += i;
		}
		
		return answer;
    }
}
