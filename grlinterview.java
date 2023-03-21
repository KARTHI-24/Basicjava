package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DataSet
{
    public float speed=0;
    public float time=0;
    public float distance=0;
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public float getTime() {
        return time;
    }
    public void setTime(float time) {
        this.time = time;
    }
    public float getDistance() {
        return distance;
    }
    public void setDistance(float distance) {
        this.distance = distance;
    }
 
}
class Userinput
{
    public List<DataSet> setuserinput()
    {
        final int INPUT_SIZE=4;
        List<DataSet> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
          DataSet data=null;
          for(int i=0;i<INPUT_SIZE;i++)
          {
            data=new DataSet();            
            System.out.println("enter the distance");          
           // data.distance=sc.nextFloat();
            // System.out.println("enter the time");
            // data.time=sc.nextFloat();
            // data.setDistance(data.distance);
            // data.setTime(data.time);
            data.setDistance(sc.nextFloat());
            System.out.println("enter the time");
            data.setTime(sc.nextFloat());
            list.add(data);
            if(data.distance>0)
            {
                data.setSpeed(data.getDistance()/data.getTime());
            }
            float speed=data.getSpeed();
          //  System.out.println("\n");
            System.out.println("the speed of the vechicle is"+" "+(i+1)+":"+speed);
           // sc.close();          
          }
          sc.close();

        return list;
    }
}
class Measure
{
    public List<DataSet> measuretheoutput(List<DataSet> list2)
    {
        for(int i=0;i<list2.size();i++)
        {
            
            if(list2.get(i).getDistance()>0)
            {
                list2.get(i).setSpeed(list2.get(i).getDistance()/list2.get(i).getTime());
            }
        }
        return list2;
    }
}
class ShowResults
{
   
}

public class grlinterview {
    public static void main(String[] args) {
        //DataSet dataSet=new DataSet();
      //  Measure obj=new Measure();
        Userinput obj1=new Userinput();
       
        List<DataSet> list2= obj1.setuserinput();
        for(DataSet values:list2)
        {
            System.out.println(values.getDistance()+"\n"+values.getTime());
        }
        System.out.println("------------------------>");
        for(int i=0;i<list2.size();i++)
        {
            System.out.println(list2.get(i).distance+"\n"+list2.get(i).time);
        }
       // List<DataSet> list1=new ArrayList<>();
       //  list1=obj1.setuserinput();
        //  for(DataSet liSet:list1)
        //  {
        //     System.out.println(liSet.get(dataSet.));
        //  }
    }
    
}
