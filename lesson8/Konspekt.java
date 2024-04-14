package lesson8;

public class Konspekt {

/*  Створити клас Конспект. Клас повинен містити такі поля:
    ПІБ студента;
    Назва предмету;
    Кількість сторінок;
    Рік випуску;
    Колір обкладинки.
    Назва закладу, де навчається студент;*/


    public String pIBstudent;

    public String nameTask;

    public int kilkStorinoc;

    public int ageVipusk;

    public String color;

    public String nameZaklad;

    public Konspekt(String pIBstudent, String nameTask, int kilkStorinoc, int ageVipusk,
                    String color, String nameZaklad) {
        this.pIBstudent = pIBstudent;
        this.nameTask = nameTask;
        this.kilkStorinoc = kilkStorinoc;
        this.ageVipusk = ageVipusk;
        this.color = color;
        this.nameZaklad = nameZaklad;
    }

    public static void main(String[] args) {
        Konspekt konspekt = new Konspekt("Білий Анатолій Васильович",
                "Висока кухня", 55, 2021,
                "Green", "Кухня у шефа Ектора Хіменес Браво");
        System.out.println("ПІБ студента:\n" + konspekt.pIBstudent);
        System.out.println("Назва предмету:\n" + konspekt.nameTask);
        System.out.println("Кількість сторінок:\n" + konspekt.kilkStorinoc);
        System.out.println("Рік ипуску:\n" + konspekt.ageVipusk);
        System.out.println("Колір обкладинки:\n" + konspekt.color);
        System.out.println("Назва закладу де навчається студент:\n" + konspekt.nameZaklad);

    }
}





