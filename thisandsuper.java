package programming;

class A
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int A)
    {
        //super();
        System.out.println("in A int");
    }
}
//super()-->which used to call super method of the parent class
//this()-->which is used to call the constructor of the same class
class B extends A
{
    public B()
    {
        System.out.println("in B");
    }
    public B(int B)
    {
        //super(B);
        this();
        System.out.println("in b int");
    }
}
public class thisandsuper{
public static void main(String[] args) {
   new B(5);
   //
}
}

