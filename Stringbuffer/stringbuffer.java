package programming.Stringbuffer;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("karthi");
        System.out.println(sb.capacity());
        StringBuffer sc=sb.append(" java prohrammer");
        System.out.println(sc);
        sc.toString();
        System.out.println(sc);
        System.out.println(sc.capacity());
        //sc.append("ab", 0,2);
       // System.out.println(sc);
        sc.append(sb);
        System.out.println(sc);
        System.out.println(sc.capacity());

    }
}
