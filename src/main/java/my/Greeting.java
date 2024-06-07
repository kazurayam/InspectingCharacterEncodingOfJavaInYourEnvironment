package my;
import java.nio.charset.Charset;

public class Greeting {

    public static void main(String[] args) {
        System.out.println("こんにちは世界");
        String[] names = {
            "java.version",
            "java.vm.version",
            "java.vendor.url",
            "java.file.encoding",
            "sun.jnu.encoding",
        };
        for (String name : names) {
            System.out.println(name + "=" + System.getProperty(name));
        }
        System.out.println("default encoding=" + Charset.defaultCharset().name());
    }
}