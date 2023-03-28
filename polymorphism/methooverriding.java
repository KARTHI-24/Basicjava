package programming.polymorphism;

//import javax.sound.midi.MidiChannel;

class SamsungS2
{
   void memorySpace()
   {
    System.out.println("It has 64gb memory");
   }
}
class SamsungS7 extends SamsungS2
{
    void memorySpace()
    {
        System.out.println("It has 128gb memory");
    }
}
class SamsungS9 extends SamsungS7
{
    void memorySpace()
    {
        System.out.println("It has 256gb memory");
    }
}
// in this program we are used method overriding
//for that the method name should be same and we have to extend the parent class to ovveride the method
public class methooverriding {
    public static void main(String[] args) {
        SamsungS2 obj=new SamsungS9();
        obj.memorySpace();
        obj=new SamsungS2();
        obj.memorySpace();
        obj=new SamsungS7();
        obj.memorySpace();
    }
}
