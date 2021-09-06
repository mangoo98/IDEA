import java.io.*;

public class Box implements Serializable{

    private int width = 50;
    private int heigh = 40;

    public static void main(String[] args) {

        Box mybox = new Box();
        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(mybox);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
