class Book{
	int a;
	int b;
	String c;
	void input(int a,int b,String c){
		a=a;
		b=b;
		c=c;
	}
	void output(){
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		
	}
}
class Cls{
	public static void main(String [] args){
		Book obj = new Book();
		obj.input(10,20,"abd");
		obj.output();
	}
}