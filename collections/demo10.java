package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// Properties
// Java默认配置文件以.properties为扩展名，每行以key=value表示
public class demo10 {
    public static void main(String[] args) throws IOException {
        String configPath = "config/setting.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(configPath));
        String filepath = properties.getProperty("last_open_file");
        String interval = properties.getProperty("auto_save_interval", "120");
        // 获取不到默认为 null
        String appname = properties.getProperty("appname");
        System.out.println(filepath);
        System.out.println(interval);
        System.out.println(appname);
        // 写入配置
        properties.setProperty("appname", "test");
        properties.setProperty("appid", "20");
        properties.store(new FileOutputStream("config/setting.properties"), "output success");
    }
}
