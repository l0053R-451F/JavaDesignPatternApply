public class RoomDisplayVisitor implements RoomVisitor{

    public void visit (RoomDisplay roomdisplay){
        System.out.println("Displaying Room");
    }

    public void visit (SingleRoomDetails singleroomdetails){
        System.out.println("Single Room Details");
    }

    public void visit (DoubleRoomDetails doubleroomdetails){
        System.out.println("Double Room Details");
    }

    public void visit (LuxaryRoomDetails luxaryroomdetails){
        System.out.println("Luxary Room Details");
    }
    
}
