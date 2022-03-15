import java.util.*;
import java.util.Scanner;
public class Hotel{
    public static void main(String[] args) {
        //------------------Room Details-------------//
        RoomDetails roomdetails = new RoomDisplay();
        roomdetails.accept(new RoomDisplayVisitor());
        RoomFactory roomFactory = new RoomFactory();
        System.out.print("Enter your Choice which room you want: ");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        
        if(choice == 1){
            GetUserDetails gud = new GetUserDetails("single");
        }
        else if(choice == 2){
            GetUserDetails gud = new GetUserDetails("double");
        }
        else if(choice == 3){
            GetUserDetails gud = new GetUserDetails("luxuary");
        }

        System.out.print("\nNeed Food:\n1.Yes\n2.No");
        int c = sc.nextInt();
        if(c == 1){
            IsOpenFile iof = new IsOpenFile();
            if(iof.openfile()){
                SetMenu food = new SetMenu();
                Waiter waiter = new Waiter();
    
                TakewayFacade takewayFacade = new TakewayFacade(food, waiter);
        
                takewayFacade.makeOrder();
            }
        }else{
            System.exit(0);
        }

    }
}
