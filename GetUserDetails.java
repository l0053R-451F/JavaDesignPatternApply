import java.util.Scanner;

public class GetUserDetails{
    String username, phone, ch;
    GetUserDetails(String choice){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        username = sc.nextLine();

        System.out.println("Enter Phone: ");
        phone = sc.nextLine();

        this.ch = choice;

        
    }
}

