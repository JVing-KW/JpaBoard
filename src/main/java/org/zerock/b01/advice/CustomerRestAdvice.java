package org.zerock.b01.advice;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Log4j2
public class CustomerRestAdvice {
// RestController는 예외가 나면 어디서 나는지 알기 힘들기 때문에 @RestControllerAdvice를 이용해 에러 로그를 확인한다 
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public ResponseEntity<Map<String,String>> handlerBindException(BindException e){
        log.error(e);

        Map<String,String> errorMap= new HashMap<>();
    return null;}
}
