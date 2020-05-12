package pack.Abstraction;

public class AbstractMain {
    public static void main(String[] args){
        Employe emp1 = new Employe();
        emp1.setName("Dvaine");
        emp1.setAddress("LA");
        emp1.setEmpId("123123");

        System.out.println(emp1.getEmpInfo());
    }
}
