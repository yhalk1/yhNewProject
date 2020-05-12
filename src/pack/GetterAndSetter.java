package pack;

public class GetterAndSetter {

    public static void main (String[] args){
        CarForGetSet car1 = new CarForGetSet("Opel","Astra", 2000 );
        System.out.print(car1.getMake() + " - ");
        System.out.print(car1.getModel() + " - ");
        System.out.print(car1.getYear());

        car1.setMake("Dacia");
        car1.setModel("Logan");
        car1.setYear(2007);
        System.out.println(" ");
        System.out.print(car1.getMake() + " - ");
        System.out.print(car1.getModel() + " - ");
        System.out.print(car1.getYear());
    }
}
