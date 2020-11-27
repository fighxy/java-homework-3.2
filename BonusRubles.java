public class BonusRubles {
    public static void main(String[] args) {
        int currentAccount = 500; // Начальный счет клиента
        int transfer = 1250; // Сумма пополнения
        int bonus; // переменна бонуса
        if (transfer >=1000){
            bonus = transfer / 100 ;
        } else {
            bonus = 0;
        }
        int total = currentAccount + transfer + bonus; // итоговый счет после пополнения
System.out.print("Итоговый счет: " + total + " руб.");

    }
}
