package programming;
class Laptop
{
    int price;
    String brand;
    // public boolean equals(Laptop that)
    // {
    //     return this.price==(that.price) && this.brand.equals(that.brand);
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }
}
public class objectandclass {
    public static void main(String[] args) {
    Laptop obj1=new Laptop();
    obj1.price=10000;
    obj1.brand="lenovo";
    Laptop obj2=new Laptop();
    obj2.price=10000;
    obj2.brand="lenovo";

   // boolean result=obj1.equals(obj2);
    boolean result1=obj2.equals(obj1);
    int intergers=obj1.hashCode();
   // System.out.println(result);
    System.out.println(result1);
    System.err.println(intergers);
    }
}
