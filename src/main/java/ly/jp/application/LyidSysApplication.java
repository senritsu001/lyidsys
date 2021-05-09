package ly.jp.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ly.jp.application.mapper")
public class LyidSysApplication {

  public static void main(String[] args) {
    SpringApplication.run(LyidSysApplication.class, args);
  }
}
