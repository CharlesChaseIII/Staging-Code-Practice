package com.rev.chall;

import java.util.ArrayList;
import java.util.List;

public class FibonnachiSequence {
	
	List<Integer> fibSeq = new ArrayList<Integer>();
	
	List<Integer> evenFibSeq = new ArrayList<Integer>();

    int accumulator = 0;
    int finalAccum = 0;
    
    //public void fibSeqTest() {
    	//fibSeqGenerator(4000000);
   // }
    
	public void fibSeqGenerator(int num) {
		
		fibSeq.add(1);

		fibSeq.add(2);

	  for (int i = 0; i < num; i++) {
	   
	   accumulator = fibSeq.get(i) + fibSeq.get(i + 1);

	   fibSeq.add(accumulator);
	   
	   //System.out.println(fibSeq.get(i));
	   
 int currentNum = fibSeq.get(i);

 
	    if( currentNum % 2 == 0 && currentNum < 4000000) {
	     
	    	//evenFibSeq.add(fibSeq.get(i));
	    	finalAccum += currentNum;
	    	
	    }
	   
	    /*if( accumulator % 2 == 0) {
		     
	       System.out.println(accumulator);
	   
	    }*/

	   }
	  
	  System.out.println(finalAccum);

	  }

}

