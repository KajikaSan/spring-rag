package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testng.internal.reflect.InjectableParameter;

@RestController
public class AssistantResource {
    private final AssistantAiService assistantAiService;

    AssistantResource(AssistantAiService assistantAiService){
        this.assistantAiService = assistantAiService;
    }

    @PostMapping("/assistants/chat")
    public String chat(@RequestBody String query){
        return assistantService.chat(query);
    }
}
