package com.codingtest.test5;

public class test5 {

	public static void main(String[] args) {
		//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
		//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
		int number = 121;
		
		System.out.println(solution(number));
		
		number = 3;
		
		System.out.println(solution(number));
	}

	public static int solution(int n) {
		long answer = 0;
		for(long i=0;i*i<=n;i++){
	        if(i*i==n){
	            answer =(i+1)*(i+1);
	        }else
	            answer =-1;
	    }
	    return (int) answer;
    }
}