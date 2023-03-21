package programming.Encapsulation;

//import programming.inheritance.advance;

public class encapsulandthis
{
 public static void main(String[] args) {
    aliens obj=new aliens();
    obj.setName("karthi");
    obj.setNumber(824855);
    System.out.println(obj.getNumber()+":"+obj.getName());
 }
}
class aliens
{
    private int number;
    private String name;

   
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
}