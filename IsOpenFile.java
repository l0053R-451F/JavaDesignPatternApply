import java.io.File;
import java.util.Scanner;
public class IsOpenFile {
    public boolean open = true;
    IsOpenFile(){
        try {
            File myObj = new File("hotel.txt");
            Scanner myReader = new Scanner(myObj);
            String data = myReader.nextLine();
            myReader.close();
            if(data == ""){
                open = false;
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Boolean openfile(){
        return this.open;
    }
}
