package run.rainyday;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Service;
import run.rainyday.enums.LimitEnmu;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: RenChenHao
 * @date: 2021.1.22 17:30
 */
@Service
public class AccessLimitService {

    //用来存放不同接口的RateLimiter(key为接口名称，value为RateLimiter)
    private ConcurrentHashMap<String, RateLimiter> rateLimitMap = new ConcurrentHashMap<>();

    /**
     * 令牌池
     * @param key
     * @param type
     * @param qps
     * @return
     */
    public boolean currentAcquire(String key, LimitEnmu type, Double qps){

        try {
            // 控流key
            if (key == null){
                return false;
            }
            //如果值为0，则为不进行限流
            if (qps == null || qps <= 0) {
                return true;
            } else {
                //获取rateLimiter
              //  synchronized (this) {
                    if (!rateLimitMap.containsKey(key)) {
                        //使用最简洁的方法来创建RateLimiter，RateLimiter.create(double xx)，如果有需要，可自行设置RateLimiter其他属性
                        rateLimitMap.put(key, RateLimiter.create(qps));
//                        System.out.println("containsKey: --" + rateLimitMap.get(key).hashCode());
                    }
               // }
                RateLimiter rateLimiter = rateLimitMap.get(key);
                if (type == LimitEnmu.BLOCK){
                    rateLimiter.acquire();
                } else {
                    //尝试获得一个令牌
                    if (rateLimiter.tryAcquire()) {
                        return true;
                    } else {
                        //拒绝了请求（服务降级），这是自己定义的异常类
                        return false;
                    }
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }

        return true;
    }
}
