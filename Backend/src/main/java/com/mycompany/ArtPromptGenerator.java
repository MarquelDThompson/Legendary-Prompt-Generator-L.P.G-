package com.mycompany;

import java.util.Random;
import java.util.Scanner;

public class ArtPromptGenerator {

        protected static final String[] adjectivesAndDetails = {
                        "cute", "attractive", "unattractive", "tall", "short", "fat", "skinny", "muscular", "slim",
                        "large", "small", "big", "bright", "dark", "colorful", "plain", "glamorous", "drab", "elegant",
                        "frumpy", "stylish",
                        "tasteful", "gaudy", "fancy", "simple", "ornate", "sophisticated", "refined", "cluttered",
                        "minimalist", "busy",
                        "chaotic", "orderly", "enchanting", "mysterious", "majestic", "serene", "vibrant", "ethereal",
                        "gargantuan", "petite", "sturdy", "graceful", "whimsical", "ominous",
                        "luminous", "shadowy", "radiant", "muted", "opulent", "rustic",
                        "sleek", "ornamental", "pristine", "worn", "haunting", "cheerful",
                        "grandiose", "humble", "lavish", "minimalistic", "bustling", "tranquil",
                        "harmonious", "dissonant", "ancient", "modern", "timeless", "avant-garde",
                        "mythical", "realistic", "abstract", "figurative", "dynamic", "static",
                        "saturated", "pastel", "monochrome", "polarized", "diffuse", "sharp",
                        "glossy", "matte", "textured", "smooth", "geometric", "organic",
                        "symmetrical", "asymmetrical", "elevated", "submerged", "fragmented", "whole",
                        "arid", "lush", "arctic", "tropical", "celestial", "terrestrial",
                        "mechanical", "natural", "constructed", "eroded", "polished", "raw"
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
                        "a mystical portal", "an abandoned amusement park under a full moon",
                        "a neon-lit alley after rain",
                        "an ancient temple overgrown with vines", "a floating market at dawn",
                        "a starship bridge traveling through hyperspace",
                        "a lush rooftop garden in a bustling metropolis",
                        "the heart of a massive library filled with arcane books",
                        "a serene coral reef teeming with marine life",
                        "a hidden glade with a crystal-clear spring",
                        "the ruins of a futuristic city reclaimed by nature",
                        "a quiet café on a rainy Parisian street", "a misty harbor with old ships rocking gently",
                        "an underground cavern glowing with bioluminescent plants",
                        "a grand ballroom during the height of a masquerade",
                        "a steampunk airship dock overlooking a sprawling city",
                        "a cyberpunk night market, full of vendors and hackers",
                        "an ice castle built on a frozen lake, under the aurora borealis",
                        "a Victorian greenhouse with exotic, fragrant flowers",
                        "a bustling spaceport on a distant planet", "a gothic cathedral at twilight",
                        "a windswept desert with towering sand dunes",
                        "a secret garden with magical creatures flittering about",
                        "a mountaintop monastery shrouded in clouds",
                        "a jazz club in the heart of Harlem during the Roaring Twenties",
                        "a surreal landscape with floating islands", "a vibrant coral atoll in the clear blue tropics",
                        "an enchanted forest with trees whispering secrets",
                        "a high-tech laboratory conducting mysterious experiments",
                        "an ancient library with scrolls containing lost knowledge",
                        "a jazz-filled speakeasy during Prohibition",
                        "a moonlit crossroads in the deep South, where deals are made",
                        "a secluded monastery with ancient murals",
                        "a hologram-filled command center on a space station",
                        "a candle-lit catacomb with echoes of ancient chants",
                        "an art deco skyscraper with panoramic views of a 1920s skyline",
                        "a traditional Japanese onsen in the snowy mountains",
                        "a dystopian cityscape with towering neon billboards",
                        "a tranquil bamboo forest swaying in the breeze",
                        "a dilapidated circus tent with echoes of past performances",
                        "a cliff-side monastery with a view of the sprawling sea below",
                        "a pirate cove with hidden treasures and old tales",
                        "a magnificent opera house during the final act",
                        "an old-world bazaar brimming with exotic spices and textiles",
                        "a rainforest canopy walkway amidst the chatter of wildlife",
                        "a Venetian canal at sunset, with gondolas gliding by",
                        "an interdimensional gateway flaring with unknown energy",
                        "a Norse village on the eve of a legendary festival",
                        "a hi-tech utopia with advanced sustainable living",
                        "a witch's cottage deep in an enchanted swamp",
                        "a dragon's lair filled with gold and ancient relics",
                        "an underwater city with bubble domes and aquatic inhabitants",
                        "a lost valley with dinosaurs roaming freely"
        };

        protected static final String[] artStyles = {
                        "Realism", "Impressionism", "Expressionism", "Cubism", "Surrealism",
                        "Pop Art", "Fauvism", "Art Nouveau", "Dada", "Minimalism",
                        "Conceptual Art", "Post-Impressionism", "Renaissance", "Baroque",
                        "Romanticism", "Neoclassicism", "Mannerism", "Ukiyo-e", "Futurism",
                        "Suprematism", "Constructivism", "De Stijl", "Art Deco", "Bauhaus",
                        "Metaphysical Painting", "New Objectivity", "Precisionism", "Photorealism",
                        "Digital", "Street", "Neo-Expressionism",
                        "Transavantgarde", "Stuckism", "Toyism", "Superflat", "Lowbrow", "Hyperrealism",
                        "Vaporwave", "Pixel Art", "Gothic", "Pointillism", "Art Brut",
                        "Outsider Art", "Street Photography", "Virtual Reality", "Algorithmic Art", "Aerosol",
                        "Art Informel", "Assemblage", "Figurativism", "Graffiti", "Hard-Edged Painting",
                        "Ink Wash Painting", "Light and Space", "Massurealism", "Narrative Art",
                        "Plop ", "Psychedelic ", "Pure Land Photography", "Quilling",
                        "Robotic", "Sand ", "Sign Painting", "Synchromism", "Transgressive Art",
                        "Visionary Art", "Zombie Formalism", "Anime", "Manga",
                        "Comic Book", "Cartoon",

        };

        protected static final String[] enhancers = {

                        "in 8K resolution", "with HD clarity", "using cinematographic techniques",
                        "with photorealistic textures", "composed epically", "rendered in Unreal Engine",
                        "with cinematic color grading", "in the style of portrait photography",
                        "capturing ultra-wide angles", "with a deep depth of field", "hyper-detailed",
                        "with beautifully coordinated colors", "showcasing insane details",
                        "with intricate patterns", "featuring beautifully color graded visuals",
                        "styled like editorial photography", "with a photogenic composition",
                        "using a unique photoshoot technique", "emphasizing depth of field",
                        "with a tilt-shift effect", "balanced in white balance",
                        "in 32K ultra resolution", "utilizing super-resolution techniques",
                        "with a megapixel-rich quality", "rendered in ProPhoto RGB color space",
                        "prepared for VR immersion", "backlit with soft illumination",
                        "in natural light", "highlighting incandescent tones", "fiber-optic textures",
                        "with a moody lighting ambiance", "lit with cinematic techniques",
                        "with professional studio lighting", "softly lit for a dreamy feel",
                        "with volumetric lighting effects", "contrasted by contre-jour lighting",
                        "accentuated with beautiful lighting", "enhanced with dramatic accent lighting",
                        "featuring global illumination", "with screen space global illumination",
                        "and ray tracing for realistic light diffusion", "shaded with ambient occlusion",
                        "with screen space ambient occlusion for depth"
        };

        protected static final String[] artists = {
                        "Yoshitaka Amano", "Ancient Chinese Painting", "Will Murai", "Bayard Wu", "James Jean",
                        "J.C. Leyendecker", "Dean Cornwell", "Frank Frazetta", "Ilya Repin", "William Waterhouse",
                        "Howard Pyle", "Alex Ross", "Leonardo da Vinci", "Vincent van Gogh", "Michelangelo",
                        "Rembrandt", "Claude Monet", "Peter Paul Rubens", "Jan van Eyck", "Titian",
                        "Caravaggio", "Diego Velázquez", "Pablo Picasso", "Jackson Pollock", "Andy Warhol",
                        "Frida Kahlo", "Salvador Dalí", "Georgia O'Keeffe", "Jean-Michel Basquiat", "Norman Rockwell",
                        "Banksy", "Keith Haring", "Osamu Tezuka", "Hayao Miyazaki", "Akira Toriyama",
                        "Masashi Kishimoto", "Eiichiro Oda", "Hirohiko Araki", "Tite Kubo", "Sui Ishida",
                        "Makoto Shinkai", "Junji Ito", "Stan Lee", "Jack Kirby", "Steve Ditko",
                        "Todd McFarlane", "Frank Miller", "Jim Lee", "Neal Adams", "Brian Bolland",
                        "Mike Mignola", "Alan Moore", "John Singer Sargent", "Alphonse Mucha", "Gustav Klimt",
                        "Egon Schiele", "Tamara de Lempicka", "Diego Rivera", "Henri Matisse", "Marc Chagall",
                        "Yoko Ono", "Louise Bourgeois", "Tracey Emin", "Zaha Hadid", "Jean-Paul Gaultier",
                        "Alexander McQueen", "Kara Walker", "Shirin Neshat", "Marlene Dumas", "El Anatsui",
                        "Anish Kapoor", "Cai Guo-Qiang", "Vik Muniz", "Jenny Saville", "Grayson Perry",
                        "Kehinde Wiley", "Hiroshi Sugimoto", "Mariko Mori", "Guo Pei", "Faith Ringgold",
                        "Wangechi Mutu", "Zeng Fanzhi", "Kazuo Shiraga", "Njideka Akunyili Crosby", "Kaws",
                        "Julie Mehretu", "Wu Guanzhong", "Agnes Martin", "Alice Neel", "Lucian Freud",
                        "Eduardo Kobra", "David LaChapelle", "Gregory Crewdson", "Bridget Riley", "Howardena Pindell",
                        "Joan Mitchell", "Lee Krasner", "Helen Frankenthaler", "Willem de Kooning",
                        "Artemisia Gentileschi",
                        "Henri Rousseau", "Paul Cézanne", "Gustave Courbet", "Édouard Manet", "Pierre-Auguste Renoir",
                        "Camille Pissarro", "Mary Cassatt", "Edgar Degas", "Jean-Auguste-Dominique Ingres",
                        "Giotto di Bondone",
                        "Hilma af Klint", "Fernand Léger", "Amrita Sher-Gil", "Antoni Gaudí", "L.S. Lowry",
                        "René Magritte", "Edward Hopper", "Grant Wood", "Andrew Wyeth", "Jacob Lawrence",
                        "Félix Vallotton", "Berthe Morisot", "Winslow Homer", "John Constable", "J.M.W. Turner",
                        "Masaccio", "Donatello", "Sandro Botticelli", "Raphael", "Yayoi Kusama",
                        "Marina Abramović", "Anselm Kiefer", "Gerhard Richter", "David Hockney", "Ai Weiwei",
                        "Cindy Sherman", "Damien Hirst", "Takashi Murakami", "Jeff Koons", "Mariko Mori",
                        "Naoko Takeuchi", "Go Nagai", "Katsuhiro Otomo", "Clamp", "Yoshihiro Togashi",
                        "Naoki Urasawa", "Kentaro Miura", "Hiromu Arakawa", "Rumiko Takahashi", "Joe Shuster",
                        "Jerry Siegel", "Bob Kane", "Bill Finger", "George Pérez", "Chris Claremont",
                        "Rob Liefeld", "Mark Millar", "Warren Ellis", "John Romita Sr.", "John Romita Jr.",
                        "Gilbert Shelton", "Robert Crumb", "Moebius", "Herge", "Osamu Tezuka",
                        "Rei Hiroe", "Yuu Watase", "Gosho Aoyama", "Shigeru Mizuki", "Takeshi Obata"

        };

        public String generatePrompt(String mainSubject) {
                Random random = new Random();

                String adjectiveAndDetail = adjectivesAndDetails[random.nextInt(adjectivesAndDetails.length)];
                String background = backgrounds[random.nextInt(backgrounds.length)];
                String artStyle = artStyles[random.nextInt(artStyles.length)];
                String enhancer = enhancers[random.nextInt(enhancers.length)];
                String artist = artists[random.nextInt(artists.length)];

                return String.format(
                                "Create a dynamic , extremely detailed artwork featuring %s , that is %s, set in %s, with a %s art style, %s, painted by %s.",
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
