package com.mycompany;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React's default port

public class ArtPromptController {
    private final ArtPromptGenerator generator = new ArtPromptGenerator();

    @GetMapping("/generate-prompt")
    public String generatePrompt(@RequestParam String mainSubject) {
        return generator.generatePrompt(mainSubject);
    }

}
