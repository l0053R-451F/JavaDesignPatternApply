public class RoomDisplayVisitor implements RoomVisitor{

    public void visit (RoomDisplay roomdisplay){
        System.out.println("");
    }

    public void visit (SingleRoomDetails singleroomdetails){
        System.out.print("1.Single Room Details\n 1.AC-No\n 2.Food-YES\n 3.Budget-1500tk only\n\n\n");
    }

    public void visit (DoubleRoomDetails doubleroomdetails){
        System.out.print("2.Double Room Details\n 1.AC-YES\n 2.Food-YES\n 3.Budget-3500tk only\n\n\n");
    }

    public void visit (LuxaryRoomDetails luxaryroomdetails){
        System.out.print("3.Luxury Room Details\n 1.AC-YES\n 2.Food-YES\n 3.Budget-4500tk only\n\n\n");
    }
    
}
