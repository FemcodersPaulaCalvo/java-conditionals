import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

        String[] correctAnswers = {"b", "c", "bd", "a"};

        String[][] questionsAnswers = {{"¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?", "a. Ada Lovelace", "b. Jude Milhon", "c. Martha Ackelsberg", "d. Jane Jacobs"}, {"2. ¿Quién es Fuencisla Clemares?", "a. La directora general de IBM Europa, Oriente Medio y África", "b. La vicepresidenta de Microsoft Western Europe", "c. La directora general de Google en España y Portugal", "d. Fundadora y CEO de Marsi Bionics"}, {"3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?", "a. Primera programadora de software", "b. Una actriz de cine", "b. Una actriz de cine", "d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS"}, {"¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?", "a. Katherine Johnson, Dorothy Vaughan y Mary Jackson", "b. Jessica Miller, Emily Johnson, Sarah Davis", "c. bell hooks, Toni Morrison y Alice Walker", "d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman"}};

        byte points = 0;
        byte pointsOneCorrectAnswer = 5;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questionsAnswers.length; i++){
            String[] oneQuestionAnswer = questionsAnswers[i];
            for (int j = 0; j < questionsAnswers[i].length; j++){
                if (j == 0) {
                    System.out.println(oneQuestionAnswer[j]); // sin sangría
                } else {
                    System.out.println("\t" + oneQuestionAnswer[j]); // con sangría
                }
            }
            System.out.println("Which letter corresponds to the correct answer? (If there are two, write the two letters together, without spaces and in alphabetical order.):");

            points = ((scanner.nextLine()).trim()).equals(correctAnswers[i]) ? points += pointsOneCorrectAnswer : points ;
        }

        System.out.println("Your final score is: " + points);


        if(points < 5){
            System.out.println("Good luck next time");
        }else if( points >= 5 && points < 15){
                System.out.println("You haven't done wrong");
            } else {
                System.out.println("You really know a lot.");
            }

    }
    
}