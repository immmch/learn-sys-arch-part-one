package test.rainyday;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import run.rainyday.Application;

/**
 * @author: RenChenHao
 * @date: 2021.1.15 10:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TransTest {
    @Test
    public void myTest(){
        System.out.println("344");
    }
}
