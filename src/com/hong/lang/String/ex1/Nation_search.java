package com.hong.lang.String.ex1;

import java.util.Scanner;

public class Nation_search {
	
	private Scanner sc;
	private Nation n=null;
	
	public Nation_search() {
		sc=new Scanner(System.in);
	}
	
	public Nation search(Nation[] nations){
		System.out.print("나라이름");
		String name=sc.next();
		for(Nation nation:nations){
			if(name.equals(nation.getName())){	//배열을 n에 하나씩 넣고
					n=nation;						//조건문으로 가기때문에 n으로 접근해야한다.
			}
			
		}
		
		return n;
	}

}
