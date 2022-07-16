package EffectiveJava.MakeNDestroy_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

public class NO_1_ExampleCode {

    public static void main(String[] args) throws SQLException {

        // 현재 FbxFolderFileInfoVO를 만들기 위해서는 반드시
        // 이러한 값들이 들어가야 한다.
        FolderInfoVO v = new FolderInfoVO();
        v.setFolderId("FLD_123456789");
        v.setCmpId("123456789");
        v.setEmpId("123456789");
        v.setFolderName("임시폴더");
        v.setParentFolderId("FLD_123456790");

        // 어떤 로직에서 값을 이렇게 잘못 넣었다고 해보자.
        // 그러면 부모폴더를 찾아야 하는데, 핵심이 되는 값이 없다.
        // 컴파일 오류도 나지 않으므로, 런타임 시 전혀 예상치 못한 곳에서 (EX, Mapper에서)
        // 오류가 발생하여 추적에 많은 시간이 소요된다.
        FolderInfoVO v1 = new FolderInfoVO();
        v1.setFolderId("FLD_123456789");
        v1.setCmpId("123456789");
        v1.setEmpId("123456789");
        v1.setFolderName("임시폴더");

        // constructor를 사용하면 필수값을 강제할 수 있다.
        // 그러나 v2가 대체 무슨 목적으로 사용되는지 알 수 없다.
        FolderInfoVO v2 =
                new FolderInfoVO("FLD_123456789", "123456789", "123456789",
                        "임시폴더", "임시폴더", "FLD_123456790");

        // 이제 이 VO가 부모폴더를 찾기 위하여 생성되었다는 것을 알 수 있다.
        // 또, Static 이므로 캐싱처리되어 빠른 속도를 자랑한다.
        // ( 비용이 크다면 static 고려 )
        FolderInfoVO v3 = FolderInfoVO.createVOFORSearchParentFolder("FLD_123456789", "123456789", "123456789",
                                                                "임시폴더", "임시폴더", "FLD_123456790");


        // 반환 타입의 하위 타입 객체를 자유롭게 선택할 수 있다.
        // Java의 Collection Framework가 예시

        // : 인터페이스에 사용할 수 잇는 여러가지 Util Class로, Collections에서 얻도록 함.
        Collections.addAll(null);
        Collections.asLifoQueue(null);

        // 이런 방식으로 45개의 Util을 사용할 수 있음.
        // 동반 클래스(Companion Class) 방식을 사용하여 인스턴스화 불가인 클래스에게 클래스를 만들어 호출함.

        // interface를 통해서 이 Util들을 공개하지 않고서도, 사용할 수 있다.
        Collection collection = new ArrayList<>();
        // 굳이 저 Util들의 기능을 이해할 필요 없이, CollectionFramework가 제공하는 ArrayList등의 구현체만을
        // 사용할 줄 알면 된다.


        // 입력 매개변수에 따라 각기 다른 클래스의 객체를 반환할 수 있다.

        EnumSet<EnumExample> enumSet = EnumSet.of(EnumExample.USER, EnumExample.USER2); // 이런식으로 사용할 수 있다.
        // ETC..

        EnumSet<EnumExample> jumboEnumSet = EnumSet.of(EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,
                EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER,EnumExample.USER
                );
        // 예시, Enum, 원소가 64개 이상이면 JumboEnumSet 제공한다.
        // 즉 버전이 바뀐다 해도 EnumSet을 상속하는 객체를 던져주기만 하면 된다.
        //        public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) {
        //            Enum<?>[] universe = getUniverse(elementType);
        //            if (universe == null)
        //                throw new ClassCastException(elementType + " not an enum");
        //
        //            if (universe.length <= 64)
        //                return new RegularEnumSet<>(elementType, universe);
        //            else
        //                return new JumboEnumSet<>(elementType, universe);
        //
        //            // 이렇게 RegularEnumSet과 JumboEnumSet을 각각 다르게 던져준다.
        //        }

        // 만약 원소가 33개일때 특수한 작용을 하는 EnumSet33 이 추가되더라도, EnumSet만을 상속받으면 되므로, 기존코드에 영향이 없다.
        // 이런 경우에는 평소처럼 EnumSet을 상속받아서 구현하면 된다.
        //        public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) {
        //            Enum<?>[] universe = getUniverse(elementType);
        //            if (universe == null)
        //                throw new ClassCastException(elementType + " not an enum");
        //
        //            if (universe.length <= 64)
        //                return new RegularEnumSet<>(elementType, universe);
        //           else if (universe.length <= 33)
        //              return new EnumSet33<>(elementType, universe);
        //            else
        //                return new JumboEnumSet<>(elementType, universe);
        //
        //        }


        // 작성하는 시점에서 반환할 객체의 클래스가 존재하지 않아도 된다.
        // DriverManager는 Database 연결에 핵심적인 구현을 맡는 Service 로직을 가지고 있다.
        // 그러나, 일반 생성자가 private으로 막혀 있다.

        //** DriverManager manager = new DriverManager();

        // 이 DriverManger를 활용하기 위해서는 .getConnection() 을 통해서 정보를 전달해야 한다.
        // 여기서 반환되는 Connection 객체를 ojdbc8의 클래스를 통해 자세히 살펴보자.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        //1.  ojdbc8 driver는 SP(SPI의 구현체)로써 META-INF에 진입점이 되는 경로가 작성되어 있다.
        // ** 직접 확인필요

        //2. JDBC는 Driver( 드라이버 ) 를 SPI ( Service Provider Interface )로써 제공하며, OracleDriver는 이를 impelement하는 클래스이다.
        // 즉, 확장된 Driver이다.

        //3. OracleDriver는 Driver 클래스에서 Override한 getConnection을 활용하여 Connection Interface의 구현체를 만든다.
        // 이때, OracleDriver가 반환하는 Connection 클래스는 기존의 Conneciton클래스와는 달리 엄청나게 많은 Interface와 구현체들을 가지고 있다.
        // 즉, 시스템이 가지고있지 않은 인터페이스들을 가지고 있다.

        // 그러나, 당장에 System이 이 수많은 subInterface를 가지고 있지 않더라도, ClassLoader가 OracleDriver를 동적으로 컴파일하면 같이 생겨나게 되며,
        // Static Factory Method를 활용하면 이렇게 Connection이라는 전혀 다른 타입, 또 사용자가 커스터마이징하여 구현한 Connection타입을 반환할 수 있다.
        // 이는 존재하지 않는 클래스들을 외부파일을 통해서 반환할 수 있다는 엄청난 유연성을 제공한다..
        // ( 물론, Constructor로도 ClassLoader를 사용할 수 없는 것은 아니지만, 반환 타입이 제한된다는 치명적인 문제점이 있어
        // 가독성과 메서드의 직관성이 떨어지게 된다. )

    }

}
