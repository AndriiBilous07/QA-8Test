package lesson9.kalkulator;

//import java.util.Scanner;

import java.util.Scanner;

public class StartKalkul {
    public class Calculator {
        public void start() {
            System.out.println("Калькулятор запущено");
            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.println("Введіть дію (або введіть 'Stop' для завершення):");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрито");
                    break;
                }

                try {
                    double result = evaluate(input);
                    System.out.println("Результат: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Неправильний формат виразу. Спробуйте ще раз.");
                }
            }

            scanner.close();
        }

        private double evaluate(String expression) {
            String[] parts = expression.split("[+\\-*/]");
            double operand1 = Double.parseDouble(parts[0].trim());
            double operand2 = Double.parseDouble(parts[1].trim());

            if (expression.contains("+")) {
                return operand1 + operand2;
            } else if (expression.contains("-")) {
                return operand1 - operand2;
            } else if (expression.contains("*")) {
                return operand1 * operand2;
            } else if (expression.contains("/")) {
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Ділення на нуль неможливе");
                }
                return operand1 / operand2;
            } else {
                throw new IllegalArgumentException("Неправильний формат виразу");
            }
        }

        public void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.start();
        }
    }
}
