package com.ciwei.java.ai.langchain4j;

import com.ciwei.java.ai.langchain4j.assistant.Assistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Create by LzWei on 2025/5/31
 */
@SpringBootTest
public class AIServiceTest {
    @Autowired
    private QwenChatModel qwenChatModel;
    @Autowired
    private Assistant assistant;

    @Test
    public void testChat() {
        //创建AIService
        //Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        //调用service的接口
        String answer = assistant.chat("Hello,who are you?");
        System.out.println(answer);
    }
}
