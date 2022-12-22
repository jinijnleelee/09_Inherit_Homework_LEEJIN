package com.hw3.run;



import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		
		Product sam = new Product("Samsung","Galaxy S9",
				"Blue",960000);
		Product lg = new Product("LG","G6",
				"Red",820000);

		
		
		
		System.out.println("생산한 첫 번째 객체의 값 : " +sam.toString() );
		System.out.println("생산한 두 번째 객체의 값 : " +lg.toString() );
		System.out.println("===================================");
		System.out.println("생성한 두 객체의 값이 같은가 : " + sam.equals(lg) );
		System.out.println("===================================");
		System.out.println("첫 번째 객체의 해쉬코드 값 : " +sam.hashCode() );
		System.out.println("두 번째 객체의 해쉬코드 값 : " +lg.hashCode());
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
