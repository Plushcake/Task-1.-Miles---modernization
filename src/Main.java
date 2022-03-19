public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        //int price = 10_000;
        //int miles = service.calculate(price);
        //System.out.println(miles);

        int bonusMileService1 = service.calculate(600);
        System.out.println(bonusMileService1);

        int bonusMileService2 = service.calculate(2000);
        System.out.println(bonusMileService2);
    }
}
