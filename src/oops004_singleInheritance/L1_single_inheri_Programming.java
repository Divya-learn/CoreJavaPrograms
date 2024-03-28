package src.oops004_singleInheritance;

public class L1_single_inheri_Programming extends L1_single_inheri_Python{

    String Author;
    int version;

    public L1_single_inheri_Programming()
    {
        System.out.println("I am child DC");
    }
    public L1_single_inheri_Programming(String ref_Author, int ref_version)
    {
        this.Author = ref_Author;
        this.version = ref_version;
    }
    void display()
    {
        System.out.println("Author"+this.Author+" "+ "version"+this.version);
    }

    public void hello() {
        print();
    }
}
