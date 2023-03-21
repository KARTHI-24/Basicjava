package programming.interviewbasicproblems;

public class vowelnumber {
    public static void main(String[] args) {
        String name="hll";
        int count =0;
        for(int i=0;i<name.length();i++)
         {
            char c=name.charAt(i);
            if(c=='a'|| c=='e' ||c=='i' ||c=='o' ||c=='u')
            {
               count++;
               System.out.println(count);
            }       
            if(i==name.length()-1 &&count==0)
            {
                System.out.println("-1");
            }
        }            
      // System.out.println(count);

    }
}
