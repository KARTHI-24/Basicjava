package programming.anonymous;

//import javax.swing.event.SwingPropertyChangeSupport;

class Dog
{
    public void bark()
    {
        System.out.println("the dog is going to bark");
    }
    class SmallDog
    {
        void feed()
    {
        System.out.println("for this small dog we need to feed");
    }
    }
}
public class Anonymous {
    public static void main(String[] args) {
       Dog obj=new Dog();
       obj.bark();
      Dog. SmallDog ob1=obj.new SmallDog();
           ob1.feed();
            

    }
}
