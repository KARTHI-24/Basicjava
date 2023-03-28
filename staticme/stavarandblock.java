package programming.staticme;

//import java.lang.reflect.Constructor;

class college
{
    String emp_name;
    int roll_no;
    static String college_name="Gct";
     public college(String emp_name,int roll_no)
     {
      this.emp_name=emp_name;
      this.roll_no=roll_no;
      //this keyword which refers to current object not as the instance variable
     }
     static 
     {
        college_name="psg";
     }
     void display()
     {
        System.out.println(emp_name+":"+roll_no+":"+college_name);
     }
     static void display1(college object)
     {
        System.out.println(object.emp_name+":"+object.roll_no+":"+college_name);
     }
}

public class stavarandblock {
    public static void main(String[] args) {
        college obj=new college("karthi",22);
        obj.display();
        college.display1(obj);

    }
    
}
