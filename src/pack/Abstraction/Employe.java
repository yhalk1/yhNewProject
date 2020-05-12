package pack.Abstraction;

public class Employe extends Customer{
    private String empId;

    public String getEmpId (){ return empId;}
    public void setEmpId(String empId) {this.empId = empId;}

    public String getEmpInfo(){
        return String.format("Customer Name: %s Adress: %s Id: %s ", getName(), getAddress(), getEmpId());
    }

}
