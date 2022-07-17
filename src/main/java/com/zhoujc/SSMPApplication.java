package com.zhoujc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *
 */
@SpringBootApplication
@Component
@Slf4j
public class SSMPApplication {

  public static void main(String[] args) {
/**
 * System.out.println(Arrays.toString(args));
 *     String[] arg = new String[1];
 *     arg[0] = "--server.port=8082";
 *     SpringApplication.run(SSMPApplication.class,arg)
 *  可以在启动boot程序时断开外部读取临时配置对应的入口(args)，也就是去掉外部读取参数的形参
 */
    SpringApplication.run(SSMPApplication.class);
  }
}
