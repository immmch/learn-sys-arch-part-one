package run.rainyday;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: RenChenHao
 * @date: 2021.1.11 15:47
 */
public class WeiXinSignUtils {
    /**
     * 签名
     *
     * @param params formData格式数据
     * @param appKey 三方key
     * @return
     */
    public static Map<String, Object> sign(Map<String, Object> params, String appKey) {
        Iterator<String> keys = params.keySet().iterator();
        StringBuilder sb = new StringBuilder();

        //拼接 formData 数据,然后校验
        while (keys.hasNext()) {
            String key = keys.next();
            String value = String.valueOf(params.get(key));
            sb.append(key).append("=").append(value).append("&");
        }
//        sb.append(PublicKey.MB_APP_KEY + "=" + appKey);
//        //设置签名
//        params.put(PublicKey.MB_APP_SIGN, MD5Tools.encrypt(sb.toString()).toUpperCase());
//        //移除 key,不能在网络上传输,并且会导致服务方验签错误
//        params.remove(PublicKey.MB_APP_KEY);

        return params;
    }
}
