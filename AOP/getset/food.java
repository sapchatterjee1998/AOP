class food{

int quantity;
int price;
String name;

void input(int a,int b, String c){

quantity=a;
price=b;
name=c;


}

void output()
{
System.out.println("Quantity:"+pages);
System.out.println("price"+price);
System.out.println("name"+name);

}
}

class mycls{
public static void main(String args[]){
food f=new food();
f.input(1000,2000,"chicken");
f.output();

}
}

