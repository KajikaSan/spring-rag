package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRessource {
    @GetMapping("samples/{value}")
    public String hello(@PathVariable(value="value", required = false) final String value) {
        return "Hello " + value + "!";
    }

}
