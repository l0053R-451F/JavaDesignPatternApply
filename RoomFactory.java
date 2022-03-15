public class RoomFactory {
    public Room booked(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }

        switch(channel){
            case "single":
                return new SingleRoom();
            
            case "double":
                return new DoubleRoom();
            case "laxuary":
                return new LuxaryRoom();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel); 
        }
    }
}
