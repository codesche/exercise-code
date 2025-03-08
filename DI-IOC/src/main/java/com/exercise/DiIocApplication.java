package com.exercise;

import com.exercise.util.MessagePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
1. IoC 컨테이너가 @Service와 @Component가 붙은 클래스를 자동으로 관리.
2. @Autowired를 사용해 DI(의존성 주입) 를 수행.
3. 실행 시 MessagePrinter 객체는 SimpleMessageService 의 구현체를 자동으로 주입받아 사용.
 */

@SpringBootApplication
public class DiIocApplication implements CommandLineRunner {

    private final MessagePrinter messagePrinter;

    @Autowired          // 생성자 주입
    public DiIocApplication(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(DiIocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messagePrinter.printMessage();
    }
}
