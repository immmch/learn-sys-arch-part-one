package run.rainyday.controller;

import org.apache.commons.lang3.RandomStringUtils;
import run.rainyday.dto.TestDTO;
import org.springframework.web.bind.annotation.*;

/**
 * 测试 控制层
 *
 * @author: RenChenHao
 * @date: 2021.1.7 11:00
 */
@RestController
@RequestMapping("/test")
public class HelloWorld {

    @PostMapping("/available")
    public String test(@RequestBody TestDTO testDTO){
        System.out.println(testDTO.toString());
        return "hello world~";
    }

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomAscii(64));
    }

}
