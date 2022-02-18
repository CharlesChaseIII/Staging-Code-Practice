package rev.com.prac;
import rev.com.prac.ThreadPractice;


public class ThreadApplication extends Thread{
	
	//public ThreadPractice lastInd;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadApplication thread = new ThreadApplication();
		
		thread.start();
		
		ThreadPractice lastEle = new ThreadPractice();
		
		int[] nums = {12,25,68,70,100};
		
		System.out.println(lastEle.getLastElement(nums));
		
		
	}
	
	public void run() {
		
		ThreadPractice lastInd = new ThreadPractice();
		
        int[] difNums = {12,25,68,70,200};
		
		System.out.println(lastInd.getLastElement(difNums));
		
		
	}

}
