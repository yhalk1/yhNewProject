package pack.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        //Non Generic list
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("bla bla bla");
        arrayList1.add(213);
        arrayList1.add(true);
        System.out.println(arrayList1);
        arrayList1.remove(1);
        System.out.println(arrayList1);

        //Non Generic list
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2345324);
        arrayList2.add(213);
        arrayList2.add(555555);
        System.out.println(arrayList2);
        arrayList2.remove(1);
        System.out.println(arrayList2);
    }
}
