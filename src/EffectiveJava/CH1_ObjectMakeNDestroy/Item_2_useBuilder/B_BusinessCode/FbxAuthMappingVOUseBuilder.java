package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.B_BusinessCode;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode.NutritionFacts_Builder;

public class FbxAuthMappingVOUseBuilder {

    private String authYn;
    private String lwPrtYn;
    private String itemSe;
    private String foIderId;
    private String trgtId;
    private String useYn;


    public static class builder {
        private String authYn;
        private String lwPrtYn;
        private String itemSe;
        private String foIderId;
        private String trgtId;
        private String useYn;

        public builder authYn(String authYn) {
            this.authYn = authYn;
            return this;
        }

        public builder lwPrtYn(String lwPrtYn) {
            this.lwPrtYn = lwPrtYn;
            return this;
        }

        public builder itemSe(String itemSe) {
            this.itemSe = itemSe;
            return this;
        }

        public builder foIderId(String foIderId) {
            this.foIderId = foIderId;
            return this;
        }

        public builder trgtId(String trgtId) {
            this.trgtId = trgtId;
            return this;
        }

        public builder useYn(String useYn) {
            this.useYn = useYn;
            return this;
        }

        public FbxAuthMappingVOUseBuilder build() {
            return new FbxAuthMappingVOUseBuilder(this);
        }

    }

    private FbxAuthMappingVOUseBuilder(builder builder) {
        this.authYn = builder.authYn;
        this.lwPrtYn = builder.lwPrtYn;
        this.itemSe = builder.itemSe;
        this.foIderId = builder.foIderId;
        this.trgtId = builder.trgtId;
        this.useYn = builder.useYn;
    }

    public String getAuthYn() {
        return authYn;
    }

    public String getLwPrtYn() {
        return lwPrtYn;
    }

    public String getItemSe() {
        return itemSe;
    }

    public String getFoIderId() {
        return foIderId;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public String getUseYn() {
        return useYn;
    }
}
