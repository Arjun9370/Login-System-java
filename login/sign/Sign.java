package login.sign;
public class Sign {
    String Fname;
    String user_name;
    int user_id;
    String email;
    long number;
    

    // constructor for creation of object
    public Sign(String user_name,String Fname,int user_id,String email,long number)
    {
        this.user_name=user_name;
        this.Fname=Fname;
        this.user_id=user_id;
        this.email=email;
        this.number=number;
    }

}
