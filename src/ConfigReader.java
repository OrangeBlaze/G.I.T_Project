import javax.annotation.processing.FilerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by KungFuDounut on 2016/09/18.
 */
public class ConfigReader {
    private File configFile = null;
    private int width = 0;
    private int height = 0;

    public ConfigReader(){
        try {
            configFile = new File("Config.ini");
            Scanner reader = new Scanner(configFile);
            while(reader.hasNext()){
                String line = reader.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(line," ");
                if(stringTokenizer.nextToken().contains("Width")){
                   // width = stringTokenizer.nextToken();
                }
            }
        }
        catch(FileNotFoundException e){
            e.getStackTrace();
        }
    }

    public int getWidth(){
        return width;
    }
}
