public class BonusMilesService {
    public int calculate(int ticket) {

        //int price = 10_000;
        //int miles = service.calculate(price);
        //int ticket = 600; //Стоимость билета.
        int calculations = 20; // Одна миля, двадцать рублей.

        int total = ticket / calculations;
        return total;

    }
}
