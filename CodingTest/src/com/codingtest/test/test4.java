package com.codingtest.test;

public class test4 {

	public static void main(String[] args) {
		//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
		int number = 123;
		
		System.out.println(solution(number));
		
		number = 987;
		
		System.out.println(solution(number));
	}

	public static int solution(int n) {
	    int answer = 0;
	    
	    String[] arr = new String[String.valueOf(n).length()];
	    int a = 1;
	    
	    for(int i = 0; i < String.valueOf(n).length(); i++){
	        arr[i] = String.valueOf(n).substring(i, a++);
	        System.out.println(arr[i]);
	    }
	    
	    for(int i = 0; i < arr.length; i++){
	        answer += Integer.parseInt(arr[i]);
	    }
	    
	    return answer;
    }
}
