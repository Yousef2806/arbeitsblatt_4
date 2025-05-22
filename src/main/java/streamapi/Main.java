package streamapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/** Starter for the stream api task. */
public class Main {
    /**
     * And go.
     *
     * @param args command line parameters, not used
     */
    public static void main(String... args) throws IOException {

        // Task I: Students

        // Task II: Set of ECTS of all IFM students

        // Task III: Random

        // Task IV+V: Resources
        System.out.println(resources("file.txt"));
    }

    /**
     * Task I: Students.
     *
     * <p>Calculate the total credits earned by all students.
     *
     * @param studentList List of students
     * @return Sum of credit points of all students
     */
    public static Integer students(List<Student> studentList) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Task II: Set of ECTS of all IFM students.
     *
     * <p>Identify the different credit points of all IFM students.
     *
     * @param studentList List of students
     * @return Set of credit points of all IFM students
     */
    public static Set<Integer> ifmCps(List<Student> studentList) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Task III: Random.
     *
     * <p>Calculate ten random integers between 0 and 10.
     *
     * @return List of ten random integers (between 0 and 10)
     */
    public static List<Integer> random() {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Task IV: Open resources.
     *
     * <p>Open the file specified by the {@code path} parameter. This file is located in the
     * resources folder of the project.
     *
     * @param path Name of the file to be accessed within the resource folder.
     * @return An open {@link InputStream} for the resource file
     */
    /**
     * Öffnet eine Ressource aus dem Ressourcen-Ordner als InputStream.
     *
     * @param path Dateiname innerhalb des Ressourcen-Ordners
     * @return InputStream der Ressource
     */
    private static InputStream getResourceAsStream(String path) {
        InputStream inputStream = Main.class.getResourceAsStream("/streamapi/" + path);
        if (inputStream == null) {
            throw new IllegalArgumentException("Ressource nicht gefunden: " + path);
        }
        return inputStream;
    }


    /**
     * Task V: Read resources.
     *
     * <p>Read all lines from the resource file (specified by the {@code path} parameter). Merge all
     * lines that start with the letter "a" and are at least two characters long. The lines are to
     * be separated in the resulting string by a line-end character {@code "\n"}.
     *
     * @param path Name of the file to be accessed within the resource folder
     * @return String of all matching lines, separated by {@code "\n"}
     */
    /**
     * Liest die Datei über getResourceAsStream ein,
     * filtert alle Zeilen, die mit 'a' anfangen und mind. 2 Zeichen lang sind,
     * und verbindet sie mit Zeilenumbruch.
     *
     * @param path Pfad der Ressource
     * @return Gefilterter und verbundener String
     * @throws IOException falls Einlesen fehlschlägt
     */
    public static String resources(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getResourceAsStream(path)))) {
            return reader.lines()
                .filter(line -> line.startsWith("a"))
                .filter(line -> line.length() >= 2)
                .collect(Collectors.joining("\n"));
        }



}
}
