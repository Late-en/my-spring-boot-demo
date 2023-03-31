package exceptionHandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Late-en
 * 对thymeleaf不太了解，模板字符串一直无法解析，但大致功能没问题
 * 理一下思路：
 * 首先写好基本的handler 自定义的exception 返回的ApiResponse
 * 对于handler中的exception 需要一个全局的切片exceptionHandler
 * 对不同的exception写好不同的handler应对
 */
@SpringBootApplication
public class ExceptionHandlerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExceptionHandlerApplication.class, args);
    }
}
