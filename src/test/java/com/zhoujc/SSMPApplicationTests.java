package com.zhoujc;

import com.zhoujc.domain.User;
import com.zhoujc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;

@SpringBootTest
class SSMPApplicationTests {

  @Autowired
  private UserService userService;
  @Test
  void contextLoads() {
    System.out.println(userService);
  }

}
