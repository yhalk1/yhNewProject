package pack;

public class BigBox extends BoxInherit {

    private int length;
    private int width;
    private int height;

    public BigBox(int l, int w, int h){
        super (l,w);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public void getArea(){
        double area = length*width*height;
        System.out.println("The area is " + area);
    }
    public void desplayBoxName(){
        System.out.println(" This is Big Box");
    }
}
