# 医疗智能小智
这个项目是一个基于Spring Boot和LangChain4j的智能医疗伴诊助手系统，主要功能是提供AI医疗咨询和预约挂号服务。以下是核心组件的解释：
一、技术栈
核心框架：
Spring Boot 3.2.6
LangChain4j 1.0.0-beta3（AI集成）
MyBatis-Plus 3.5.11（持久层）
AI模型集成：
阿里百炼平台（qwen-max模型）
DeepSeek推理模型
Ollama本地模型
支持流式输出（WebFlux）
数据库：
MySQL（预约数据存储）
MongoDB（聊天记忆持久化）
向量存储：
Pinecone（知识库向量检索）
内存向量存储（测试用）
 
二、核心功能模块
1. AI助手接口
Assistant：基础聊天接口（使用通义千问模型）
MemoryChatAssistant：带记忆的聊天（支持上海话回复）
SeparateChatAssistant：分离式多轮对话（粤语回复+工具调用）
XiaozhiAgent：医疗伴诊核心Agent（流式输出+预约工具+知识库检索）
2. 工具集成
AppointmentTools：
bookAppointment()：预约挂号
cancelAppointment()：取消预约
queryDepartment()：号源查询
CalculatorTools：数学计算工具
3. 记忆管理
MongoChatMemoryStore：
将聊天记录持久化到MongoDB
支持按memoryId隔离对话上下文
4. 知识库检索（RAG）
EmbeddingStoreConfig：
使用Pinecone存储向量
结合阿里云文本向量模型text-embedding-v3
RAGTest：
支持加载TXT/PDF文档到向量库
实现基于语义的检索增强
