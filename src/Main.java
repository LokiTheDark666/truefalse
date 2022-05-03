public class Main {
    public static void main(String[] args) {
        int balance = 100; //начальный счет
        int income = 2000; //сумма пополнения
        int bonus = 0; //колличество бонусов
        if (income >= 100) {
            bonus = (income / 100); //колличество бонусов
        }
        int total = balance + income + bonus; //баланс после пополнения
        System.out.println((total) + " баланс");
    }
}
