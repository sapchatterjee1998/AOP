class Details
{
	int var1;
	//int var2;::Declared in the aspect
	String var3;
	void show()
	{
		System.out.println("Previous value are :");
		System.out.println("Var 1:"+ var1);
		System.out.println("Var 3:"+ var3);
	}
		void getData(int v1,String v3)
	{
		var1=v1;
		var3=v3;
	}
}
class Test
{
	public static void main(String args[])
	{
		Details det=new Details();
		det.getData(12,"SAPTARSHI");
		det.show();
		det.get_var2(15);
		det.change_var1(13);
		det.change_var3("SAPTARSHI CHATTERJEE");
		det.showFinal();
	
	}
}
