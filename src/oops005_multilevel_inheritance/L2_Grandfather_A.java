package src.oops005_multilevel_inheritance;

public class L2_Grandfather_A {

    String GFname;
    int GFage;

    public L2_Grandfather_A(){
        System.out.println("I am GF");
    }

    public L2_Grandfather_A(String ref_GFname, int ref_GFage)
    {
        this.GFname = ref_GFname;
        this.GFage = ref_GFage;
    }

    void Bhk3()
    {
      System.out.println(GFname+GFage+"BHK3");
    }
}
