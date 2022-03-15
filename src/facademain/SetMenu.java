/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facademain;

import java.util.Random;

/**
 *
 * @author avika
 */
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
