package pack;

public class Constructor {
    public Constructor(){
        System.out.println("Constructor without param");
    }

    public Constructor (String param){
        System.out.println("Constructor with param  " + param);
    }

    public void InstanceMethod (){
        System.out.println("InstanceMethod");
    }
}
class ConstructorExample{

    public static void main(String[] args){
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("yh param");
        c1.InstanceMethod();
        c2.InstanceMethod();
        }
        }

