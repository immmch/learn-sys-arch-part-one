package run.rainyday.controller;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import run.rainyday.dto.TestDTO;
import org.springframework.web.bind.annotation.*;
import run.rainyday.mapper.automatic.ItemsMapper;

/**
 * 测试 控制层
 *
 * @author: RenChenHao
 * @date: 2021.1.7 11:00
 */
@RestController
@RequestMapping("/test")
public class HelloWorld {

    @Autowired
    ItemsMapper itemsMapper;

    @PostMapping("/available")
    public String test(@RequestBody TestDTO testDTO){
        System.out.println(testDTO.toString());
        System.out.println(itemsMapper.selectByPrimaryKey("cake-38"));
        return "hello world~";
    }

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomAscii(64));
    }

}
