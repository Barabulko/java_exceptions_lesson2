import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            String userInput = getStringFromUser();
            System.out.println("Вы ввели: " + userInput);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: пустые строки вводить нельзя!");
        }
    }

    public static String getStringFromUser() throws EmptyInputException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new EmptyInputException();
        }

        return input;
    }
}

class EmptyInputException extends Exception {
    public EmptyInputException() {
        super();
    }
}