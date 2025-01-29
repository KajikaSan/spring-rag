package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testng.internal.reflect.InjectableParameter;

@RestController
public class AssistantResource {
    private final Logger log = LoggerFactory.getLogger(AssistantResource.class);
    private final AssistanceAiService assistanceAiService;
    public AssistantResource(AssistanceAiService assistanceAiService) {
        this.assistanceAiService = assistanceAiService;
    }
    @PostMapping("/assistant/chat")
    public String chat(@RequestBody String query) {
        log.info("REST request to chat with assistant : {}", query);
        return assistanceAiService.chat(query);
    }
}
