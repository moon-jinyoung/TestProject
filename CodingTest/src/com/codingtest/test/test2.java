package com.codingtest.test;

public class test2 {

	public static void main(String[] args) {
		//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		int num = (int)(Math.random() * 3000);
		
		System.out.println(num);
		System.out.println(solution(num));
	}

	public static int solution(int num) {
		int answer = 0;
	    
	    for(int i = 1; i <= num; i++){
	        if(num % i == 0){
	        	System.out.println("약수:" + answer);
	            answer+=i;
	        }
	    }
	    return answer;
    }
}
