package EffectiveJava.ExampleCode;

public class CmmFileBean {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4283471324238531001L;

    /** Constant prefix. */
    public String ID_PREFIX;

    public CmmFileBean(String primaryKey) {
        ID_PREFIX = primaryKey;
    }

    public String getID_PREFIX() {
        return ID_PREFIX;
    }

    public void setID_PREFIX(String ID_PREFIX) {
        this.ID_PREFIX = ID_PREFIX;
    }
}
