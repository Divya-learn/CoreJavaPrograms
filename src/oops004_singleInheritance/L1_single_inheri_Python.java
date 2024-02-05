package src.oops004_singleInheritance;

public class L1_single_inheri_Python {

    int foundedyear;
    public L1_single_inheri_Python()
    {
        System.out.println("I am parent DC");
    }
    public L1_single_inheri_Python(int ref_foundedyear)
    {
        this.foundedyear = ref_foundedyear;
    }

    void print()
    {
        System.out.println("year"+this.foundedyear);
    }
}
