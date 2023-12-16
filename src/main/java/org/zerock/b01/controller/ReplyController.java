package org.zerock.b01.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.b01.dto.ReplyDTO;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("replies")
@Log4j2
public class ReplyController {
    @ApiOperation(value ="Replies Post",notes = "POST 방식으로 댓글 등록")
    @PostMapping(value="/",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Long> register(@Valid @RequestBody ReplyDTO replyDTO,BindingResult bindingResult)throws BindException {
        //@RequestBody는 Json문자열을 ReplyDTO로 변환하기 위해서 표시한다.
        log.info(replyDTO);
        if(bindingResult.hasErrors()){
            throw new BindException(bindingResult);
        }
        Map<String,Long> resultMap= Map.of("rno",111L);
//        return ResponseEntity.ok(resultMap);

        return  resultMap;
    }

}
