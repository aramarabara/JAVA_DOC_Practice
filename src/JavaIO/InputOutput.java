package JavaIO;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {

        // 1. Java에서 제공하는 표준 입출력을 통해서 입력과 출력을 시도해 볼 수 있다.

        // system.out.printLn은 기본적인 출력을 하는 메소드이다
        System.out.println("기본적인 입출력입니다.");
        // System.in은 기본적인 입력을 하는 메소드이다.
        System.in.read();

        // 2. 입-출력을 위해서는 Stream( 단방향 데이터통로 ) 가 필요하다.
        // 단방향이므로 완전한 입출력을 위해서는 두 개가 필요하다.

        // ex) FileInputStream을 통해서 파일 경로를 옮길 수 있다.
        FileInputStream fis = new FileInputStream("C:\\Users\\fileIoTest\\temp.txt");
        // 파일을 출력할 때 사용한다. 현재 src 프로젝트 경로에 상대경로로 접근하여 JavaIo/temp.txt 파일을 생성한다.
        FileOutputStream fos = new FileOutputStream("src/JavaIO/temp.txt");

        // Stream은 바이트 단위로 읽어오는 과정이 필요하다. 반복문을 통해서 최소단위의 스트림을 read()로 읽어야 한다.
        int data = fis.read();
        while (data != -1) {
            fos.write(data);
            data = fis.read();
        }
        fis.close();
        fos.close();


        // 보조 스트림은 실제 파일 입출력을 진행하기보다는 입출력 기능을 보조한다.
        // 대표적으로 BufferedInputStream, BufferedOutputStream이 있다.
        // Stream 전송속도가 비약적으로 상승한다.
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int data2 = bis.read();
        while (data2 != -1) {
            bos.write(data2);
            data2 = bis.read();
        }
        System.out.println(data2);


        //실제 경로에 접근하여 파일을 체크할 수 있다.
        File file = new File("C:\\Users\\fileIoTest\\temp.txt");
        // 만약 없는 경로에 접근하면 예외가 발생한다.
        if(file.exists()) {
            System.out.println("파일이 존재합니다.");
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }

    }
}
