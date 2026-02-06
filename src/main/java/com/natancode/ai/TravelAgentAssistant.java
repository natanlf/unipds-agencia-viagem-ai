package com.natancode.ai;

import io.quarkiverse.langchain4j.RegisterAiService;

/**
 * Interface que vai se conectar ao Ollama (poderia ser outra ia, basta informar no properties)
 * @RegisterAiService que diz para o quarkus gera a implementação que vai se comunicar com o modelo de ia
 */
@RegisterAiService
public interface TravelAgentAssistant {

    /**
     * O método 'chat' recebe a mensagem do usuário e retorna a resposta do LLM
     * @param userMessage
     * @return A resposta gerada pelo modelo de linguagem
     */
    String chat(String userMessage);

}
