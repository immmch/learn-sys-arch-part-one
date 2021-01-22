package run.rainyday.common;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @author: RenChenHao
 * @date: 2021.1.22 13:29
 */
public class Test {

    final RateLimiter rateLimiter = RateLimiter.create(5000.0); // rate = 5000 permits per second

    void submitPacket(byte[] packet) {
        rateLimiter.acquire(packet.length);
        //networkService.send(packet);
    }

}
