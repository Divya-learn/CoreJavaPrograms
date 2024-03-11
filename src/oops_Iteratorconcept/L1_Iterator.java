package src.oops_Iteratorconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L1_Iterator {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        Iterator<Integer> a = num.iterator();
        while (a.hasNext()) {
           // int b = a.next();
                System.out.println();

        }
    }
}
