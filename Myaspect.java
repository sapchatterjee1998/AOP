aspect Myaspect
{
	int Details.var2;
	void Details.get_var2(int v2)
	{
		var2=v2;
	}
	void Details.change_var1(int v1)
	{
		var1=v1;
	}
	void Details.change_var3(String v3)
	{
		var3=v3;
	}
	void Details.showFinal()
	{
		System.out.println("Values after change: ");
		System.out.println("Var 1:"+ var1);
		System.out.println("Var 2 :"+var2);
		System.out.println("Var 3:"+ var3);
	}
}