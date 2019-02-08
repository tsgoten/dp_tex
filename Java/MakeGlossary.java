import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class MakeGlossary {
    public MakeGlossary(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("vocab.txt"));
            PrintStream out = new PrintStream(new FileOutputStream("vocabOut.txt"));
            System.setOut(out);
            String line = "";
            while((line = reader.readLine()) != null){
                int colonIndex = line.indexOf(":");
                System.out.println("\\vocab{" + line.substring(0,colonIndex+1) + " }" + line.substring(colonIndex+1));
                
            }
        }catch(IOException e){

        }
    }
    public static void main (String [] args){
        MakeGlossary app = new MakeGlossary();
    }
}