package JavaIO;

import java.io.*;

public class DataIOStream {

    //DataOutputStream은 OutputStream을 상속받아서 구현한다.
    //Java의 Primitive Type을 Java에서 해석가능한 코드로 내보낸다.



    public static void main(String[] args) throws IOException {

        // DataOutputStream을 열기 위해서는 일단은 FileOutputStream에 String을 넣어준다.
        String temp = "Hello World";

        int[] a = {10, 20};
        double b = 10.0;
        String c = "Hello";

        FileOutputStream out = new FileOutputStream(temp);

        DataOutputStream dataOut = new DataOutputStream(out);

        // 이 객체가 write 되는 위치는 대체 어디인가?
        dataOut.writeInt(a[0]);

    }


}
