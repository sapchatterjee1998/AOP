aspect TestAsp2{
	pointcut p1():handler(ArrayIndexOutOfBoundsException);
	before():p1(){
		System.out.println("ArrayIndexOutOfBoundsException");
	}	
}