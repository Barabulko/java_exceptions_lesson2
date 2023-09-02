import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number;

        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }

        return number;
    }
}