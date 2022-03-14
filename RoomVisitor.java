public interface RoomVisitor {
    public void visit(RoomDisplay roomdisplay);
    public void visit(SingleRoomDetails singleroomdetails);
    public void visit(DoubleRoomDetails doubleroomdetails);
    public void visit(LuxaryRoomDetails luxaryroomdetails);
}
