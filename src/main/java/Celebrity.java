import java.util.Random;

public class Celebrity {

    private Person[] celebrities;

    public Celebrity() {
        initCelebrities();
    }

    private void initCelebrities() {
        celebrities = new Person[]{
                new Person("Keanu",
                        "Reeves",
                        "m",
                        "🔹 He is a Canadian actor. He was Born on September 2, 1964, in Beirut, Lebanon." +
                                "\n🔹 He has received critical acclaim for his performances in movies like \\\"The Matrix\\\" and \\\"John Wick\\\" series."
                ),
                new Person("Snoop",
                        "Dogg",
                        "m",
                        "🔹 He is an American rapper, singer, songwriter, and actor" +
                                "\n🔹 He is Known for his love of cannabis and has become an advocate for its legalization"
                ),
                new Person("Will",
                        "Smith",
                        "m",
                        "🔹 He is an American actor, rapper, and film producer." +
                                " \n🔹 He is Known for his charismatic and versatile acting performances in movies such as \"Men in Black,\" \"Independence Day,\" and \"The Pursuit of Happyness.\""
                ),
                new Person("Selena",
                        "Gomez",
                        "f",
                        "🔹 She is an American singer, songwriter, and actress" +
                                "\n🔹 As a singer, she has released several successful albums, including \"Stars Dance\" and \"Revival.\""
                ),
                new Person("Brad",
                        "Pitt",
                        "m",
                        "🔹 He is an american actor and film producer. " +
                                "\n🔹 He is Known for his versatility as an actor, playing diverse characters in various genres." +
                                "\n🔹 He received critical acclaim for his performances in movies like \"Fight Club,\" \"Inglourious Basterds,\" and \"The Curious Case of Benjamin Button.\""
                ),
                new Person("Cameron",
                        "Diaz",
                        "f",
                        "🔹 She is an american actress, producer, and author.  " +
                                "\n🔹 Known for her roles in popular films like \"There's Something About Mary,\" \"Charlie's Angels,\" and \"Shrek\" (voice of Princess Fiona)."

                ),
                new Person("Emma",
                        "Watson",
                        "f",
                        "🔹 British actress, model, and activist." +
                                "\n🔹 Gained international fame for her portrayal of Hermione Granger in the 'Harry Potter' film series."
                ),
                new Person("Jim",
                        "Carry",
                        "m",
                        "🔹 Canadian-American actor, comedian, writer, and artist." +
                                "\n🔹 Gained popularity with his comedic roles in films and television, such as 'Ace Ventura: Pet Detective', 'The Mask', and 'Dumb and Dumber'."
                ),
                new Person("Johnny",
                        "Depp",
                        "m",
                        "🔹 American actor, producer, and musician." +
                                "\n🔹 Became famous for his role as Captain Jack Sparrow in the 'Pirates of the Caribbean' film series."
                ),
                new Person("Kate",
                        "Winslet",
                        "f",
                        "🔹 British actress." +
                                "\n🔹 Collaborated with director James Cameron on both 'Titanic' and 'Avatar 2'."
                ),
                new Person("Natalie",
                        "Portman",
                        "f",
                        "🔹 Israeli-American actress and filmmaker." +
                                "\n🔹 Has starred in critically acclaimed films like 'V for Vendetta', 'Closer', and 'Jackie'."
                ),
                new Person("Rihanna",
                        "",
                        "f",
                        "🔹 Barbadian singer, actress, and businesswoman." +
                                "\n🔹 Known for her powerful and distinctive voice, as well as her versatility in music genres, including R&B, pop, and dancehall." +
                                "\n🔹 Has released multiple successful albums, including 'Good Girl Gone Bad', 'Loud', and 'Anti'."
                ),
                new Person("Scarlett",
                        "Johansen",
                        "f",
                        "🔹 American actress and singer." +
                                "\n🔹 Known for her versatility as an actress, excelling in both dramatic and action roles." +
                                "\n🔹 Rose to prominence for her roles in films like 'Lost in Translation', 'Girl with a Pearl Earring', and 'Match Point'."
                ),
                new Person("shakira",
                        "",
                        "f",
                        "🔹 Colombian singer, songwriter, and dancer." +
                                "\n🔹 Known for her unique and versatile music style, blending Latin, pop, and world music influences." +
                                "\n🔹 Has released several successful albums, including 'Laundry Service', 'Fijación Oral', and 'El Dorado'."
                ),
                new Person("Tom",
                        "Cruise",
                        "m",
                        "🔹 American actor and producer." +
                                "\n🔹 Gained widespread fame for his roles in iconic films like 'Top Gun', 'Mission: Impossible', and 'Jerry Maguire'."
                )
        };
    }

    public Person randomfigure() {
        Random random = new Random();
        int index = random.nextInt(0, celebrities.length);
        return celebrities[index];
    }
}
