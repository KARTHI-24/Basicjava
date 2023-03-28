package programming.methods;

//import javax.xml.transform.stream.StreamSource;

 class computer
{
    public void music(int volume){
    boolean bool=false;
     if(volume>10){
        bool=true;
        System.out.println("audible");
    }
        else
        {
            System.out.println("not audible");
            volume=15; 
            if(volume>=15)
            {
            bool=true;
            System.out.println(bool);
            }  
            if(volume==15)
            {
                
                System.out.println("audible");
            }        
        }
    }
     String graphics(String res)
    { 
        String results="";
        if(res=="yes")
        {
             results="yes";
        }
        else{
            results="no";          
        }
        return results;
    }
}
 
class Main 
{
    public static void main(String[] args) {
        int volume=10;
        String name="yes";
        computer samsung=new computer();
        samsung.music(volume);
        String result=samsung.graphics(name);
        System.out.println(result);
    }
}