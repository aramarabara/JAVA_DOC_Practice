package JavaIO.Encoding;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEncodedPractice {

    public static void main(String[] args) throws IOException {

        // URL은 Uniform Resource Locator의 약자로, 웹 서버에서 제공하는 주소를 의미한다.
        // 한글 등의 언어는 url 변환 시에 %를 활용하는
        // urlEncode가 필요하다.
        // MalfomedURLException은 url로 파싱 불가능한 문자열이 존재할 때 발생한다.
        // URL의 구조는 RFC2396에 따라 정의되어 있다.
        URL url = new URL("http://www.example.com/docs/resource1.html");

        // Fragment 정보는 #로 시작하며, 전체 URL에 추가정보를 붙이는 역할을 한다.
        URL urlThatHaveFragment = new URL("http://www.example.com/index.html#chapter1");

        // relative URL, 상대적인 URL을 의미한다.
        // 기존 Path의 Symbolic Link와 유사하다
        URL relativeURL = new URL("example.com");
        URL relativeURLSpecified = new URL(relativeURL, "http://www.example.com");

        // Java에서 제공하는 여러 메서드를 통해 URl의 정보를 얻을 수 있다.
        // getProtocol() : 접속하는 서버의 프로토콜을 반환한다.

        url.getContent();

        // URI는 Uniform Resource Identifier의 약어로, 공용적인 주소를 의미한다.


    }






}
