package run.rainyday.enums;

/**
 * @author: RenChenHao
 * @date: 2021.1.22 17:30
 */
public enum LimitEnmu {
    BLOCK(1,"阻塞"),
    UNBLOCK(2,"非阻塞");

    private Integer index;

    private String value;

    LimitEnmu(Integer index, String value){
        this.index=index;
        this.value=value;
    }

    public static LimitEnmu getByIndex(Integer index){
        for (LimitEnmu item : values()){
            if (item.getIndex().equals(index)){
                return item;
            }
        }
        return null;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
