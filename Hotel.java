// import java.util.*;
public class Hotel {
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
    }
}
