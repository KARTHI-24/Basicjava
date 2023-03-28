package programming.staticme;
class mobile
{
    int price=10;
    String brand="samsung";
    static int version=20;
    public void show() {
        System.out.println(brand+version);
    }
   public  static void show1(mobile obj)
   {
    System.out.println(version+obj.brand);
   }
}

public class Demo
{
    public static void main(String[] args) {
       mobile obj=new mobile();
       mobile.version=30;
       obj .show();
      mobile. show1(obj);
    }
}