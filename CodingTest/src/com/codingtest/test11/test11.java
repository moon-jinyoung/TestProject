package com.codingtest.test11;

public class test11 {

	public static void main(String[] args) {
		// 함수 solution은 정수 n을 매개변수로 입력받습니다. 
		// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
		// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		int n = 118372;
		
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		char[] numbers = Integer.toString(n).toCharArray();
	    String strSort = "";

	    if(n <= 0) return 0;

	    for(int i = 0; i < numbers.length; i++) {
	      for(int j = 0; j < i; j++) {
	        if(numbers[i] - 48 > numbers[j] - 48) {
	          char temp = numbers[i];
	          numbers[i] = numbers[j];
	          numbers[j] = temp;
	        }
	      }
	    }
	    strSort = new String(numbers);

	   return Integer.parseInt(strSort);
    }
}
