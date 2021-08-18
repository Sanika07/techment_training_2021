package javaCodingTest;

public class StringQues_1_to_2 {

	//Question - 01
	public String repeatFront(String str, int n) {

	     String input=str.substring(0,n);
	     for(int i=1;i<n;i++)
	     {
	            input=input+str.substring(0,n-i);
	     }
	     return input;
	}
	
	     //Question - 02
	     public String repeatEnd(String str, int n)
	     {
	    	 int len = str.length();
	    	 String word = "";
	    	 for (int i = 0; i < n; i++)
	    	 {
	    		 word += str.substring(len - n, len);
	    	 }
	    	 return word;
	     }

	     public static void main(String[] args) {
			
	    	 StringQues_1_to_2 word = new StringQues_1_to_2();
	    	 System.out.println(word.repeatFront("chocolate", 5));
	    	 System.out.println(word.repeatFront("chocolate", 3));
	    	 System.out.println(word.repeatFront("chocolate", 2));
	    	 System.out.println(word.repeatEnd("hello", 4));
	    	 System.out.println(word.repeatEnd("hello", 3));
	    	 System.out.println(word.repeatEnd("hello", 2));
		}
}
