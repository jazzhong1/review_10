package com.hong.lang.String.ex1;


public class NationView {
	
	public void view(Nation[] nations){

		for (Nation nation:nations) {
			System.out.println("=======================");
			System.out.println("나라:"+nation.getName());
			System.out.println("금메달:"+nation.getGold());
			System.out.println("은메달:"+nation.getSilver());
			System.out.println("동메달:"+nation.getBronze());
		}
		
	}
	
	public void view(Nation nation){

			System.out.println("=======================");
			System.out.println("나라:"+nation.getName());
			System.out.println("금메달:"+nation.getGold());
			System.out.println("은메달:"+nation.getSilver());
			System.out.println("동메달:"+nation.getBronze());
		
	}

}
