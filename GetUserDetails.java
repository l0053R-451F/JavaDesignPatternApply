
import java.util.Scanner;
public class GetUserDetails{
    String username, phone, ch;
    GetUserDetails(String choice){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        username = sc.nextLine();

        System.out.println("Enter Phone: ");
        phone = sc.nextLine();

        ch = choice;

        if(username == "" || phone == ""){
            System.out.println("Invaild username or phone");
        }
        else{
            if(ch == "single"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("single");
                room.roomBook();
                CreateFile CF = new CreateFile(username, phone);
            }
            else if(choice == "double"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("double");
                room.roomBook();
                CreateFile CF = new CreateFile(username, phone);
            }
            else if(choice == "luxuary"){
                RoomFactory roomFactory = new RoomFactory();
                Room room = roomFactory.booked("luxuary");
                room.roomBook();
                CreateFile CF = new CreateFile(username, phone);
            }
        }
    }
}

