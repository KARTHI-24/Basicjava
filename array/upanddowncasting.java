package programming.array;
class A
{
 void show1()
 {
    System.out.println("in A");
 }
}
class B extends A
{
 void show2()
 {
    System.out.println("in B");
 }
}
public class upanddowncasting {
    public static void main(String[] args) {
        A obj=new B(); 
        obj.show1();
        B obj1=(B)obj;
        obj1.show2();
       }
}
