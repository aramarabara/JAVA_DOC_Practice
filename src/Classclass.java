import Animal.Animal;
import Machine.A_Machine;

public class Classclass {

    /**
     * 기존의 Machine과 Animal을 빌드하여 JAR파일 출력, 외부 라이브러리로 재호출 성공하였다.
     */
    public static void main(String[] args) {
        System.out.println("hello");

        Animal animal = new Animal();

        System.out.println(animal.eat());

        A_Machine machine = new A_Machine();

        System.out.println(machine.run(true));
        System.out.println(machine.run(false));

    }

}
