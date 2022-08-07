package EffectiveJava.ExampleCode;

import java.util.List;

public class FileType {

    /** The Constant 파일유형 - 첨부파일. */
    private final String FILE_TYPE_FILE;

    /** The Constant 파일유형 - 로고이미지. */
    private final String FILE_TYPE_LOGO;

    /** The Constant 파일유형 -홍보로고이미지. */
    private final String FILE_TYPE_PRLOGO;

    /** The Constant 파일유형 -인장. */
    private final String FILE_TYPE_SEAL;

    private List<String> UserCustomFileType;

    public FileType(List UserCustomFileType) {
        this.FILE_TYPE_FILE = "F";
        this.FILE_TYPE_LOGO = "L";
        this.FILE_TYPE_PRLOGO = "R";
        this.FILE_TYPE_SEAL = "S";
        this.UserCustomFileType = UserCustomFileType;
    }

    public List<String> getUserCustomFileType() {
        return UserCustomFileType;
    }

    public void setUserCustomFileType(List<String> userCustomFileType) {
        UserCustomFileType = userCustomFileType;
    }

    public String getConstants() {
        return FILE_TYPE_FILE + ", " + FILE_TYPE_LOGO + ", " + FILE_TYPE_PRLOGO + ", " + FILE_TYPE_SEAL;
    }
}
