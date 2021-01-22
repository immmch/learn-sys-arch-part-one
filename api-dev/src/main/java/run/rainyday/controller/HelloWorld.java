package run.rainyday.controller;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import run.rainyday.AccessLimitService;
import run.rainyday.dto.TestDTO;
import org.springframework.web.bind.annotation.*;
import run.rainyday.enums.LimitEnmu;
import run.rainyday.mapper.automatic.ItemsMapper;


/**
 * 测试 控制层
 *
 * @author: RenChenHao
 * @date: 2021.1.7 11:00
 */
@Slf4j
@RestController
@RequestMapping("/test")
@Api(value = "hello", tags = {"用于注册登录的相关接口"})
public class HelloWorld {
    public static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
    @Autowired
    private ItemsMapper itemsMapper;
    @Autowired
    private AccessLimitService accessLimitService;

    @ApiOperation(value = "连通性测试", notes = "连通性测试", httpMethod = "POST")
    @PostMapping("/available")
    public String test(@RequestBody TestDTO testDTO){
        System.out.println(testDTO.toString());
        System.out.println(itemsMapper.selectByPrimaryKey("cake-38"));
        log.info("hello world!`, {}", "打印紫日");
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
        LOGGER.info("Entering application.");
        LOGGER.info("Exiting application.");
        return "hello world~";
    }

    /**
     * 测试 rate limit
     * @return
     */
    @PostMapping("/refund")
    public String refund(){
        if (!accessLimitService.currentAcquire("test_rate_limit", LimitEnmu.UNBLOCK,100.0)) {
            return "请勿重复提交!";
        }
        return "请求成功!";
    }
}
