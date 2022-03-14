public class SingleRoomDetails implements RoomDetails{
    public void accept(RoomVisitor roomVisitor){
        roomVisitor.visit(this);
    }
}
