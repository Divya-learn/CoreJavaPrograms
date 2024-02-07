package src.oops007_Encapsulation;
public class L5_Runnerclass {

    public static void main(String[] args) {
        L5_vwoapp ref = new L5_vwoapp("admin", "ggg");
        // ref.username("divya"); I have made username and password as private so cannot be change the value
        //If i made username and password as public then I can change the value


        //making the variables and methods as private this is known as encapsulation
        //only I can access by using getter and setter methods
        boolean check = ref.isloggin("admin", "fff");
        ref.setusername("divya");


    }
}