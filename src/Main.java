public class Main {
    public static void main(String[] args) {
        int x = 100; //начальный счет
        int y = 2000; //сумма пополнения
        int z = 0; //колличество бонусов
        if (y >= 100) {
            z = (y / 100); //колличество бонусов
        }
        int q = x + y + z; //баланс после пополнения
        System.out.println((q) + " баланс");
    }
}
