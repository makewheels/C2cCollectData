package util;

public class ProxyUtil {
    public static void setProxy() {
        String proxyHost = "127.0.0.1";
        String proxyPort = "1080";
        System.setProperty("http.proxyHost", proxyHost);
        System.setProperty("http.proxyPort", proxyPort);
        System.setProperty("https.proxyHost", proxyHost);
        System.setProperty("https.proxyPort", proxyPort);
    }
}
