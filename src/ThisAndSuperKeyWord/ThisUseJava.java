package ThisAndSuperKeyWord;



public class ThisUseJava {
	
	int a =200;// global variable
	
    static int b=40;//  static global variable

	public static void main(String[] args) {
		 ThisUseJava t= new ThisUseJava();
		 t.test();
		 
		 System.out.println(t.a);
			

	}
       public void test() {
		
		int a =500;// local variable
		System.out.println("local variable value is"+ a);
		System.out.println("Global variable value is"+ this.a);
		
		int sum = 40+ this.a;// using global value of a 
		System.out.println("sum is"+sum);
		
		int sum1=40+a;// using local value of a
		System.out.println("Sum is"+ sum1);
		
	}
	
	
	
}
