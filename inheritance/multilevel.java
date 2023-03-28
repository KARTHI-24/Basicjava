package programming.inheritance;
class Bank
{
  int getRateOfInterestofbank()
  {
    return 0;
  }
}
class Icici extends Bank
{
    int getRateOfInterestoficici()
    {
        return 7;
    }
}
class Sbi extends Icici
{
    int getRateOfInterestofsbi()
    {
        return 8;
    }
}
class Axis extends Sbi
{
    int getRateOfInterest()
    {
        return 9;
    }
}
//method overriding we can override the parent class method but ovveride method name should be same
//method overloading is different from the method ove
public class multilevel {
    public static void main(String[] args) {
        Axis obj=new Axis();
        int intrest=obj.getRateOfInterest();
        int interest1=obj.getRateOfInterestofsbi();
        System.out.println("the axis bank interest is :"+intrest);
        System.out.println("the axis bank interest is :"+interest1);
    }
}
