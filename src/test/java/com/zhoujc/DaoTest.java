package com.zhoujc;

import com.zhoujc.domain.User;
import com.zhoujc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@SpringBootTest
@Transactional
@Rollback(value = false)
public class DaoTest {

  @Autowired
  private UserService userService;

  @Test
  void TestSave(){
    User user = new User();
    user.setName("springboot");
    user.setUrl("springboot");
    user.setAlexa("springboot");
    user.setCountry("springboot");

    userService.saveUser(user);
  }
}
