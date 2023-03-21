package programming.array;

public class onedarray {
    public static void main(String[] args) {
        String name="karthi";
        int n=name.length();
        System.out.println(n);
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
