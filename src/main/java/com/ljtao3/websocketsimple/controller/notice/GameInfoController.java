package com.ljtao3.websocketsimple.controller.notice;

import com.ljtao3.websocketsimple.model.InMessage;
import com.ljtao3.websocketsimple.model.OutMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/*
https://www.cnblogs.com/qdhxhz/p/9438954.html  解释说明
管理员发布公告消息对应的接口
 */
@Controller
public class GameInfoController {
    //@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    //如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    @MessageMapping("/notice/chat")
    @SendTo("/topic/game_chat")
    public OutMessage gameInfo(InMessage message){
        return  new OutMessage(message.getContent());

    }
}
