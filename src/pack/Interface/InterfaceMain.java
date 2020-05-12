package pack.Interface;

public class InterfaceMain implements Vehicle{
   public void start(){
        System.out.println("Statrting");
    }
   public  void cruise(){
        System.out.println("Cruising");
    }
    public void stop(){
        System.out.println("Stopping");
    }

    public static void main (String[] args){
       InterfaceMain fordF150 = new InterfaceMain();
       fordF150.start();
       fordF150.cruise();
       fordF150.stop();
    }

}
