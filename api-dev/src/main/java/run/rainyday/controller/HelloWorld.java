package run.rainyday.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "hello", tags = {"用于注册登录的相关接口"})
public class HelloWorld {

    @Autowired
    ItemsMapper itemsMapper;

    @ApiOperation(value = "连通性测试", notes = "连通性测试", httpMethod = "POST")
    @PostMapping("/available")
    public String test(@RequestBody TestDTO testDTO){
        System.out.println(testDTO.toString());
        System.out.println(itemsMapper.selectByPrimaryKey("cake-38"));
        return "hello world~";
    }
}
