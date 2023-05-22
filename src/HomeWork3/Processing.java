package HomeWork3;

public class Processing {
    try {
        int a = 5/0;
    } catch (ArithmeticException e) {
        System.out.println("Ошибка: деление на ноль");
    } catch (NullPointerException e) {
        System.out.println("Ошибка: обращение к несуществующему объекту");
    } finally {
        System.out.println("Работа программы завершена");
    }
}
