package Machine;

/**
 *
 * JAR 파일로 동적으로 로딩할 Mouse
 *
 */
public class Mouse extends A_Machine {

    public final String MACHINE_TYPE_B = "mouse";

    public Mouse() {
        super();
    }

    public Mouse(String name, String type, int price, String owner) {
        super(name, type, price, owner);
    }

    @Override
    /* 모든 기계는 작동한다. */
    /* 기계를 상속받는 모든 것들은 이 function을 Override 해야한다. */
    public String run(boolean power) {

        if(power) {
            return MACHINE_TYPE_B + "Running.......";
        } else {
            return MACHINE_TYPE_B + "........";
        }
    }


}

