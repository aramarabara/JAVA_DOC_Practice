package OOP.Interface.Abstract;

// 상속관계가 없지만 Car과 Machine이라는 이름의 상위 개념으로 묶고 싶다.
public class Computer {


    // owner 속성과 use() 기능을 묶어서 관리하고 싶다..
    // Machine이라면 공통으로 가지는 속성이기 때문이다.
    public String owner;
    public String color;

    public void use() {
        System.out.println("Computer uses");
    }


}
