package com.hong.s1;

public class String_test3 {
	public static void main(String[] args) {
		String s= "iu,suji,choa,hani";
		
		String[] a=s.split(",");
		
		for(String b:a){			//향상for문 배열의 길이 만큼 알아서 들어간다.
									//배열에서 하나를 뽑아 사용할때 
									//인덱스로 접근하지 못하는 아쉬움
			System.out.println(b);
		}

	}

}
