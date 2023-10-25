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


    // This checks if the prompt contains an adjective/detail.
    @Test
    public void testPromptContainsAdjectiveOrDetail() {
        String prompt = generator.generatePrompt("Dragon");
        boolean containsAdjective = false;
        for (String adjective : ArtPromptGenerator.adjectivesAndDetails) {
            if (prompt.contains(adjective)) {
                containsAdjective = true;
                break;
            }
        }
        assertTrue(containsAdjective, "Prompt should contain at least one adjective or detail.");
    }

    // This checks if the prompt contains a background.
    @Test
    public void testPromptContainsBackground() {
        String prompt = generator.generatePrompt("Dragon");
        boolean containsBackground = false;
        for (String background : ArtPromptGenerator.backgrounds) {
            if (prompt.contains(background)) {
                containsBackground = true;
                break;
            }
        }
        assertTrue(containsBackground, "Prompt should contain a background.");
    }

    // This checks if the prompt contains an art style.
    @Test
    public void testPromptContainsArtStyle() {
        String prompt = generator.generatePrompt("Dragon");
        boolean containsArtStyle = false;
        for (String style : ArtPromptGenerator.artStyles) {
            if (prompt.contains(style)) {
                containsArtStyle = true;
                break;
            }
        }
        assertTrue(containsArtStyle, "Prompt should contain an art style.");
    }

    // This checks if the prompt contains an enhancer.
    @Test
    public void testPromptContainsEnhancer() {
        String prompt = generator.generatePrompt("Dragon");
        boolean containsEnhancer = false;
        for (String enhancer : ArtPromptGenerator.enhancers) {
            if (prompt.contains(enhancer)) {
                containsEnhancer = true;
                break;
            }
        }
        assertTrue(containsEnhancer, "Prompt should contain an enhancer.");
    }

    // This checks if the prompt mentions an artist.
    @Test
    public void testPromptContainsArtist() {
        String prompt = generator.generatePrompt("Dragon");
        boolean containsArtist = false;
        for (String artist : ArtPromptGenerator.artists) {
            if (prompt.contains(artist)) {
                containsArtist = true;
                break;
            }
        }
        assertTrue(containsArtist, "Prompt should mention an artist.");
    }

}
