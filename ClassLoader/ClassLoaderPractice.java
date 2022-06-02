package ClassLoader;

import Machine.A_Machine;

import java.util.*;

public class ClassLoaderPractice {

    /**
     * classLoader
     *
     * * Dynimic Class Loading
     *
     // REFERENCE : https://youtu.be/J_vAwYpRbhs, Java InterView Questions make easy
     *  REFERENCE 2 : https://youtu.be/mUWGDW4ly1I, Dynamic Class Loading in Java || Java ClassLoader and Class forName example
     *
     * Definition : ClassLoader load .class files into the JVM at runtime
     *
     * Type : Threee main Type of ClassLoader :
     * 1)  BootStrap, load all the java core libraries. ( like java.lang )
     * 2) Extension, load jarfile at $JAVA_HOME$\lib\ext
     * 3) System ClassLoader load classes from CLASSPATH
     *
     * if classLoader can't find class, JAVA Throws classNotFoundException
     *
     */

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        /**/

        /*practice for Basic architecture of JAVA Dynamic loading, CLassLoader */
        while (true) {

            String path = "Machine";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the class name : ");
            String classname = sc.nextLine();

            try {
                /* ClassLoader 등을 활용할 때는 CLassNotFoundExcetption을 던져주는 것이 좋다. */
                Class cls = Class.forName(path + "." + classname);
                /* InstantiateExcetption, */
                Object obj = cls.newInstance();
                System.out.println(((A_Machine) obj).run(true));

                //SystemClassLoader를 활용
                ClassLoader loader = ClassLoader.getSystemClassLoader();
                Class cls2 = loader.loadClass(path + "." + classname);
                Object obj2 = cls2.newInstance();
                System.out.println(((A_Machine) obj2).run(true));

                break;
                /* JAVA는 CLASSPATH를 추적해서 상황에 맞게 특정 클래스들을 로딩한다.*/
                /* 동적 로딩의 장점은 무엇인가..? */

            } catch (ClassNotFoundException e) {
                // 로그남기기
                e.printStackTrace();
            }
        }


    }


}
