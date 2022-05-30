package Dynamic_ClassLoader;

public class Computer extends Machine{

    public final String MACHINE_TYPE_A = "Computer";

    public Computer() {super();}

    public Computer(String name, String type, int price, String owner) {
        super(name, type, price, owner);
    }

    @Override
    /* 모든 기계는 작동한다. */
    /* 기계를 상속받는 모든 것들은 이 function을 Override 해야한다. */
    public String run(boolean power) {

        if(power) {
            return MACHINE_TYPE_A + "Running.......";
        } else {
            return MACHINE_TYPE_A + "........";
        }
    }


}
