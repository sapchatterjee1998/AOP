class ABC{
	String nm;
	void setVars(String n){
		this.nm=n;
	}
	void perform(){
		try{
			int c=Integer.parseInt(nm);
		}catch(NumberFormatException e){
		}	
	}
}
class TestExp1{
	public static void main(String as[]){
		ABC a=new ABC();
		a.setVars("AN");
		a.perform();
	}	
}