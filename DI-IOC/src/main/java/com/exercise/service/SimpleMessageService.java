package com.exercise.service;

// SimpleMessageService.java (구현체)
import org.springframework.stereotype.Service;

@Service        // IoC 컨테이너가 이 클래스를 Bean으로 등록
public class SimpleMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello, Spring IoC and DI!";
    }
}
