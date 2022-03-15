
import java.util.Random;

public class SetMenu implements Kitchen {
    @Override


    public int createOrder() { 
    Random rand = new Random(); 
    int randomGenerated = rand.nextInt( Integer.MAX_VALUE ) + 1; 
    return randomGenerated;


  }

@Override

public boolean isBakingDone() { 
return true;


}
    
}
