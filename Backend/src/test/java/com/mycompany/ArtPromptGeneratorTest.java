package com.mycompany;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ArtPromptGeneratorTest {

    // Instantiating the class to be tested so it can be used in test methods.
    private final ArtPromptGenerator generator = new ArtPromptGenerator();

    // This checks if the prompt generated is not empty or blank.
    @Test
    public void testGeneratePromptNotEmpty() {
        // Generate a prompt using "Dragon" as the subject.
        String prompt = generator.generatePrompt("Dragon");

        /*
         * Check if the generated prompt is neither empty nor blank.
         * If it is empty or blank, the test will fail and the message
         * "Generated prompt should not be empty or blank" will be printed.
         */
        assertFalse(prompt.isBlank(), "Generated prompt should not be empty or blank");
    }

    // This is a test case that checks if the prompt contains the provided subject.
    @Test
    public void testGeneratePromptContainsSubject() {
        String subject = "Dragon";
        String prompt = generator.generatePrompt(subject);

        /*
         * Check if the generated prompt contains the subject ("Dragon").
         * If it does not, the test will fail and the message
         * "Generated prompt should contain the provided subject" will be printed.
         */
        assertTrue(prompt.contains(subject), "Generated prompt should contain the provided subject");
    }

    // This is a test case that checks the format of the generated prompt.
    @Test
    public void testGeneratePromptFormat() {
        String subject = "Dragon";
        String prompt = generator.generatePrompt(subject);

        /*
         * Check if the generated prompt starts with the expected phrase.
         * If it does not, the test will fail and the message
         * "Prompt should start with expected phrase" will be printed.
         */
        assertTrue(prompt.startsWith("Create a dynamic detailed digital illustration featuring "),
                "Prompt should start with expected phrase");

        /*
         * Check if the generated prompt contains the segment indicating a setting.
         * If it does not, the test will fail and the message
         * "Prompt should contain segment indicating a setting" will be printed.
         */
        assertTrue(prompt.contains(", set in "),
                "Prompt should contain segment indicating a setting");

        /*
         * Check if the generated prompt contains the segment indicating a style.
         * If it does not, the test will fail and the message
         * "Prompt should contain segment indicating a style" will be printed.
         */
        assertTrue(prompt.contains(" style, "),
                "Prompt should contain segment indicating a style");
    }

}
