package EffectiveJava.CH1_ObjectMakeNDestroy.Item_1_useStaticFactoryMethod;

import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class NO1_StaticFactoryMethod {

    public static void main(String[] args) {



        // 1. 생성자 대신 정적 팩터리 메서드를 고려하라.

        // JAVA : boxed Type인 Boolean의 경우

        // Boolean의 Constructor는 Deprecated 되어있다.
        Boolean deprecatedBool = new Boolean(true); // Deprecated
        Boolean deprecatedBool2 = new Boolean(false); // Deprecated

        // Boolean의 Static Factory Method인 valueOf의 사용을 권장한다.
        Boolean bool = Boolean.valueOf("true"); // good to use

        // 왜 Static Factory Method를 사용하는가?
        // 1) 추가적인 설명이 가능하다.
        // 시그니처 ( modifiers, return type, name, parameters ) 하나로는 하나의 생성자만을 만들 수 있다.
        // ( 두 개 이상을 만드려면 매개변수 순서를 변경하거나 추가해야 하며, 이는 설명이 매우 부족해진다. )

        // example) Car Class의 예시를 들어보자.
        // Car Class의 생성자는 여러 개가 있지만, 각각 서로다른 "이름"을 받는다.

        // 아직까지는 이름을 구분할 수 있다.
        Car car1 = new Car("car1");
        Car car2 = new Car("car2", "owner2");
        Car car3 = new Car("car3", "owner3", "builder1");

        // Deisy가 주인인지, kelly가 차 이름인지 구분할 수 없다.
        // 매개변수가 5~10개 정도 된다면, 더더욱 혼란스러울 수 있다.
        Car car4 = new Car("Deisy", "kelly", "bill");

        // 값을 강제하면서도 Setter를 쓰지 않고 가독성 좋게 인스턴스를 생성하려면?
        // 정적 팩터리 메서드를 사용하라.
        // 순서 (매개변수의 정보) 를 직접 드러낼 수 있다.
        Car car5 = Car.CarNOwnerNBuilder("Deisy", "kelly", "bill");
        // 왜 이 매개변수를 넣는지 한번에 알 수 있다.
        Car car6 = Car.carWithNameNWheel("Deisy", 4);


        // 2) 성능 개선에 도움이 된다.
        // 엄청나게 비싼 비용을 가진 객체를 만들어보자. (크기가 10000인 fileList )
        File file = new File("C:\\Users\\user\\Desktop\\fileList.txt");
        List<File> fileList = new ArrayList<>();
        // 임의로 1000개의 file을 가진 List가 있다고 가정하자.
        for (int i = 0; i < 1000; i++) {
            fileList.add(file);
        }

        // 100번을 부를 때마다 매번 생성한다면 엄청난 비용을(시간을) 치뤄야 한다.
        System.out.println("시작 : " + Instant.now());
        for(int i = 0; i < 100; i++) {
            FolderInfoVO heavyVO = new FolderInfoVO(fileList);
            for ( File file1 : heavyVO.getFiles() ) {
                file1.exists();
                // 파일이 있는지를 체크
            }
        }
        System.out.println("끝 : " + Instant.now());

        System.out.println("시작 : " + Instant.now());
        FolderInfoVO lightVO = FolderInfoVO.searchAllFiles(fileList);
        for(int i = 0; i < 10; i++) {

            for ( File file1 : lightVO.getFiles() ) {
                file1.exists();
                // 파일이 있는지를 체크
            }
        }
        System.out.println("끝 : " + Instant.now());

        // 4초와 0.3초 차이로 약 10배 이상의 시간차이를 나타낸다.
        // 현재는 같은 Thread와 메서드 안이지만, 실제 서비스에서 잘못된 로직으로 0.3초가 4초가 된다면
        // 서비스에 심각한 장애가 발생할 수 있다.


        // 3) 반환 타입의 하위 객체를 자유롭게 설정 가능하다.
        // collectionFramework에서는 이런 경우가 많다.




        // 4) 입력 매개변수에 따라 다른 객체를 반환 할 수 있다.

        // 5) 반환값이 없어도 된다!




    }

}
