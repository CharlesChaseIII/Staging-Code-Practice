package rev.com.prac;
import rev.com.prac.ThreadPractice;


public class ThreadApplication {
	
	//ThreadPractice lastInd;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPractice lastEle = new ThreadPractice();
		
		int[] nums = {12,25,68,70,100};
		
		System.out.println(lastEle.getLastElement(nums));
		
		System.out.println(runnable());
	}
	
	public static Runnable runnable() {
		
		ThreadPractice lastInd = new ThreadPractice();
		
        int[] difNums = {12,25,68,70,100};
		
		System.out.println(lastInd.getLastElement(difNums));
		
		Runnable run = null;
		
		return run;
	}

}
