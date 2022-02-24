package rev.com.prac;

public class StringCompressionPractice {

	public void stringCompressor(String str) {
		
		int strCount = str.length();
		
		int count = 1;
		
		for (int i = 0; i < strCount; i++) {
			
			while (i < strCount - 1 && 
				   str.charAt(i) == (str.charAt(i + 1))) {
				
				count++;
				i++;
			}
			
			if (count == 1) {
				System.out.println(str.charAt(i) + "1");
			} else {
				System.out.println(str.charAt(i) +""+ count);
				//System.out.println(count);
			}
		}
	}
	 
	  
}
