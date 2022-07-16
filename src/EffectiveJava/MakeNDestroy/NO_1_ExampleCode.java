package EffectiveJava.MakeNDestroy;

import jdk.internal.reflect.Reflection;

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
        // JDBC DriverManger의 경우 생성자를 private으로 막아놓았다.
        //DriverManager manager = new DriverManager();

        // JDBC DriverManager는 Connection 객체를 field로 가지고있지 않지만,
        // 안의 메서드로 Connection을 받아 반환하는 것이 가능하다.
        // 만약 생성자를 활용했다면, DriverManger와 Connection이 상속관계로 얽혀있어야 가능했을 것이다.

        // getConnection이라는 static Factory Method가 reflection을 활용하여 Caller의 클래스를 알아내어서
        // 반환한다.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        // Service Provider Framework? ( SPF? SPI? )
        // 인터페이스 사용과 밀접한 연관이 있는 듯 한데..
        // 그럼 Abstract Class처럼 인터페이스를 강제하지 않고서도 무조건 생성자로 생성하게 만드는건가?
        // 즉, interface를 강제하지는 않지만 결국 instance화 하려면 인터페이스를 넣어주어야 하는..?
        // 그건 아니다. interface가 초기값을 가지지 못하는 것과 달리
        // Static Factory Method는 기본적으로 반환되는 Instance를  가질 수 있다.

        // 결국 constructor 의 선언부에 강제되는 return type을 피해서 더 자유롭게 구성할 수 있다는 뜻

        // 1. interface는 구현체가 있어야 한다..
        // 그리고 Override를 강제한다. ( 기본값을 가지기 어려움 )
        // implements로 관계를 만들어서 사용해야 한다.

        // 2. Static Factory Method는 자기 자신을 통해 인스턴스를 구현한다.
        // FactoryMethod이기 때문에 기본값을 가질 수 있다.
        // 그리고, Reflection을 활용한다면 사용자가 새로 만든 전혀 모르는 타입도 활용할 수 있다.
        // ( 생성자는 반환값이 지정되어 있어 불가능.. )

        /*public static Connection getConnection(String url,
                String user, String password) throws SQLException {
            java.util.Properties info = new java.util.Properties();

            if (user != null) {
                info.put("user", user);
            }
            if (password != null) {
                info.put("password", password);
            }

            // 이 부분에서 reflection을 활용하여 클래스 정보를 추출한다.
            return (getConnection(url, info, Reflection.getCallerClass()));

            // 보통 DriverClass는 드라이버마다 다 다른데, reflection을 통해서 현재 삽입된 클래스와
            // 드라이버 간의 관계를 조명할 수 있다.
            // 또한 이런 타입체크를 하면서 동시에 새로운 타입으로 객체를 되돌려 줄 수 있다..

        }*/



    }

}
