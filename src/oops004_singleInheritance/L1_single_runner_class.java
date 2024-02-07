package src.oops004_singleInheritance;

public class L1_single_runner_class {

    public static void main(String[] args) {

 /*       //Child class with child object --> able to access all the method and variables in parent and class
         L1_single_inheri_Programming p1 = new L1_single_inheri_Programming();
     //   L1_single_inheri_Programming p2 = new L1_single_inheri_Programming("abc",1);
       // L1_single_inheri_Python p3 = new L1_single_inheri_Python(1999);
        p1.display();
        p1.print();

        //parent class with parent object -->only able to use parent methods and variables
        L1_single_inheri_Python a1 = new L1_single_inheri_Python();
         //a1.display();   cant able to use child methods
        a1.print();  //only able to use parent method


        //child reference with parent object --> cannot be used error comes child reference cannot have parent object
        //L1_single_inheri_Programming c1 = new L1_single_inheri_Python();
*/

       //parent class with child object --> only able to use parent metods and variables
        L1_single_inheri_Python c2 = new L1_single_inheri_Programming(); //execution 1st go to child(L1_single_inheri_Programming) extends
                                            // parent so parent DC will be printed then child DC printed

      //  c2.display(); cant able to use child methods
        c2.print();
      //  c2.Author = "ggg";
        c2.foundedyear = 45;

        //Note:-
        //see the execution carefully


    }
}