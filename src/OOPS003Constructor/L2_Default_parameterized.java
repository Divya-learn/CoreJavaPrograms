package src.OOPS003Constructor;

public class L2_Default_parameterized {

    String name;
    int age;
    String CourseName;
    boolean CourseJoined;
    public L2_Default_parameterized(){
        CourseName = "ATB5X";
        System.out.println("All are joined in this"+CourseName);
    }

    public L2_Default_parameterized(int ref_age,String ref_name,boolean ref_CourseJoined){

        this.age = ref_age;
        this.name = ref_name;
        this.CourseJoined = ref_CourseJoined;

        System.out.println("age"+ this.age);
        System.out.println("name"+ this.name);
        System.out.println("CourseJoined"+ this.CourseJoined);

    }


}
