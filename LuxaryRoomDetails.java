public class LuxaryRoomDetails implements RoomDetails{
    public void accept(RoomVisitor roomVisitor){
        roomVisitor.visit(this);
    }
}