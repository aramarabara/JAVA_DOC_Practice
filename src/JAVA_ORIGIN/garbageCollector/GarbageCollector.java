package JAVA_ORIGIN.garbageCollector;
import javax.management.ObjectName;
import java.lang.management.GarbageCollectorMXBean;

/**
 * JAVA 1.5 버전부터 구현가능한 GarbageCollectorMXBean을 사용하여 gb 정보를 출력해본다.
 */

/*
*  GB를 모니터링하며 메모리 누수를 확인하는데 사용된다.
*  특히 Jstat, gcutil 등의 코드에 사용된다.
* */

/*
* OpenJDK에서 제공하는 HotSpot (발전된 JVM )에 Jstat등의 툴이 포함되어있으며,
* 그 원본이 되는 모니터링 코드가 바로 GarbageCollectorMXBean을 활용한 것이다.
* 출처 : http://daplus.net/java-jvm%EA%B3%BC-hotspot%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90%EC%9D%80-%EB%AC%B4%EC%97%87%EC%9E%85%EB%8B%88%EA%B9%8C/
* 영상 : https://www.youtube.com/watch?v=f0bdSMZoCw8
*
* */

/*
*  현재 오라클에서 제공하는 vmOption으로 hotSpot을 사용 가능하다.
* 출처 :  https://www.oracle.com/java/technologies/javase/vmoptions-jsp.html
*
* */
public class GarbageCollector{

    GarbageCollectorMXBean gbBean = new GarbageCollectorMXBean() {

        @Override
        public ObjectName getObjectName() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public boolean isValid() {
            return false;
        }

        @Override
        public String[] getMemoryPoolNames() {
            return new String[0];
        }

        @Override
        public long getCollectionCount() {
            return 0;
        }

        @Override
        public long getCollectionTime() {
            return 0;
        }
    };

}
