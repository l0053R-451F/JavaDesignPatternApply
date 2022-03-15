/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facademain;

/**
 *
 * @author avika
 */
public class TakewayFacade {
    private Kitchen food; 
    private Delivery driver;
  
    public TakewayFacade(Kitchen restaurant, Delivery driver){ 
    this.food = restaurant;
    this.driver = driver;


}

 
 

public void makeOrder() { 


int orderNbr = this.food.createOrder();
System.out.println("Order with number" + orderNbr + "created");
boolean isReady = this.food.isBakingDone();

if(isReady) {

System.out.println("Your food is ready!!");
String deliverProcessed = this.driver.deliverOrder(orderNbr);
System.out.println(deliverProcessed);


}


}
    
}
