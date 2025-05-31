package com.ciwei.java.ai.langchain4j.bean;

import lombok.Data;

/**
 * Create by LzWei on 2025/5/31
 */
@Data
public class ChatForm {
    private Long memoryId;//对话id
    private String message;//用户问题
}
