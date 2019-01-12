package com.lyq3.kafka.springboot.producer.entity;

import java.io.Serializable;

/**
 * @author 卡卢比
 * @createTime 2019年01月12日 20:37
 * @description 消息
 */
public class Message implements Serializable {
    private int code;
    private String name;
    private String description;

    public int getCode() {
        return code;
    }

    public Message setCode(int code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Message setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Message setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
