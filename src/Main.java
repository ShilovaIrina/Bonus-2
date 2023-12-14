public class Main {
    public static void main(String[] args) {
        int balance = 100; //сумма, которая была у нас до пополнения счета
        int refill = 1000; // сумма пополнения

        int bonus;
        if (refill >= 1000) {
            bonus = refill/100;}
        else {
            bonus = 0;
        } int result = balance + refill + bonus;
        System.out.println("Ваш баланс:" + result);
        System.out.println("Бонусные рубли:" + bonus);
    }
}