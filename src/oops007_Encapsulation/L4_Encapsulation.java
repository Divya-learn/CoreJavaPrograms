package src.oops007_Encapsulation;

public class L4_Encapsulation {

    public static void main(String[] args) {
        vwologin ref = new vwologin("divya", "ddd");
        boolean check = ref.vwoapp("divya","ddd");
        System.out.println(check);

      //  ref.password ="fff";   if the variable is private cannot able to access in another class. here encapsulation comes
        boolean check1 = ref.vwoapp("divya","fff");
        System.out.println(check1);

      //  ref.setusername("sabari"); // allowing to set password by setter method
       // System.out.println(ref.getusername()); //getting the password by getter method
        //System.out.println(ref.getpassword()); // getting the password

        //we can use set method for password but in real time we are not allowing anyone to set password
    }
}
class vwologin{

   private String username; // these private variables are accessed only by getter and setter
   private String password;

   public String setusername(String username)
   {
       return username;
   }

    public String getusername()
    {
        return username;
    }

   public String getpassword()
   {
       return password;
   }


    public vwologin(String ref_u, String ref_p)
    {
        this.username = ref_u;
        this.password = ref_p;
    }

  boolean vwoapp(String user, String password){
        if(this.username.toLowerCase().equals(user) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN");
            return true;
        }
        else
        {
            System.out.println("Wrong");
            return false;
        }
    }
}
