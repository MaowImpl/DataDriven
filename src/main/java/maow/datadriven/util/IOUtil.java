package maow.datadriven.util;

import java.io.InputStream;

public class IOUtil {
    public static InputStream getResourceAsStream(String path) {
        return IOUtil.class.getResourceAsStream("/" + path);
    }
}
