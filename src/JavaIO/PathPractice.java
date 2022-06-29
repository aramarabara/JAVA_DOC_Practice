package JavaIO;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathPractice  {

    public static void main(String[] args) {

        // Path는 파일의 경로를 저장하는 객체이다.
        Path p1 = Paths.get("/tmp/foo");
        Path p2 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));

        Path p3 = Paths.get("foo", "bar");

        // Path.get은 다음의 축약이다
        Path p4 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");

        // 파일시스템의 정보를 객채지향적으로 접근할 수 있다.
        Path path = Paths.get("file:///Users/joe/FileTest.java");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        // . 과 .. 으로 현재폴더 및 상위폴더를 나타내는 Path들이 있다.
        ///home/./joe/foo
        ///home/sally/../joe/foo
        Path p11 = Paths.get("/home/logfile");
        // Result is file:///home/logfile
        System.out.format("%s%n", p1.toUri());


        if (args.length < 1) {
            System.out.println("usage: FileTest file");
            System.exit(-1);
        }


        // Path tutorial in Java docs
        // Converts the input string to a Path object.
        Path inputPath = Paths.get(args[0]);

        // Converts the input Path
        // to an absolute path.
        // Generally, this means prepending
        // the current working
        // directory.  If this example
        // were called like this:
        //     java FileTest foo
        // the getRoot and getParent methods
        // would return null
        // on the original "inputPath"
        // instance.  Invoking getRoot and
        // getParent on the "fullPath"
        // instance returns expected values.
        Path fullPath = inputPath.toAbsolutePath();



    }



}
