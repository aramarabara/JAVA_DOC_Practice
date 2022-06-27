import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {


        // system.out.printLn은 기본적인 출력을 하는 메소드이다.
        System.out.println("기본적인 입출력입니다.");

        //입력-출력을 하기 위해선 Stream이라는 "통로"가 필요하다.
        //Stream은 한 방향으로만 갈 수 잇다.
        // 즉, 입력과 출력을 진행하려면 입력과 출력을 각각 하나의 통로로 가져야 한다.

        FileInputStream fis = new FileInputStream("src/Thread/InputStream.java");
        FileOutputStream fos = new FileOutputStream("src/Thread/InputStream.java");

        int data = fis.read();
        while (data != -1) {
            fos.write(data);
            data = fis.read();
        }
        fis.close();
        fos.close();

        // 보조 스트림은 실제 파일 입출력을 진행하기보다는 입출력 기능을 보조한다.
        // 대표적으로 BufferedInputStream, BufferedOutputStream이 있다.
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/Thread/InputStream.java"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/Thread/InputStream.java"));



    }
}
