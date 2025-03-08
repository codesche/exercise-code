package com.exercise.util;

import com.exercise.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component      // IoC 컨테이너가 관리하는 빈
public class MessagePrinter {
    private final MessageService messageService;

    @Autowired      // 의존성 주입 (DI 적용 - 생성자 주입 방식)
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }

}
