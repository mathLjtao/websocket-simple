package com.ljtao3.websocketsimple.controller.ptp;

import com.ljtao3.websocketsimple.model.InMessage;
import com.ljtao3.websocketsimple.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PTPContoller {
    @Autowired
    private WebSocketService webSocketService;
    @MessageMapping("/ptp/single/chat")
    public void singleChat(InMessage inMessage){
        System.out.println(inMessage);
        webSocketService.sendChatMessage(inMessage);
    }
}
