package pack.Polymorphism;

public class AnimalMain {

    public static void main (String [] args){
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        a1.talk();
        a2.talk();
        a3.talk();
        c1.talk();
        d1.talk();

    }
}
