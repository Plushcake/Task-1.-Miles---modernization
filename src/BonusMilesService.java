public class BonusMilesService {
    public int calculate(int bilet) {

        //int price = 10_000;
        //int miles = service.calculate(price);
        //int bilet = 600; //Стоимость билета.
        int raschet = 20; // Одна миля, двадцать рублей.

        int itog = bilet / raschet;
        return itog;


    }
}
