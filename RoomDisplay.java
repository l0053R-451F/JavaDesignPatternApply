public class RoomDisplay implements RoomDetails {
    RoomDetails[] roomdetails;
    public RoomDisplay(){
        roomdetails = new RoomDetails[]{new SingleRoomDetails(), new DoubleRoomDetails(), new LuxaryRoomDetails()};
    }

    public void accept(RoomVisitor roomVisitor){
        for(int i=0; i < roomdetails.length; i++){
            roomdetails[i].accept(roomVisitor);
        }
        roomVisitor.visit(this);
    }
}
