package exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sun.applet.Main;

public class demo6 {
    static final Log log = LogFactory.getLog(demo6.class);

    public static void main(String[] args) {
        System.out.println(Main.class.getName());
        log.info("start...");
        log.warn("end.");
        log.error("errr");
        foo();
    }

    public static void foo() {
        log.error("aaa");
    }
}
