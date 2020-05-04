class ABC{
	int a,b;
	void setVars(int a,int b){
		this.a=a;
		this.b=b;
	}
	void perform(){
		try{
			int c=a/b;
		}catch(ArithmeticException e){
		}	
	}
}
class TestExp{
	public static void main(String as[]){
		ABC a=new ABC();
		a.setVars(10,0);
		a.perform();
	}	
}