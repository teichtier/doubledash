package game;


import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.InputStream;

/**
 * @since 16.11.2015
 */
public class Utils {

    public static BufferedImage loadImage(String name) throws Exception {
    	InputStream stream = null;
    	try {
    		stream = Utils.class.getResourceAsStream("/resources/images/" + name);
    		return ImageIO.read(stream);
    	} catch (Exception e) {
    		throw e;
    	} finally {
    		if (stream != null)
    			stream.close();
    	}
    	
        
    }
}
