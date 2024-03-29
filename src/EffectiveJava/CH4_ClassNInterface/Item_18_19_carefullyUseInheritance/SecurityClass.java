package EffectiveJava.CH4_ClassNInterface.Item_18_19_carefullyUseInheritance;

import java.awt.*;

public class SecurityClass extends List {

    private int index;
    private int[] indexis;
    private double[] multiIndexis;

    @Override
    public void addItem(String item) {
        if("Y".equals(item)) { // Y를 제외한 나며지를 Collection에 더한다.
            return;
        }
        super.addItem(item);
    }


    // ... 모든 List의 원소를 추가하는 메서드에 Validation 로직을 추가하여 안전하게 원하는 데이터만을 받도록 만들었다.


    // 1.1 버전에서 추가됨. >> 기존의 addItem을 사용하지 않고, 다른 사람이 add를 사용하면 Validation이 무시된다.
    // 상위 객체가 버전 릴리스( 변경 ) 될때마다 하위객체에도 영향이 오기 때문에 발생하는 문제 , 즉 캡슐화가 완전하지 못하여 생기는 문제이다.
    @Override
    public void add(String item) {
        super.add(item);
    }

    // 만일 릴리즈 전에 add() 메서드를 똑같은 시그니쳐로 추가했다면, 컴파일 과정에서 무시된다.

    // 시그니처가 정확히 일치하다면 Override로 취급되므로 그것 또한 문제발생의 여지가 있다.





}
