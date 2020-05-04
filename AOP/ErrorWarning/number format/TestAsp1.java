aspect TestAsp1{
	pointcut p1():handler(NumberFormatException);
	before():p1(){
		System.out.println("NumberFormatException");
	}	
}