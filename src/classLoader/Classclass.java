package classLoader;

import java.io.IOException;

public class Classclass {

    /**
     *  The Structure of the Java Virtual Machine (출처)
     *  Link : https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-2.html
     *  Important Class Libraries
     *  -reflection
     *  -ClassLoader : 현재 학습중인 ClassLoader
     *  -interface
     *  -security
     *  -Thread
     *  -reference
     *
     *  빌드된 클래스파일을 동적으로 컴파일하여, 필요한 부분만을 메모리에 올린다.
     *  (* jar파일을 외부에서 주입해서 동적으로 할당 역시 가능 )
     *
     */

    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException {
        /*
         *   1. class파일을 Intellij로 빌드하기
         *       * JAR파일로 만들어 외부 라이브러리 적용하기
         *   A_Machine과 Animal이라는 타입을 JAR파일로 빌드,
         *   외부 라이브러리로 첨부하여 할당한다.
         *
         * */
        /*while(true) {
            Animal animal = new Animal();
            A_Machine machine = new A_Machine();
            // 확인 작업
            System.out.println(animal.eat());
            System.out.println(machine.run(true));
        }*/
        /*
        *   2. Custom_classLoader를 불러 동적 JAR 할당을 시도한다.
        *
        *
        * */

        /*JarClassLoader jarLoader = new JarClassLoader();
        // JAR파일에 대한 path 삽입 시 동적으로 할당하는 외부 라이브러리
        // io 및 classCastException을 throw 해준다
        jarLoader.add("Machine");
        jarLoader.add("Desktop_Path");
        //ClassNotFoundException 추가한다.
        jarLoader.loadClass("Animal");
*/
        // 동적 로드 시도하여 클래스가 제대로 로드된다면 성공

    }

}
