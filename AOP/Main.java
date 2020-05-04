class Seminar
{
	private String sname;
	private String sid;
	private String stype;
	public void submit_concert(String name,String ID,String type)
	{
		sname=name;
		sid=ID;
		stype=type;
	}
	public void change_type(String type)
	{
		stype=type;
	}
	public void deny_concert(String ID )
	{	
		sid=ID;
		stype="Cancelled";
	}
	public void show_details()
	{
		System.out.println("Name :"+sname);
		System.out.println("Seminar ID :"+sid);
		System.out.println("Type :"+stype);
		
	}
}
public class Main
{
	public static void main(String args[])
	{
		Seminar sem=new Seminar();
		sem.submit_concert("Saptarishi","11906426","Audience");
		sem.change_type("Presenter");
		sem.deny_concert("11906426");
		sem.show_details();
	}	
}