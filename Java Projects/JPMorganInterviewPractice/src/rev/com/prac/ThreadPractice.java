package rev.com.prac;

public class ThreadPractice {

	public int getLastElement(int[] lastElement) {

		   int accumalator = 0;

		   for (int i = 0; i < lastElement.length; i++) {

		   accumalator = lastElement[i];

		   }

		   return lastElement[lastElement.length - 1];
		   
		 }
	
	
}
