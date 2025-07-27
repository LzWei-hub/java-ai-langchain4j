# 医疗智能小智
这是一个基于Spring Boot和LangChain4J构建的AI聊天助手项目，名为"伴诊小智"。该项目主要实现了智能医疗客服功能，具备对话记忆、工具调用和知识检索等能力。

## 项目概述

- **项目名称**: 伴诊小智 (Xiaozhi Assistant)
- **主要功能**: 智能医疗客服，提供医院导诊、预约挂号等服务
- **核心技术**: Spring Boot + LangChain4J + 阿里通义千问 + MongoDB + MySQL

## 核心组件

### 1. AI助手类型
- [Assistant](file://D:\JavaCode\java-ai-langchain4j\src\main\java\com\ciwei\java\ai\langchain4j\assistant\Assistant.java#L7-L10): 基础AI助手接口
- [MemoryChatAssistant](file://D:\JavaCode\java-ai-langchain4j\src\main\java\com\ciwei\java\ai\langchain4j\assistant\MemoryChatAssistant.java#L8-L17): 带对话记忆的助手
- [SeparateChatAssistant](file://D:\JavaCode\java-ai-langchain4j\src\main\java\com\ciwei\java\ai\langchain4j\assistant\SeparateChatAssistant.java#L10-L38): 支持多轮独立对话的助手
- [XiaozhiAgent](file://D:\JavaCode\java-ai-langchain4j\src\main\java\com\ciwei\java\ai\langchain4j\assistant\XiaozhiAgent.java#L10-L20): 主要的医疗助手，具备工具调用和知识检索能力

### 2. 工具集成
- [AppointmentTools](file://D:\JavaCode\java-ai-langchain4j\src\main\java\com\ciwei\java\ai\langchain4j\tools\AppointmentTools.java#L12-L65): 预约挂号相关工具
- [CalculatorTools](file://D:\JavaCode\java-ai-langchain4j\src\main\java\com\ciwei\java\ai\langchain4j\tools\CalculatorTools.java#L10-L28): 计算工具（加法、平方根）

### 3. 数据存储
- **MongoDB**: 存储对话记忆
- **MySQL**: 存储预约信息
- **Pinecone**: 向量数据库，存储医疗知识库

### 4. 主要配置
- 使用阿里通义千问作为主要大语言模型
- 集成DeepSeek模型作为备选
- 配置了向量存储用于RAG（检索增强生成）
- 实现了对话记忆的持久化存储

## 核心业务流程

1. 用户通过REST API与"伴诊小智"交互
2. 系统根据用户问题判断是否需要调用工具（如预约挂号）
3. 必要时从向量数据库检索相关医疗知识
4. 结合对话历史和检索到的信息生成回答
5. 支持流式输出，提供更好的用户体验

## 项目特点

- **多模型支持**: 集成多个AI模型提供商
- **对话记忆**: 支持多轮对话和历史记录存储
- **工具调用**: 可以执行具体的业务操作（如预约挂号）
- **知识检索**: 通过RAG技术增强AI回答的准确性
- **流式响应**: 支持实时流式输出，提升交互体验

这个项目是一个完整的AI医疗助手解决方案，可以用于医院的智能客服系统。
