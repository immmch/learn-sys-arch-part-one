package run.rainyday.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * @author: RenChenHao
 * @date: 2021.1.15 14:00
 */
public class MD5Utils {
    /**
     * md5 摘要
     * @param strValue
     * @return
     * @throws Exception
     */
    public static String getMD5Str(String strValue) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("md5");
        String newStr = Base64.encodeBase64String(md5.digest(strValue.getBytes()));
        return newStr;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getMD5Str("123456"));
    }
}
