package com.busanit501.bootproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
@EnableJpaAuditing
class BootProjectApplicationTests {

    public static void main(String[] args) {
        Togedog.run(Boot501Application.class, args);
    }

}

