package OOP.Modifier;

public abstract class AbstractCar {

    Engine engine;
    /*
     * 3. abstract : 추상화로 메서드를 완성시키기 전까지는 인스턴스화를 금지한다.
     * 혹은, 단순히 같은 기능을 Class 형태로 묶어서 분류만 할때도 사용한다 ( 인스턴스화 해서 사용하지는 말라는 의미 )
     * */
    /*
     * 자동차의 예시를 들어보자. 만약 자동차를 Class로 만들고, 엔진을 사용자가(Client) 끼울 수 있게 한다면 어떨까.
     * 만약 실수로라도 엔진이 없는 자동차가 만들어지고, 시동을 걸게 된다면 망가질 수 있을 것이다(Exception 발생)
     *
     * 이미 망가지고 나면, 원인 파악을 위해서 많은 시간을 들여야 하지만
     * 애초에 엔진을 무조건 가져와서 넣게 해야만 자동차 완성품(Instance)이 만들어지게 강제한다면
     * 에러처리에 들어가는 엄청난 비용을 아낌과 동시에, 코드의 의도가 확실해지게 된다.
     *
     * */

    abstract Engine useYourOwnEngine();

    public String run(Engine engine) {
        if(engine == null) {
            throw new IllegalArgumentException();
        }
        return "car is running with" + engine.getName() + "Engine";
    }

}
