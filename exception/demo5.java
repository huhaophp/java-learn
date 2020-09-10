package exception;

import sun.applet.Main;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Logger;

// Logging
public class demo5 {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
//        logger.info("start process...");
//        logger.warning("memory is running out...");
        logger.fine("ignored.");
//        logger.severe("process will be terminated...");
//        logger.info("打印的信息");
        String[] s = {"1", "2"};
        logger.info(Arrays.toString(s));

        Logger l = Logger.getLogger(Main.class.getName());
        logger.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            l.severe(e.toString());
        }
        logger.info("Process end.");
    }
}
