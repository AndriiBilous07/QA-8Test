package lesson9.Converter;

public class Convert1 {
    public static void main(String[] args) {
        Convert1 convert1 = new Convert1("My convert");
        System.out.println("Converter name: " + convert1.getConverterName());

        // Проверяем работу методов конвертации
        System.out.println("Convert to int: " + convert1.convertToInt(123));
        System.out.println("Convert to double: " + convert1.convertToDouble(456.789));
        System.out.println("Convert to string: " + convert1.convertToString(true));

        // Пример неверного ввода
        System.out.println("Convert to int: " + convert1.convertToInt("abc"));
        System.out.println("Convert to double: " + convert1.convertToDouble("def"));
    }

    private String converterName;

    public Convert1(String converterName) {
        this.converterName = converterName;
    }

    public String getConverterName() {
        return converterName;
    }

    public int convertToInt(Object value) {
        if (value instanceof Boolean) {
            System.out.println("Input type is boolean.");
            return 0;
        } else {
            try {
                return Integer.parseInt(String.valueOf(value));
            } catch (NumberFormatException e) {
                System.out.println("Unable to convert to int. Invalid input.");
                return 0;
            }
        }
    }

    public double convertToDouble(Object value) {
        if (value instanceof Boolean) {
            System.out.println("Input type is boolean.");
            return 0.0;
        } else {
            try {
                return Double.parseDouble(String.valueOf(value));
            } catch (NumberFormatException e) {
                System.out.println("Unable to convert to double. Invalid input.");
                return 0.0;
            }
        }
    }

    public String convertToString(Object value) {
        return String.valueOf(value);
    }
}


