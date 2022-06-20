package OOP.Modifier;

public class AbstractModifierClass {

    public static void main(String[] args) {

        Benz benz = new Benz();
        String res = benz.run(benz.useYourOwnEngine());



        /*
        * 엔진을 구현했을 때
        * */
        System.out.println(res);

        /*
         * 엔진을 구현하지 않았을 때 (에러가 뜬다 )
         * */
        res = benz.run(benz.engine);

    }
}
