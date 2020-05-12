package pack.FileIO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamOutput {
    public static void main (String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("C:\\Users\\yhalk\\IdeaProjects\\yhRep\\src\\pack\\Input");
            out = new FileWriter("C:\\Users\\yhalk\\IdeaProjects\\yhRep\\src\\pack\\Output");

            int i = 0;
            while ((i = in.read()) != -1){
                out.write((char)i);

            }
        }
        finally{
            if (in != null){
                in.close();
                out.close();
            }

        }
    }
}
