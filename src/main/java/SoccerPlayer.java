import java.util.Random;

public class SoccerPlayer {
    private Person[] soccerPlayers;

    public SoccerPlayer() {
        initCelebrities();
    }

    private void initCelebrities() {
        soccerPlayers = new Person[]{
                new Person("Cristiano",
                        "Ronaldo",
                        "m",
                        "🔹 He is a Portuguese professional footballer and widely regarded as one of the greatest football players of all time." +
                                "\n🔹 Has played for some of the biggest football clubs in the world, including Sporting Lisbon, Manchester United, Real Madrid, and Juventus." +
                                "\n🔹 Has won numerous awards and accolades throughout his career, including five Ballon d'Or titles, which are awarded to the world's best player each year."
                ),
                new Person("David",
                        "Bekham",
                        "m",
                        "🔹 Born on May 2, 1975, in Leytonstone, London, England." +
                                "\n🔹 Played for top clubs such as Manchester United, Real Madrid, LA Galaxy, and Paris Saint-Germain." +
                                "\n🔹 Known for his exceptional free-kick taking and precise passing abilities."
                ),
                new Person("Karim",
                        "Benzema",
                        "m",
                        "🔹 Born on December 19, 1987, in Lyon, France." +
                                "\n🔹 Has played for top clubs like Olympique Lyonnais and Real Madrid, where he achieved significant success." +
                                "\n🔹 Known for his exceptional goal-scoring abilities and skillful play."
                ),
                new Person("Lionel",
                        "Messi",
                        "m",
                        "🔹 A professional footballer and considered one of the greatest players in the history of the sport." +
                                "\n🔹 Spent the majority of his career with FC Barcelona, where he achieved numerous titles and accolades." +
                                "\n🔹 Holds multiple records, including the most Ballon d'Or awards."
                ),
                new Person("Manuel",
                        "Neuer",
                        "m",
                        "🔹 A professional footballer and regarded as one of the best goalkeepers in the world." +
                                "\n🔹 Has played for Bayern Munich and the German national team." +
                                "\n🔹 Known for his exceptional shot-stopping abilities and quick reflexes."
                ),
                new Person("Neymar",
                        "",
                        "m",
                        "🔹 Born on February 5, 1992, in Mogi das Cruzes, Brazil." +
                                "\n🔹 Has played for top clubs like FC Barcelona and Paris Saint-Germain (PSG)." +
                                "\n🔹 Frequently compared to football legends like Lionel Messi and Cristiano Ronaldo."
                ),
                new Person("Oliver",
                        "Kahn",
                        "m",
                        "🔹 A former German football goalkeeper known for his commanding presence in the penalty area." +
                                "\n🔹 Played for top clubs like Bayern Munich and Karlsruher SC." +
                                "\n🔹 Earned the nickname \"Der Titan\" (The Titan) for his dominant and fearless performances."
                ),
                new Person("Robert",
                        "Lewandowski",
                        "m",
                        "🔹 A Polish professional footballer known for his goal-scoring prowess." +
                                "\n🔹 Holds numerous records, including being the all-time leading foreign goal-scorer in Bundesliga history." +
                                "\n🔹 Played as a striker for Bayern Munich in the Bundesliga."
                ),
                new Person("Toni",
                        "Kroos",
                        "m",
                        "🔹 A German professional footballer known for his playmaking skills." +
                                "\n🔹 Plays as a midfielder for Real Madrid in La Liga and the German national team." +
                                "\n🔹 Renowned for his passing accuracy, vision, and ability to control the tempo of the game."
                ),
                new Person("Zinedine",
                        "Zidane",
                        "m",
                        "🔹 A retired French professional footballer and current football manager." +
                                "\n🔹 Achieved success with clubs like Juventus and Real Madrid, winning multiple domestic league titles and UEFA Champions League trophies." +
                                "\n🔹 Known for his calm and composed demeanor both on and off the field."
                )

        };
    }

    public Person randomfigure() {
        Random random = new Random();
        int index = random.nextInt(0, soccerPlayers.length);
        return soccerPlayers[index];
    }

}
