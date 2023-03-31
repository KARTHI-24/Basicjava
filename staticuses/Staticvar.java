package programming.staticuses;
class Static{
   int regno;
   int marks;
   static String name;
     static String value;
   static
   {
    value="karthi";
   }

    void details()
    {
        System.out.println(regno+" :"+marks+name+value);
    }

}
public class Staticvar {
    public static void main(String[] args) {
        Static obj=new Static();
        obj.regno=2022;
        obj.marks=90;
        Static.name="karthi"    ; 
        obj.details();
        Static obj1=new Static();
        obj1.regno=2039;
        obj1.marks=20;
        Static.name="murugesan";
        obj1.details();
        Static obj2=new Static();
        obj2.regno=2039;
        obj2.marks=20;
       // Static.name="murugesan";
        obj2.details();
    }
}
