package pack;

public class CarForGetSet {
    String make;
    String model;
    int year;
    public CarForGetSet (String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake (){
        return make;    }
    public void setMake (String make){
        this.make=make;    }
    public String getModel (){
        return model;    }
    public void setModel (String model){
        this.model=model;    }
    public int getYear (){
        return year;    }
    public void setYear (int year){
        this.year=year;    }
}
