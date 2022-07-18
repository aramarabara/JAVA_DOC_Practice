package EffectiveJava.CH1_ObjectMakeNDestroy.Item_1_useStaticFactoryMethod;

import java.io.File;
import java.util.List;

public class FolderInfoVO {

    private String folderId;
    private String cmpId;
    private String empId;
    private String folderNames;
    private String folderName;
    private String parentFolderId;

    private List<File> files;

    // JavaBean 패턴 활용을 위한 생성자
    public FolderInfoVO() {

    }

    // 값을 강제하기 위한 생성자
    public FolderInfoVO(String folderId, String cmpId, String empId, String folderNames, String folderName, String parentFolderId) {
        this.folderId = folderId;
        this.cmpId = cmpId;
        this.empId = empId;
        this.folderNames = folderNames;
        this.folderName = folderName;
        this.parentFolderId = parentFolderId;
    }

    public FolderInfoVO(List<File> files) {
        this.files = files;
    }


    public static FolderInfoVO createVOFORSearchParentFolder(String folderId, String cmpId, String empId, String folderNames, String folderName, String parentFolderId) {
        return new FolderInfoVO(folderId, cmpId, empId, folderNames, folderName, parentFolderId);
    }

    public static FolderInfoVO searchAllFiles(List<File> files) {
        return new FolderInfoVO(files);
    }

    public String getFolderId() {
        return folderId;
    }
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
    public String getCmpId() {
        return cmpId;
    }
    public void setCmpId(String cmpId) {
        this.cmpId = cmpId;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getFolderNames() {
        return folderNames;
    }
    public void setFolderNames(String folderNames) {
        this.folderNames = folderNames;
    }
    public String getFolderName() {
        return folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public String getParentFolderId() {
        return parentFolderId;
    }
    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public List<File> getFiles() {
        return files;
    }
    public void setFiles(List<File> files) {
        this.files = files;
    }

}
