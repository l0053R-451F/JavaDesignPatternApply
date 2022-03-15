import java.io.IOException;
import java.io.FileWriter;
public class CreateFile {
    CreateFile(String username, String phone){
        try {
            FileWriter myWriter = new FileWriter("hotel.txt");
            myWriter.write(username);
            myWriter.write("\n");
            myWriter.write(phone);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
