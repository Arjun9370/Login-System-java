// package login.form;

// import login.pass.*;
// import login.sign.Sign;
// import java.util.Scanner;
// import java.io.Console;

// public class Form
// {

//     public void getData()
//     {
//         Scanner sc = new Scanner(System.in);
//         Console console=System.console();

//         System.out.print("Enter user name: ");
//         String UName = sc.nextLine();

//         System.out.print("Enter full name: ");
//         String Name = sc.nextLine();

//         int UId = (int)(Math.random() * 9000) + 1000;

//         System.out.print("Enter Email id: ");
//         String Email = sc.nextLine();

//         System.out.print("Enter Phone number: ");
//         long num = sc.nextLong();
//         sc.nextLine(); // clear buffer

//         char [] passChars = console.readPassword("Enter Password: ");
//         String password = new String(passChars);

//         Pass p1 = new Pass();
//         p1.setPass(password);

//         Sign s1 = new Sign(UName, Name, UId, Email, num);
        
        
//         Sign[][] users =  new Sign[100][100];
//         int count;
//         users[count] = s1,p1.getPass();
//         count++;

//     }

// }
package login.form;

import login.pass.*;
import login.sign.Sign;
import java.util.Scanner;
import java.io.Console;

public class Form {

    private Sign[] users = new Sign[100];
    private Pass[] passwords = new Pass[100];
    private int count = 0;

    public void getData() {

        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Enter user name: ");
        String UName = sc.nextLine();

        System.out.print("Enter full name: ");
        String Name = sc.nextLine();

        int UId = (int)(Math.random() * 9000) + 1000;

        System.out.print("Enter Email id: ");
        String Email = sc.nextLine();

        System.out.print("Enter Phone number: ");
        long num = sc.nextLong();
        sc.nextLine();

        String password;

        if (console != null) {
            char[] passChars = console.readPassword("Enter Password: ");
            password = new String(passChars);
        } else {
            System.out.print("Enter Password: ");
            password = sc.nextLine();
        }

        Pass p1 = new Pass();
        p1.setPass(password);

        Sign s1 = new Sign(UName, Name, UId, Email, num);

        users[count] = s1;
        passwords[count] = p1;

        count++;

        System.out.println("Registration Successful!");
    }
    public void showData() {

    for (int i = 0; i < count; i++) {

        System.out.println("Username : " + users[i].getUserName());
        System.out.println("Full Name: " + users[i].getFname());
        System.out.println("User ID  : " + users[i].getUserId());
        System.out.println("Email    : " + users[i].getEmail());
        System.out.println("Phone No : " + users[i].getNumber());

        System.out.println("-------------------");
    }
    
 }
 public void login() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Username or User ID: ");
    String input = sc.nextLine();

    System.out.print("Enter Password: ");
    String password = sc.nextLine();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        boolean userMatch =
                users[i].getUserName().equals(input);

        boolean idMatch =
                String.valueOf(users[i].getUserId()).equals(input);

        if ((userMatch || idMatch)
                && passwords[i].getPass().equals(password)) {

            System.out.println("Login Successful!");
            System.out.println("Welcome " + users[i].getFname());

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Invalid Credentials!");
    }
}
}

