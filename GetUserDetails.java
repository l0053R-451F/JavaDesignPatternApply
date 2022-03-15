
import java.util.Scanner;
import org.*;
public class GetUserDetails{
    String username, phone, ch;
    GetUserDetails(String choice){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        username = sc.nextLine();

        System.out.println("Enter Phone: ");
        phone = sc.nextLine();

        ch = choice;
        JSONObject obj = new JSONObject();

        if(username == "" || phone == ""){
            System.out.println("Invaild username or phone");
        }
        else{
            if(ch == "single"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("single");
                room.roomBook();
            }
            else if(choice == "double"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("double");
                room.roomBook();
            }
            else if(choice == "luxuary"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("luxuary");
                room.roomBook();
            }
        }
    }
}

