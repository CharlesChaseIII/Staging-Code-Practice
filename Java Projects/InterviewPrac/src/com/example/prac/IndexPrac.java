package com.example.prac;

public class IndexPrac {
	
	public void StringCompressor(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			
			while (i < str.length() - 1 && 
				 str.charAt(i) == str.charAt(i + 1) ) {
				count++;
				i++;
			}
			
			if (count == 1) {
				System.out.print(str.charAt(i) + "1");
			} else {
				System.out.print(str.charAt(i));
				System.out.print(count);
			}
		}
	}
	
	public void BinConvert(long num) {

		  /*int iterVar;
		  
		  int sum = 0;

		  for (iterVar = 0; iterVar < num.length; iterVar++) {

		   sum = num[iterVar] / 2;

		   sum /= 2;*/
		   
		  long iterVar;
		  
		  System.out.print("0");

		  for (iterVar = 1 << 30; iterVar > 0; iterVar = iterVar/2) {

		   if ((num & iterVar) != 0) {
			   System.out.print("1");
		   } else {
			   System.out.print("0");
		   }

		   

		  }
		  
		  //return sum;

		 }

	public char findIndex(String str, int num) {
	
		
		return str.charAt(num);
	
	}
	
	public static void main(String[] args) {
		
		IndexPrac prac = new IndexPrac();
		
		//String myName =  "Charles";
		
		//int num2 = 3;
		
		//System.out.println(prac.findIndex(myName,num2 ));
		
		/*int i = 0;
		
		while (i < 5) {
			if (i == 0) System.out.print(0);
			
			i++;
			
			System.out.print((i > 2 ? 1 : 2));
		}*/
		
		//for (byte i = 0; i < 5; i++) {
			//System.out.print(i);
		//}
		
		/*String x = "bob";
		
		String y = x;
		
		String b = new String("bob");
		
		String a = "bob";
		
		if (x==y) System.out.print("1");
		if (x==b) System.out.print("2");
		if (x==a) System.out.print("3");*/
		
		//char a = 'a';
		//a += 5;
		//System.out.println(a);
		
		//Integer i = new Integer(0);
		
		//if (i==0) System.out.print("=");
		//if (i!=0) System.out.print("!");
		
		//int[] numArray = { 3,2,6};
		
		//int numVal = 4;
		
		//prac.BinConvert(70);
		
		String multiChars = "ccccchhhhhhaaaattttlllleeessss";
		prac.StringCompressor(multiChars);
	}
	
}
