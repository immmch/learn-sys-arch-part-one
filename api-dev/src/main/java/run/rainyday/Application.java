package run.rainyday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: RenChenHao
 * @date: 2021.1.7 9:51
 */
@SpringBootApplication
@MapperScan("run.rainyday.mapper.automatic")
@ComponentScan(basePackages = {"run.rainyday", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
