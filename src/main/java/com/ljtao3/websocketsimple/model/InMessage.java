package com.ljtao3.websocketsimple.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 接受客户端数据实体
 */
@Data
// 注解在类上, 为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法
@AllArgsConstructor
//会生成一个包含所有变量，同时如果变量使用了NotNull annotation ， 会进行是否为空的校验，
//全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致。
@NoArgsConstructor
//无参构造函数
public class InMessage {
    private String from;
    private String to;
    private String content;
    private Date time;
    public String getFrom(){
        return from;
    }
    public String getContent(){
        return content;
    }
    public InMessage(String content){
        this.content=content;
    }
}
