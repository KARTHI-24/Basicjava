package programming.scaler;
public class carryforward {
   static int  pairs(char[] c)
    {
        int n=c.length;
        System.out.println(n);
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(c[i]=='a' && c[j]=='g')
                {
                    count++;
                }
            }
        }
          return count;
    }
    static char[] pairs1(char[] a)
    {
        return a;
    }
    public static void main(String[] args) {
        char[] c={'a','b','g','g','a','g'}; 
        int answer= carryforward.pairs(c);
        char[] cou=carryforward.pairs1(c);
        for(int i=0;i<cou.length;i++)
        {
            System.out.println(cou[i]+"\n");
        }
        System.out.println(answer);
    }
}
