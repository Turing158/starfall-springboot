package com.starfall.controller;

import com.starfall.entity.ResultMsg;
import com.starfall.service.NoticeService;
import com.starfall.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping("/findAllTopic")
    public ResultMsg findAllTopic(int page){
        return topicService.findAllTopic(page);
    }


}
