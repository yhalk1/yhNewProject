package pack;

public class SmallBox extends BoxInherit {

    private int length;
    private int width;

    public SmallBox(int l, int w){
        super (l,w);
        this.length = l;
        this.width = w;
    }

    public void getArea(){
        double area = length*width;
        System.out.println("The area is " + area);
    }
    public void desplayBoxName(){
        System.out.println(" This is Small Box");
    }

}
