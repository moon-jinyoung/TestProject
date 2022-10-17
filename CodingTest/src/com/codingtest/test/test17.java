package com.codingtest.test;

import java.util.Arrays;

public class test17 {

	public static void main(String[] args) {
		// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
		// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		System.out.println(solution(arr, divisor));
		
		arr = new int[] {2, 36, 1, 3};
		divisor = 1;
		
		System.out.println(solution(arr, divisor));
		
		arr = new int[] {3,2,6};
		divisor = 10;
		
		System.out.println(solution(arr, divisor));
	}

	public static String solution(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return Arrays.toString(answer);
    }
}
