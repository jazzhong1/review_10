package com.hong.lang.String;

public class String_test1 {
	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
									//String클래스의 멤버 상수
		
		String ja="java";
		char a=ja.charAt(1);	//인덱스번호로 원하는 문자 추출
								//주민등록번호 활용시 좋음
		System.out.println(a);	
		
		System.out.println(ja.concat(" Programming"));
	}
}
