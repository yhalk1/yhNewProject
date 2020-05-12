package pack.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamInput {

    public static void main (String[] args) throws IOException {

        FileInputStream in = null;

        try {
            in = new FileInputStream("C:\\Users\\yhalk\\IdeaProjects\\yhRep\\src\\pack\\Input");

            int i = 0;
            while ((i = in.read()) != -1){
                System.out.print((char)i);
            }
        }
        finally{
            if (in != null){
                in.close();
            }

        }
    }
}
