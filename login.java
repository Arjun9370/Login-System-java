import java.lang.*;
import login.pass.*;
import login.sign.Sign;
import login.form.Form;
import login.menu.Menu;
import java.util.Scanner;
import login.form.Form;

public class login {
    public static void main(String []args)
    {
        Form f = new Form();
        int ch;
        Scanner sc = new Scanner(System.in);
        do
        {
            Menu m = new Menu();
            ch =sc.nextInt();  
            switch (ch) 
            {
                case 1:
                    f.getData();
                    break;
                case 2:
                 f.login();
                 break;
                case 3:
                    f.showData();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                
                default:
                    System.out.println("Please select correct opttion");
                  break;
            }
        }while(ch!=4);
        
        

    }
    
}

