package pack.FileIO;
import java.io.*;

public class CharacterStreamOutput {
    public static void main (String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\yhalk\\IdeaProjects\\yhRep\\src\\pack\\Input");
            out = new FileOutputStream("C:\\Users\\yhalk\\IdeaProjects\\yhRep\\src\\pack\\Output2");

            int i = 0;
            while ((i = in.read()) != -1){
                out.write((char)i);

            }
        }
        finally{
            if (in != null){
                in.close();
                            }
            if (out != null){
                out.close();
            }

        }
    }
}
