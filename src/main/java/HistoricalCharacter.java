import java.util.Random;

public class HistoricalCharacter {
    private Person[] historicalCharacters;

    public HistoricalCharacter() {
        historicalCharacters = new Person[4];
        initCelebrities();
    }

    private void initCelebrities() {
        historicalCharacters = new Person[]{
                new Person("Abraham",
                        "Lincoln",
                        "m",
                        "🔹 American president and statesman." +
                                "\n🔹 Served as the 16th President of the United States from 1861 to 1865." +
                                "\n🔹 Played a crucial role in leading the nation through the Civil War and ending slavery."
                ),
                new Person("Albert",
                        "Einstein",
                        "m",
                        "🔹 Renowned physicist and mathematician." +
                                "\n🔹 Developed the theory of relativity, which revolutionized modern physics." +
                                "\n🔹 One of the most influential scientists of all time, his work has had a lasting impact on various fields of science and technology."
                ),
                new Person("Angela",
                        "Merkel",
                        "f",
                        "🔹 German politician and stateswoman." +
                                "\n🔹 Served as the Chancellor of Germany from 2005 to 2021, making her one of the longest-serving leaders in modern European history." +
                                "\n🔹 Played a key role in navigating Germany and the European Union through various economic and political challenges."
                ),
                new Person("Charlie",
                        "Chaplin",
                        "m",
                        "🔹 Legendary actor, comedian, and filmmaker." +
                                "\n🔹 Pioneered silent film comedy and made significant contributions to the film industry." +
                                "\n🔹 Starred in numerous classic films, including \"The Kid,\" \"City Lights,\" and \"Modern Times.\""
                ),
                new Person("Elon",
                        "Musk",
                        "m",
                        "🔹 South African-born American business magnate, engineer, and inventor." +
                                "\n🔹 Known for his ambitious goals of colonizing Mars and advancing renewable energy technologies." +
                                "\n🔹 Considered one of the most innovative and influential figures in technology and space exploration."
                ),
                new Person("Hilary",
                        "Clinton",
                        "f",
                        "🔹 American politician and diplomat." +
                                "\n🔹 Served as the First Lady of the United States from 1993 to 2001 during her husband's presidency." +
                                "\n🔹 Became the first woman in U.S. history to be nominated by a major party for President of the United States in 2016."
                ),
                new Person("Joseph",
                        "Stalin",
                        "m",
                        "🔹 Soviet politician and revolutionary." +
                                "\n🔹 Served as the General Secretary of the Communist Party of the Soviet Union from 1922 to 1952." +
                                "\n🔹 Known for his authoritarian rule, which included political purges and repression of perceived enemies, resulting in millions of deaths."
                ),
                new Person("Michael",
                        "Jackson",
                        "m",
                        "🔹 American singer, songwriter, and dancer." +
                                "\n🔹 Often referred to as the \"King of Pop.\"" +
                                "\n🔹 Known for his unique vocal style, impressive dance moves, and innovative music videos."
                ),
                new Person("Mother",
                        "Teresa",
                        "f",
                        "🔹 An Albanian-Indian Roman Catholic nun and missionary." +
                                "\n🔹 Devoted her life to serving the sick, destitute, and dying in the slums of Kolkata (Calcutta), India." +
                                "\n🔹 Known for her selfless and compassionate nature, she touched the lives of countless people through her acts of kindness and care."
                ),
                new Person("Nelson",
                        "Mandela",
                        "m",
                        "🔹 An anti-apartheid revolutionary and political leader." +
                                "\n🔹 Fought against racial segregation and discrimination in South Africa." +
                                "\n🔹 Known for his message of reconciliation and forgiveness, promoting peace and unity among all South Africans."
                ),
                new Person("Winston",
                        "Churchill",
                        "m",
                        "🔹 He was a British statesman, military leader, and writer." +
                                "\n🔹 Known for his powerful oratory skills, one of his most famous speeches was the \"We shall fight on the beaches\" speech during the Battle of Britain."

                )
        };
    }

    public Person randomfigure() {
        Random random = new Random();
        int index = random.nextInt(0, historicalCharacters.length);
        return historicalCharacters[index];
    }
}
