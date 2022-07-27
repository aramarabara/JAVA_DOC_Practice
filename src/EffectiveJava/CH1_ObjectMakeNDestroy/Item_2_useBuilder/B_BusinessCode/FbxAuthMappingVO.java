package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode;

public class FbxAuthMappingVO {

    private String authYn;
    private String lwPrtYn;
    private String itemSe;
    private String foIderId;
    private String trgtId;
    private String useYn;

    public String getAuthYn() {
        return authYn;
    }

    public void setAuthYn(String authYn) {
        this.authYn = authYn;
    }

    public String getLwPrtYn() {
        return lwPrtYn;
    }

    public void setLwPrtYn(String lwPrtYn) {
        this.lwPrtYn = lwPrtYn;
    }

    public String getItemSe() {
        return itemSe;
    }

    public void setItemSe(String itemSe) {
        this.itemSe = itemSe;
    }

    public String getFoIderId() {
        return foIderId;
    }

    public void setFoIderId(String foIderId) {
        this.foIderId = foIderId;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    @Override
    public String toString() {
        return "FbxAuthMappingVO [authYn=" + authYn + ", lwPrtYn=" + lwPrtYn + ", itemSe=" + itemSe + ", foIderId="
                + foIderId + ", trgtId=" + trgtId + ", useYn=" + useYn + "]";
    }
}
