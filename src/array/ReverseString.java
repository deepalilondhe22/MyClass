package array;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		 

		
				String s="OPPO";
				//String s='Maharashtra'
				
				String temp="";
				
				for(int i=s.length()-1;i>=0;i--) {
                
					
					
					
					
					temp=temp+s.charAt(i);
					
				}
				System.out.println(temp);
				
				if(temp.equals(s)) {
					System.out.println("String is Palindrome");
				}
				
				else {
					System.out.println("String is not Palindrome");
				}
				
			//========================================================
		
	}

}
