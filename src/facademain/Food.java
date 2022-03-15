/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facademain;

/**
 *
 * @author avika
 */
public class Food {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      


 

SetMenu food = new SetMenu(); 


Waiter waiter = new Waiter(); 


TakewayFacade takewayFacade = new TakewayFacade(food,waiter); 


takewayFacade.makeOrder(); 

 

}

 
    }
    

