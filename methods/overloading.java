package programming.methods;
 
  class calculator
      {
        int add(int n,int n1,int n2)
        {
            return n1+n+n2;
        }
       int add(int n,int n1)
       {
        return n+n1;
       }
       double add(double n,int n1)
       {
            return n+n1;
       }
       double finale(double add)
       {
        return add+5;
       }
    }
       class overload{
    public static void main(String[] args) {
        calculator casio=new calculator();
        int result=casio.add(10,20,30);
        double ans=casio.add(10.5, 20);
        double results=casio.finale(ans);
        System.out.println(results);
        System.out.println(result);
    }
}
