package JAVA_ORIGIN.JavaIO.Encoding;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Practice {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String target = "base64 실습";
        byte[] changedBytes = target.getBytes("UTF-8");

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = encoder.encode(changedBytes);
        System.out.println(bytes);

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(bytes);
        String decodedString = new String(decodedBytes, "UTF-8");
        System.out.println(decodedString);

    }
}
