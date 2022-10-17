package com.codingtest.test;

public class test3 {

	public static void main(String[] args) {
		//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		int[] arr = {1,2,3,4};
		
		System.out.println(solution(arr));
		
		arr = new int[] {5,5};
		
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
	    double answer = 0;
	    
	    for(int i = 0; i < arr.length; i++){
	        answer += arr[i];
	    }
	    
	    answer = answer/arr.length;
	    
	    return (int) answer;
    }
}
