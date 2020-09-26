package com.springbootinaction.demo;

import com.springbootinaction.otherdemo.soundsystem.CompactDisc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {
    @Autowired
    private CompactDisc cd;
    @Test
    void contextLoads() {
       // assertNotNull(cd);
        cd.play();
    }

}
