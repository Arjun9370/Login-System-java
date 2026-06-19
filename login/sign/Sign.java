package login.sign;

public class Sign {

    private String Fname;
    private String user_name;
    private int user_id;
    private String email;
    private long number;

    // Constructor
    public Sign(String user_name, String Fname, int user_id,
                String email, long number) {

        this.user_name = user_name;
        this.Fname = Fname;
        this.user_id = user_id;
        this.email = email;
        this.number = number;
    }

    // Getters
    public String getUserName() {
        return user_name;
    }

    public String getFname() {
        return Fname;
    }

    public int getUserId() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public long getNumber() {
        return number;
    }
}