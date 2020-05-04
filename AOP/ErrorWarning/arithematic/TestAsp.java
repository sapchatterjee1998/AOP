aspect TestAsp{
	pointcut p1():handler(ArithmeticException);
	before():p1(){
		System.out.println("ArithmeticException");
	}	
}