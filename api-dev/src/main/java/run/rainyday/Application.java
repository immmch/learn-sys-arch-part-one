package run.rainyday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: RenChenHao
 * @date: 2021.1.7 9:51
 */
@SpringBootApplication
@MapperScan("run.rainyday.mapper.automatic")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
