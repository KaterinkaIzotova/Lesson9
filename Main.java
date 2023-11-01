import java.util.Scanner;

/*
Создать программу, которая проверяет, является ли введенная строка числом, и в зависимости от
результата выводит сообщение пользователю. Вы должны использовать конструкцию multi-Catch
для обработки разных типов исключений. Пользователь вводит строку.
Вы пытаетесь преобразовать эту строку в число с использованием Integer.parseInt().
Используйте конструкцию  multi-Catch для обработки исключений NumberFormatException (если введенная
строка не является числом) и NullPointerException (если строка является null).
Выведите соответствующее сообщение пользователю, например, "Это не число" или  "Вы ввели пустую строку"
 или "Это число".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число: ");
        String str = scan.nextLine();

        try {
            Integer.parseInt(str);

        } catch ( NumberFormatException | NullPointerException e){
            System.out.println("Вы ввели не число");
            System.exit(1);
        }
        System.out.println("Вы ввели число");
    }
}