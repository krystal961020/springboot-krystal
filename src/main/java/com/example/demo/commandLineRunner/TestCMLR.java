package com.example.demo.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Krystal
 * @Date 2021/2/24 18:42
 */
@Order(1)
@Component
public class TestCMLR implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("我就是在执行之后输出一句话");
    }
}
