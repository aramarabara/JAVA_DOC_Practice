package OOP.Modifier;

public class Benz extends AbstractCar{

    /* 무조건 Engine을 구현해야만이 차를 만들 수 있게 된다. */
    @Override
    Engine useYourOwnEngine() {
        Engine engine = new Engine();
        engine.setName("Engine");
        return engine;
    }

}
