package EffectiveJava.ExampleCode;

import java.util.Objects;

public class FileBean {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4283471324238531001L;


    /** The Constant 파일유형 - 첨부파일. */
    public static final String FILE_TYPE_FILE = "F";

    /** The Constant 파일유형 - 로고이미지. */
    public static final String FILE_TYPE_LOGO = "L";

    /** The Constant 파일유형 -홍보로고이미지. */
    public static final String FILE_TYPE_PRLOGO = "R";

    /** The Constant 파일유형 -인장. */
    public static final String FILE_TYPE_SEAL = "S";

    public String id_prefix;

    public FileBean(String primaryKey) {
        this.id_prefix = primaryKey;
    }

    public String getID_PREFIX() {
        return Objects.requireNonNullElse(id_prefix, "");
    }

    public void setID_PREFIX(String ID_PREFIX) {this.id_prefix = ID_PREFIX;}

    public String getConstants() {
        return FILE_TYPE_FILE + ", " + FILE_TYPE_LOGO + ", " + FILE_TYPE_PRLOGO + ", " + FILE_TYPE_SEAL;
    }
}
