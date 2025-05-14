package br.com.erick.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
