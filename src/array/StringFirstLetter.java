package array;

public class StringFirstLetter {

	public static void main(String[] args)
	{	
	   String s="i love my india";
				
/*	String s1 = s.substring(0, 1).toUpperCase()+" "+s.substring(2, 3).toUpperCase()+s.substring(3, 6)+" "+s.substring(7, 8).toUpperCase()+
	s.substring(8, 9)+" "+s.substring(10, 11).toUpperCase()+s.substring(11, 15);
				
	System.out.println(s1);
				*/
				
	String s2=s.substring(0, 1).toUpperCase()+" "+s.substring(2, 3).toUpperCase()+s.substring(3, 6)+" "+s.substring(7, 8).toUpperCase()+
	s.substring(8, 9)+" "+s.substring(10, 11).toUpperCase()+s.substring(11,15);
				
				
	System.out.println(s2);
				
			
	//Finding length of String without Using length Method
	System.out.println(s.length());
				
	System.out.println(s.lastIndexOf('a'));
				
	//length-->it starts from 1
	//last index of--->starts with 0.
		

	}

}
