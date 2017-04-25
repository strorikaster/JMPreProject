import java.util.Scanner;

/**
 * Created by A.Zotov on 21.04.2017.
 */
public class ExtractFioRegexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите Фамилию Имя и Отчество одной строкой через пробел");
        String strFIO = sc.nextLine();

        String[] name = strFIO.split("\\s");

        System.out.println("Фамилия: " + name[0]);
        System.out.println("Имя: " + name[1]);
        System.out.println("Отчество: " + name[2]);
    }
}
