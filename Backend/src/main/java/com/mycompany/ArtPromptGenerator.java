package com.mycompany;

import java.util.Random;
import java.util.Scanner;

public class ArtPromptGenerator {

        protected static final String[] adjectivesAndDetails = {
                        "cute", "attractive", "unattractive", "tall", "short", "fat", "skinny", "muscular", "slim",
                        "large", "small", "big",
                        "bright", "dark", "colorful", "plain", "glamorous", "drab", "elegant", "frumpy", "stylish",
                        "tasteful", "gaudy",
                        "fancy", "simple", "ornate", "sophisticated", "refined", "cluttered", "minimalist", "busy",
                        "chaotic", "orderly"
        };

        protected static final String[] backgrounds = {
                        "a bustling city street", "a peaceful meadow", "a snowy mountain landscape", "a dense forest",
                        "a sandy beach", "a futuristic city skyline", "a desert oasis", "a turbulent ocean",
                        "a colorful sunset", "a spooky graveyard", "a tranquil lake", "a surreal dreamscape",
                        "a dense jungle", "a bustling marketplace", "a surreal abstract landscape",
                        "a peaceful Zen garden",
                        "a grand castle", "a haunted mansion", "a picturesque village", "a serene mountain range",
                        "a futuristic laboratory", "a surreal alien world", "a mysterious cave",
                        "a bustling metropolis",
                        "a mystical portal"
        };

        protected static final String[] artStyles = {
                        "Realism", "Impressionism", "Expressionism", "Cubism", "Surrealism", "Abstract", "Pop Art",
                        "Fauvism",
                        "Art Nouveau", "Dada", "Minimalism", "Conceptual Art", "Post-Impressionism", "Renaissance",
                        "Baroque",
                        "Romanticism", "Neoclassicism", "Mannerism", "Ukiyo-e", "Surrealism", "Futurism", "Dada",
                        "Suprematism",
                        "Constructivism", "De Stijl", "Art Deco", "Bauhaus", "Cubism", "Fauvism", "Expressionism",
                        "Art Nouveau"
        };

        protected static final String[] enhancers = {
                        "8k", "HD", "cinematography", "photorealistic", "epic composition", "Unreal Engine",
                        "Cinematic", "Color Grading", "portrait Photography", "Ultra-Wide Angle", "Depth of Field",
                        "hyper-detailed", "beautifully color-coded", "insane details", "intricate details",
                        "beautifully color graded", "Editorial Photography", "Photography", "Photoshoot",
                        "Depth of Field", "DOF", "Tilt Blur", "White Balance", "32k", "Super-Resolution", "Megapixel",
                        "ProPhoto RGB", "VR", "Halfrear Lighting", "Backlight", "Natural Lighting", "Incandescent",
                        "Optical Fiber",
                        "Moody Lighting", "Cinematic Lighting", "Studio Lighting", "Soft Lighting", "Volumetric Light",
                        "Contre-Jour",
                        "Beautiful Lighting", "Accent Lighting", "Global Illumination",
                        "Screen Space Global Illumination",
                        "Ray Tracing Global Illumination", "Optics", "Scattering", "Glowing"
        };

        protected static final String[] artists = {
                        "Yoshitaka Amano", "Ancient Chinese Painting", "Will Murai", "Bayard Wu", "James Jean",
                        "J.C. Leyendecker", "Dean Cornwell", "Frank Frazetta", "Ilya Repin", "William Waterhouse",
                        "Howard Pyle", "Alex Ross",
                        "Leonardo da Vinci", "Vincent van Gogh", "Michelangelo", "Rembrandt", "Claude Monet",
                        "Peter Paul Rubens", "Jan van Eyck", "Titian", "Caravaggio", "Diego Velázquez",
                        "Pablo Picasso", "Jackson Pollock", "Andy Warhol", "Frida Kahlo", "Salvador Dalí",
                        "Georgia O'Keeffe", "Jean-Michel Basquiat", "Norman Rockwell", "Banksy", "Keith Haring",
                        "Osamu Tezuka", "Hayao Miyazaki", "Akira Toriyama", "Masashi Kishimoto", "Eiichiro Oda",
                        "Hirohiko Araki", "Tite Kubo", "Sui Ishida", "Makoto Shinkai", "Junji Ito",
                        "Stan Lee", "Jack Kirby", "Steve Ditko", "Todd McFarlane", "Frank Miller",
                        "Jim Lee", "Neal Adams", "Brian Bolland", "Mike Mignola", "Alan Moore",
                        "Frak Franzetta", "J.C. Leyendecker", "Dean Cornwell", "Frank Frazetta", "Ilya Repin",
                        "William Waterhouse",
                        "Howard Pyle", "Alex Ross", "Leonardo da Vinci", "Vincent van Gogh", "Michelangelo",
                        "Rembrandt", "Claude Monet"
        };

        public String generatePrompt(String mainSubject) {
                Random random = new Random();

                String adjectiveAndDetail = adjectivesAndDetails[random.nextInt(adjectivesAndDetails.length)];
                String background = backgrounds[random.nextInt(backgrounds.length)];
                String artStyle = artStyles[random.nextInt(artStyles.length)];
                String enhancer = enhancers[random.nextInt(enhancers.length)];
                String artist = artists[random.nextInt(artists.length)];

                return String.format(
                                "Create a dynamic detailed digital illustration featuring %s that is %s, set in %s, with a %s art style, %s, painted by %s.",
                                mainSubject, adjectiveAndDetail, background, artStyle, enhancer, artist);
        }

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your custom subject: ");
                String mainSubject = scanner.nextLine();

                ArtPromptGenerator generator = new ArtPromptGenerator();
                String prompt = generator.generatePrompt(mainSubject);
                System.out.println(prompt);
        }

}
