package com.hong.s1;

public class String_test2 {
	
	public static void main(String[] args) {
		String s="iu";		//new 연산자로 접근이아닌 상수를 집어넣는개념
		String str="iu";	//heap영역에 iu상수가 처음만들어지면
							//나중에 상수대입시 같은 주소값을 참조하게된다.
	
		String str1=new String("iu");	//힙영역에 객체생성후 대입
		String str2=new String("iu");	//참조타입의 
		
		String str3=new String();
		String str4=new String();
		
		System.out.println(str1.equals(str2));//참조주소값이 가리키는 값이
												//참조대상의 값과 동일한지 비교한다.
		
		
		System.out.println(str1==str2);		//주소값이 같은지 비교
		System.out.println(str3.equals(str4));
		System.out.println(s==str1);	//false
		//주소값이 같은지 물을떄는 ==를 사용하고
		//참조변수의 해당값이 같은지 물어볼경우네는 equals()를사용한다.
		
		
		String s3="seoulhellow";
		// 해당 문자가 몇변 인덱스에 있는지
		// 문자열에 해당문자가 2개 중첩될경우 가장가까운 인덱스 만 출력한다.
		
		int count=0;
		int a=0;
		while(true){
			a=s3.indexOf('l',a);
			if(a!=-1){
				count++;
				a++;	//인덱스가 4이기떄문에 하나증가시켜서 대입
			}
			else{
				break;
			}
		}
		System.out.println(count);
		
		s3="LGNoteBooe";
		a=s3.indexOf("Note");
		System.out.println(a);
		
		String[] files= {"jpg","png","gif"};
		s3="suji.iu.gif";
		a=s3.lastIndexOf("gif");
		System.out.println(a);
		
		//9.47 8.98
		//9_47 8.98
		s3=s3.replace('.', '_');
		System.out.println(s3);
	}
	

}
