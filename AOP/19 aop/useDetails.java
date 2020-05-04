//import java.util.*;
class Details
{
  int var1;

  String var3;

  Details(int v1,int v2,String v3)
  {
    var1=v1;var2=v2;var3=v3;
  }

  void show()
  {
    System.out.println("var1:"+var1+"var2:"+var2+"var3:"+var3);
  }
}
class useDetails
{
  public static void main(String[] args)
  {
    Details D1=new Details(10,20,"abC");
    D1.show();
    D1.show_v2();
  }
}
