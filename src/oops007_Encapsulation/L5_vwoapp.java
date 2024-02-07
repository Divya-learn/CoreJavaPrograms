package src.oops007_Encapsulation;

public class L5_vwoapp {

    private String username;
    private String password;   //making the variable as private only accessible within the class

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
    public L5_vwoapp(String u_name, String p_name)
    {
        this.username = u_name;
        this.password = p_name;
    }

   boolean isloggin(String ref_u, String ref_p)
    {
        if(this.username.toLowerCase().equals(ref_u) && this.password.toLowerCase().equals(ref_p))
        {
            System.out.println("Loggedin");
            return true;
        }
        else {
            System.out.println("NotLoggedin");
            return false;
        }
    }


}
