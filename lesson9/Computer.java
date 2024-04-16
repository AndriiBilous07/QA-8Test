package lesson9;

public class Computer /*1) Створити клас Computer з конструктором, що приймає параметри Марка тип String,
 ціна тип int,оперативна пам'ять тип int, та відеокарта тип int.
Перевизначити метод toString для виведення об'єкта класу на слід. вигляді:
"Створено PC.
Ім'я = марка.
Ціна = ціна.
Відеокарта = обсяг відеокарти.
ОЗУ = Об'єм оперативної пам'яті."
Усі поля класу Computer мають бути приватними.
Також створіть публічні методи для отримання інформації про поля класу Computer. А також методи зміни його полів.
Перевизначте метод equals та метод hashCode для вашого класу.
Зробіть так, щоб комп'ютери вважалися однаковими у випадку, якщо у них:
рівні значення полів марка, оперативна пам'ять та відеокарта.
рівні значення полів марка, оперативна пам'ять та відеокарта.
В окремому класі створіть об'єкт класу комп'ютер і виведіть у консоль інформацію про ваш об'єкт.
*/ {
    private String name;
    private int Price;
    private int OZU;
    private int VideoCart;

    public Computer(String name, int price, int ozu, int videoCart) {
        this.name = name;
        this.Price = price;
        this.OZU = ozu;
        this.VideoCart = videoCart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getOZU() {
        return OZU;
    }

    public void setOZU(int OZU) {
        this.OZU = OZU;
    }

    public int getVideoCart() {
        return VideoCart;
    }

    public void setVideoCart(int videoCart) {
        VideoCart = videoCart;
    }
    public Computer(String name, double price, int ozu, int videoCart) {
        this.name = name;
        this.Price = (int) price;
        this.OZU = ozu;
        this.VideoCart = videoCart;
    }

    @Override
    public String toString() {
        return "Computer{name='" + name + "', Price=" + Price + ", OZU=" + OZU + ", VideoCart=" + VideoCart + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Computer computer = (Computer) obj;
        return name.equals(computer.name) &&
                OZU == computer.OZU &&
                VideoCart == computer.VideoCart;

    }

    public int hashCode() {
        int result = name.hashCode();
        result = 25 * result + OZU;
        result = 25 * result + VideoCart;
        return result;
    }
}
