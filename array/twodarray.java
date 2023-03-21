package programming.array;

public class twodarray {
    public static void main(String[] args) {
        int n=3;
      int[][] arr=new int[n][];
       arr[0]=new int[3];// it is jagged array giving the size  for 2d array after declaring the array
       arr[1]=new int[4];
       arr[2]=new int[5];
     //int n1=arr[1].length;
      //System.out.println(n1);
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
           arr[i][j]=(int)(Math.random()*100);
           System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
     for (int[] is : arr) {
        for(int  m:is)
        {
            System.out.print(m+" ");
        }   
        System.out.println(); 
     }
    }
}
