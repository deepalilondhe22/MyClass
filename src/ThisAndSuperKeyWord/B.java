package ThisAndSuperKeyWord;



public class B extends A {
	

	 int x=5;// global value of x from B class
		
	
	public static void main(String[] args) {
	
		B b =new B();
		b.demo();
		
	}

    public void demo() {
		
		int x=500;//local value of x from B class
		System.out.println("Local value of x "+ x);
		System.out.println("Global value of x from B"+this.x);
		System.out.println("Global value of x from super class A"+super.x);
		System.out.println("Local value of y"+y);
	}
	
	
		
		
	}


