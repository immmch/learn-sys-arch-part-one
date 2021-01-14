package run.rainyday.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import java.util.Random;

/**
 * xml解析工具类
 *
 * @author: RenChenHao
 * @date: 2021.1.7 10:47
 */
public class XmlUtils {
    public static void main(String[] args) throws DocumentException {
        String textXml = "<xml>\n" +
                "   <appid>wx2421b1c4370ec43b</appid>\n" +
                "   <mch_id>10000100</mch_id>\n" +
                "   <nonce_str>6cefdb308e1e2e8aabd48cf79e546a02</nonce_str> \n" +
                "   <out_refund_no>1415701182</out_refund_no>\n" +
                "   <out_trade_no>1415757673</out_trade_no>\n" +
                "   <refund_fee>1</refund_fee>\n" +
                "   <total_fee>1</total_fee>\n" +
                "   <transaction_id>4006252001201705123297353072</transaction_id>\n" +
                "   <sign>FE56DD4AA85C0EECA82C35595A69E153</sign>\n" +
                "</xml> \n" +
                "\n";
//        Document document = DocumentHelper.parseText(textXml);
//        bar(document);
        System.out.println(randomString(32));
        System.out.println(RandomStringUtils.randomAlphanumeric(32));
//        BitField bitField = new BitField();

    }

    public static String randomString(Integer length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static void bar(Document document) throws DocumentException {

        Element root = document.getRootElement();
        Element ele = root.element("appid");
        System.out.println(ele.getData());
//        rootChanEle.stream().forEach(i-> System.out.println(i.));

//        // iterate through child elements of root
//        for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
//            Element element = it.next();
//            System.out.println(element.elements());
//            // do something
//        }
//
//        // iterate through child elements of root with element name "foo"
//        for (Iterator<Element> it = root.elementIterator("foo"); it.hasNext();) {
//            Element foo = it.next();
//            // do something
//        }
//
//        // iterate through attributes of root
//        for (Iterator<Attribute> it = root.attributeIterator(); it.hasNext();) {
//            Attribute attribute = it.next();
//            // do something
//        }
    }
}
