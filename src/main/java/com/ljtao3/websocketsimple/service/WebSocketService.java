package com.ljtao3.websocketsimple.service;

import com.ljtao3.websocketsimple.model.InMessage;
import com.ljtao3.websocketsimple.model.OutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
/**
 * 功能描述：简单消息模板，用来推送消息
 */
@Service
public class WebSocketService {
    @Autowired
    private SimpMessagingTemplate template;
    /**
     * 简单点对点聊天室
     */
    public void sendChatMessage(InMessage inMessage) {
        //可以看出template最大的灵活就是我们可以获取前端传来的参数来指定订阅地址
        //前面参数是订阅地址，后面参数是消息信息
        template.convertAndSend("/topic/chat/single/"+inMessage.getTo(),
                new OutMessage(inMessage.getFrom()+" 发送："+inMessage.getContent()));
    }
}
