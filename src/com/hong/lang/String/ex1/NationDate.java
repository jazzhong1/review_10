package com.hong.lang.String.ex1;

public class NationDate {
	
	public Nation[] makeNation() {
	String nation="Norway 14 14 11 "
			+ "German 10 10 7 "
			+ "Canada 11 8 10 "
			+ "USA 9 8 6 "
			+ "Korea 5 8 4 ";
	
	String[] ar=nation.split(" ");
	int index=ar.length/4;
	Nation[] nations=new Nation[index];
	
	int a=0;
	for (int i = 0; i < nations.length; i++) {
		nations[i]=new Nation();
		nations[i].setName(ar[a]);
		a++;
		nations[i].setGold(ar[a]);
		a++;
		nations[i].setSilver(ar[a]);
		a++;
		nations[i].setBronze(ar[a]);
		a++;
	}
	
	return nations;
	}
}
