package com.andy.websocket.controller;

import com.andy.websocket.config.Constant;
import com.andy.websocket.config.WsMessage;
import com.andy.websocket.config.WsResponse;
import com.andy.websocket.service.WebSocketService;
import com.google.common.collect.Lists;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Leone
 * @since 2018-07-06
 **/
@RestController
@RequestMapping("/ws")
public class WebController {

    @Resource
    private WebSocketService webSocketService;

    @RequestMapping("/hello")
    public String socket(HttpServletRequest request, HttpServletResponse response) {
        return "success";
    }

    //@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @MessageMapping(Constant.FORE_TO_SERVER_PATH)
    @SendTo(Constant.PRODUCER_PATH)//如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    public WsResponse say(WsMessage message) {
        List<String> users = Lists.newArrayList();
        //此处写死只是为了方便测试,此值需要对应页面中订阅个人消息的userId
        users.add("d892bf12bf7d11e793b69c5c8e6f60fb");
        webSocketService.send2Users(users, new WsResponse("admin hello"));
        return new WsResponse("Welcome, " + message.getName() + "!");
    }

}
