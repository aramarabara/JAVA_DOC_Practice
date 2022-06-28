package JavaIO;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {


        // system.out.printLn은 기본적인 출력을 하는 메소드이다.
        System.out.println("기본적인 입출력입니다.");

        //입력-출력을 하기 위해선 Stream이라는 "통로"가 필요하다.
        //Stream은 한 방향으로만 갈 수 잇다.
        // 즉, 입력과 출력을 진행하려면 입력과 출력을 각각 하나의 통로로 가져야 한다.


        // 이 로직은 특정 경로의 파일을 가져와서 현재 프로젝트 경로에 붙여넣는 기능을 한다.
        // 파일을 입력할 때 사용한다. c드라이브에 있는 txt파일을 가져온다.
        FileInputStream fis = new FileInputStream("C:\\Users\\fileIoTest\\temp.txt");
        // 파일을 출력할 때 사용한다. 현재 src 프로젝트 경로에 상대경로로 접근하여 JavaIo/temp.txt 파일을 생성한다.
        FileOutputStream fos = new FileOutputStream("src/JavaIO/temp.txt");

        // 반복문을 통해서 Stream을 읽어낸다.
        int data = fis.read();
        while (data != -1) {
            fos.write(data);
            data = fis.read();
        }
        fis.close();
        fos.close();

        // 이런 표준 입출력을 사용하면 굳이 Close()처리를 하지 않아도 된다.
        //System.out.println(data);

        // 보조 스트림은 실제 파일 입출력을 진행하기보다는 입출력 기능을 보조한다.
        // 대표적으로 BufferedInputStream, BufferedOutputStream이 있다.
        // Stream 전송속도가 비약적으로 상승한다.
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\10MBFILE.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/Thread/InputStream.java"));

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

        // 파일의 전체 경로를 알아내는 메소드이다.
        System.out.println(file.getAbsolutePath());
        // 파일의 이름을 알아내는 메소드이다.
        System.out.println(file.getName());
        // 파일의 크기를 알아내는 메소드이다.
        System.out.println(file.length());

        //등등 다양한 메서드들을 통해 file에 관한 정보를 가져올 수 있다.

    }
}
