
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

        if(username == "" || phone == ""){
            System.out.println("Invaild username or phone");
        }
        else{
            if(choice == "single"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("single");
            }
            else if(choice == "double"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("double");
            }
            else if(choice == "luxuary"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("luxuary");
            }
        }
    }
}

