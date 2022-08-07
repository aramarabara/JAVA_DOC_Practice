package EffectiveJava.ExampleCode;

public class CmmFileBeanCustom {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4283471324238531001L;

    private FileType fileType;



    public String id_prefix;

    public CmmFileBeanCustom(String primaryKey, FileType fileType) {
        this.id_prefix = primaryKey;
        this.fileType = fileType;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public String getId_prefix() {
        return id_prefix;
    }

    public void setId_prefix(String id_prefix) {
        this.id_prefix = id_prefix;
    }
}
