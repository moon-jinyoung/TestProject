package com.codingtest.test;

import java.util.*;

public class test7 {

	public static void main(String[] args) {
		// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 
		// 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
		// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
		String str = "pPoooyY";
		
		System.out.println(solution(str));
		
		str = "Pyy";
		
		System.out.println(solution(str));
	}

	public static boolean solution(String str) {
		 boolean answer = true;
		 
		 str = str.toLowerCase();
		 
		 int pNum = 0, yNum = 0;
		 
		 for(int i = 0; i < str.length(); i++) {
			 if(str.charAt(i) == 'p') {
				 pNum++;
			 }else if(str.charAt(i) == 'y') {
				 yNum++;
			 }
		 }

		 if(pNum != yNum) {
			 answer = false;
		 }
		 
         return answer;
    }
}
