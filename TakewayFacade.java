
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
