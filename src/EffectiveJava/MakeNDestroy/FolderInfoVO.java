package EffectiveJava.MakeNDestroy;

public class FolderInfoVO {

    private String folderId;
    private String cmpId;
    private String empId;
    private String folderNames;
    private String folderName;
    private String parentFolderId;

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

    public static FolderInfoVO createVOFORSearchParentFolder(String folderId, String cmpId, String empId, String folderNames, String folderName, String parentFolderId) {
        return new FolderInfoVO(folderId, cmpId, empId, folderNames, folderName, parentFolderId);
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

}
