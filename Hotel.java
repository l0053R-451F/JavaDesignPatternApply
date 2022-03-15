import java.util.*;
public class Hotel{
    public static void main(String[] args) {

        //------------------Room Booked------------//

        // RoomFactory roomFactory = new RoomFactory();
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter Room: ");
        // String str= sc.nextLine(); 
        // Room room = roomFactory.booked(str);
        // room.roomBook();

        //----------------------------------------//


        //------------------Room Details-------------//
        RoomDetails roomdetails = new RoomDisplay();
        roomdetails.accept(new RoomDisplayVisitor());
        RoomFactory roomFactory = new RoomFactory();
        System.out.print("Enter your Choice which room you want: ");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        
        if(choice == 1){
            GetUserDetails gud = new GetUserDetails("single");
        }
        else if(choice == 2){
            GetUserDetails gud = new GetUserDetails("double");
        }
        else if(choice == 3){
            GetUserDetails gud = new GetUserDetails("luxuary");
        }
        // else if(choice == 2){
        //     GetUserDetails gud = new GetUserDetails();
        //     if(gud.getUsername() == "" || gud.getPhone() == ""){
        //         //Invalid Username or Phone//
        //     }
        //     else{
        //         //Booking Double Room
        //     }
        // }

        // else if(choice == 3){
        //     GetUserDetails gud = new GetUserDetails();
        //     if(gud.getUsername() == "" || gud.getPhone() == ""){
        //         //Invalid Username or Phone//
        //     }
        //     else{
        //         //Luxuary Double Room
        //     }
        // }

        // GetUserDetails gud = new GetUserDetails();
        // System.out.println(gud.getUsername());
        
        // System.out.print("Enter your choice: ");
        // Scanner sc= new Scanner(System.in);
        // int choiceRoomDetails = sc.nextInt();
        // if(choiceRoomDetails == 1){
        //     Room room = roomFactory.booked("single");
        //     room.roomBook();
        // }
        // else if(choiceRoomDetails == 2){
        //     Room room = roomFactory.booked("double");
        //     room.roomBook();
        // }
        // else if(choiceRoomDetails == 3){
        //     Room room = roomFactory.booked("luxary");
        //     room.roomBook();
        // }
        // System.out.print("Enter Username: ");
        // Scanner sc= new Scanner(System.in);
        // String username = sc.nextLine();
        // System.out.print("Enter phone: ");
        // String phone = sc.nextLine();
        // if(phone == "" || username == ""){
        //     System.out.println("Not");
        // }else{
        //     System.out.println("Food Yes!");
        // }

    }
}
