package pack;

public class BoxInheritMain {
    public static void main (String[] args){

        BoxInherit box1 = new BoxInherit(12, 12);
        box1.desplayBoxName();

        SmallBox box2 = new SmallBox(12, 12);
        box2.desplayBoxName();
        box2.getArea();

        BigBox box3 = new BigBox(12, 12, 12);
        box3.desplayBoxName();
        box3.getArea();

    }
}
