package programming.array;
 class student
{
    int roll_no;
    String name;
    int marks;
}
public class arrayofobjects {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.roll_no=27;
        s2.roll_no=30;
        s3.roll_no=31;
        s1.name="karthi";
        s2.name="athuljith";
        s3.name="sam_ambrose";
        s1.marks=97;
        s2.marks=70;
        s3.marks=60;
       student students[]=new student[3];
       students[0]=s1;
       students[1]=s2;
       students[2]=s3;
       
       for(int i=0;i<students.length;i++)
       {
        System.out.println(students[i].name+":"+students[i].marks);
       }
     for (student student : students) {
        System.out.println(student.name+":"+student.marks);
     }
    }
}
