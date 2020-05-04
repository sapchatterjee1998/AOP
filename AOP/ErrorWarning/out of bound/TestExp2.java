class ABC{
	int a[]=new int[2];
	
	void perform(){
		try{
			int c=a[4];
		}catch(ArrayIndexOutOfBoundsException e){
		}	
	}
}
class TestExp2{
	public static void main(String as[]){
		ABC a=new ABC();
		
		a.perform();
	}	
}