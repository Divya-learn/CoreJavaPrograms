package src.OOPS003Constructor;

public class L3_method_default_paramaterized {
    String name;
    int age;
    String CourseName;
    boolean CourseJoined;
    public L3_method_default_paramaterized(){      //Default constructor
        CourseName = "ATB5X";
        System.out.println("All are joined in this"+CourseName);
        System.out.println("defaultage"+age); //we are not setting any value to age if we print default value is printed for age i.e 0
    }

    public L3_method_default_paramaterized(int ref_age,String ref_name,boolean ref_CourseJoined){ //Parameterized Constructor

        this.age = ref_age;
        this.name = ref_name;
        this.CourseJoined = ref_CourseJoined;

    }



     void display(){    //method

        System.out.println("age"+ this.age);
        System.out.println("name"+ this.name);
        System.out.println("CourseJoined"+ this.CourseJoined);
    }

}
