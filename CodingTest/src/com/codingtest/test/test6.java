package com.codingtest.test;

import java.util.*;

public class test6 {

	public static void main(String[] args) {
		//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		int number = 12345;
		
		System.out.println(solution(number));
	}

	public static String solution(int n) {
		 int[] answer = {};
		 List<Integer> a = new ArrayList<Integer>((int)(Math.log10(n)+1));
         String num = Long.toString(n);

         for(int i=num.length(); i >= 1; i--){
             a.add(Character.getNumericValue(num.charAt(i-1)));
         }

         int[] arr = new int[a.size()];
         for(int j=0; j<a.size(); j++){
             arr[j] = a.get(j);
         }

         return Arrays.toString(arr);
    }
}
