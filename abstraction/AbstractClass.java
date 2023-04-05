package programming.abstraction;
/*
 abstract class 
 1)abstract class have both abstract methods and non abstract methods
 2)abstract methods means it should not be defined only declaration should be there
 3)in those above method we have to use abstract keyword in methods
 4)if we have abstract methods that class should be abstract class
 5) we cannot instanitate the abstract class that means we can keep as refernce not as the 
 object
 6)
 */
abstract class car  
{
    public abstract void drive(); 
    public abstract void fly();

    public void playMusic()
    {
       System.out.println("in music");
    }
}
abstract class Dezire extends car
{
  public void drive()
  {
    System.out.println("driving configured");
  }
}
class Wagnor extends Dezire
{
    public void fly()
    {
        System.out.println("in flying");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Wagnor obj=new Wagnor();
        obj.drive();
        obj.fly();
        obj.playMusic();
       /// obj.notifyAll();
        
    }
    
}
