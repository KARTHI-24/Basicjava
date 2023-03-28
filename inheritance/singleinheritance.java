package programming.inheritance;

public class singleinheritance {
    public static void main(String[] args) {
        
    
      advance obj=new advance();
     int r1=obj.add(10,20);
     int r2=obj.sub(r1, r1);
     int r3=obj.mul(3, 3);
     int r4=obj.divide(r2, r3);
     System.out.println("the addition value is :"+r1+
     "\n"+"the subtraction value is :"+r2
     +"\n"+"the multiplication value is :"+r3
     +"\n"+"the division value  is :"+r4);
}
}
