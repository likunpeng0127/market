package com.itheima.stock;


import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncodeTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void test(){
        String password = "123";
        String encodePassword = passwordEncoder.encode(password);
        System.out.println(encodePassword);

        // 匹配明文密码
        boolean matches = passwordEncoder.matches(password, "$2a$10$YOSX4pmCvMVjnZI1EtxY.OWX0PEAj/DQWc9yG2deAe7xIyenNGFxG");
        System.out.println(matches);
    }

    @Test
    public void testPasswordEncoder(){
        System.out.println("" + passwordEncoder.getClass().getName());
    }

}
