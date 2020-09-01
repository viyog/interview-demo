package show.shanhe.interview.enums;

public enum FourEmperor {
    TES("TES","滔博"),
    JDG("JDG","京东"),
    SN("SN","苏宁"),
    LGD("LGD","老干爹");

    private String code;
    private final String description;

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    FourEmperor(String code,String description) {
        this.description = description;
    }
}
