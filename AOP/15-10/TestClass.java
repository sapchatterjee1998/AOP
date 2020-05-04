class Hello{
	String name;
	int age;
	String country;
	Hello(String n,int a,String c){
		name=n;
		age=a;
		country=c;
	}
	void display(){
		System.out.println("Hello "+name+", I know you're "+age+" years old and you belong to "+country);
	}

}
class TestClass{
	public static void main(String as[]){
		Hello hello=new Hello("Laden",32,"Pakisthan");
		hello.display();
	}
}