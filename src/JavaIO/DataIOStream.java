package JavaIO;

import java.io.*;
import java.nio.file.Files;

public class DataIOStream {

    //DataOutputStream은 OutputStream을 상속받아서 구현한다.
    //Java의 Primitive Type을 Java에서 해석가능한 코드로 내보낸다. (Java만이 사용가능)
    public static void main(String[] args) throws IOException {

        // DataOutputStream을 열기 위해서는 일단은 FileOutputStream에 String을 넣어준다.
        String temp = "Hello World";

        int[] a = {10, 20};
        double b = 10.0;
        String c = "Hello";

        // 실제 실행시켜 본다면, Helloworld라는 파일은 프로젝트 바로 밑에 생성된다.
        FileOutputStream out = new FileOutputStream(temp);
        DataOutputStream dataOut = new DataOutputStream(out);
        dataOut.writeInt(a[0]);

        // 다시 가져온다면, Int값을 읽어낼 수 있다.
        DataInputStream dataIn = new DataInputStream(new FileInputStream("Hello World"));
        int dataInput = dataIn.readInt();
        System.out.println("읽어낸 Int는 : " + dataInput);

        // 반드시 Close()처리를 해줘야 한다.
        // 만일 Close()처리를 하지 않은 상태에서 파일에 동시 접근한다면 Exception, 혹은 쓰레드 락이 걸릴수도 있다.
        out.close();
        dataOut.close();
        dataIn.close();


        // 다음시연을 위해 파일을 삭제
        Files.deleteIfExists(new File("Hello World").toPath());


    }


}
