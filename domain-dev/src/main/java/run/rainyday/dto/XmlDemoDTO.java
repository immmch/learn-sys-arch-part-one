package run.rainyday.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author: RenChenHao
 * @date: 2021.1.7 10:50
 */
@Data
public class XmlDemoDTO {
    /**
     * <xml>
     *    <appid>wx2421b1c4370ec43b</appid>
     *    <mch_id>10000100</mch_id>
     *    <nonce_str>6cefdb308e1e2e8aabd48cf79e546a02</nonce_str>
     *    <out_refund_no>1415701182</out_refund_no>
     *    <out_trade_no>1415757673</out_trade_no>
     *    <refund_fee>1</refund_fee>
     *    <total_fee>1</total_fee>
     *    <transaction_id>4006252001201705123297353072</transaction_id>
     *    <sign>FE56DD4AA85C0EECA82C35595A69E153</sign>
     * </xml>
     */


    private String appid;

    @JSONField(name = "mch_id")
    private String mchId;

    @JSONField(name = "nonce_str")
    private String nonceStr;

    @JSONField(name = "out_refund_no")
    private String outRefundNo;

    @JSONField(name = "out_trade_no")
    private String outTradeNo;

    @JSONField(name = "refund_fee")
    private String refundFee;

    @JSONField(name = "total_fee")
    private String totalFee;

    @JSONField(name = "transaction_id")
    private String transactionId;

    private String sign;
}
