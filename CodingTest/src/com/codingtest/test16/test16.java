package com.codingtest.test16;

public class test16 {

	public static void main(String[] args) {
		// 전화번호가 문자열 phone_number로 주어졌을 때, 
		// 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
		
		String num = "01033334444";
		
		System.out.println(solution(num));
		
		num = "027778888";
		
		System.out.println(solution(num));
	}

	public static String solution(String num) {
		String answer = "";
		
		for(var i = 0; i < num.length() - 4; i++){
	        answer += "*";
	    }
	    
	    answer += num.substring(num.length() - 4);
		
		return answer;
    }
}
