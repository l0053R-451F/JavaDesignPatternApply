public class DoubleRoomDetails implements RoomDetails{
    public void accept(RoomVisitor roomVisitor){
        roomVisitor.visit(this);
    }
}
