package maow.datadriven.util;

import com.google.gson.Gson;

import java.io.InputStreamReader;

public class GsonUtil {
    private static final Gson gson = new Gson();

    public static <T> T fromJson(String path, Class<T> type) {
        return gson.fromJson(new InputStreamReader(IOUtil.getResourceAsStream(path)), type);
    }
}
