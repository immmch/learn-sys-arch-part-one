package run.rainyday.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author: RenChenHao
 * @date: 2021.1.7 13:16
 */
@Data
public class TestDTO {
    @JSONField(name = "nick_name")
    private String nickName;

    @JSONField(name = "id_card")
    private String idCard;

    @Override
    public String toString() {
        return "TestDTO{" +
                "nickName='" + nickName + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
