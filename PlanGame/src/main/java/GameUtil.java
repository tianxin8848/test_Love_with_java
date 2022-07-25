import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    private GameUtil(){
    }
    public static Image getImage(String path){
        BufferedImage bi  = null;
        try{
            bi = ImageIO.read(GameUtil.class.getResourceAsStream(path));

        }catch (IOException e){
            e.printStackTrace();
        }
        return bi;
    }
}
