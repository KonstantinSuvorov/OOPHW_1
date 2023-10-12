import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ **********");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Baikal.toString(), new BigDecimal(80), 0.5),
                new BottleOfWater(prod.Donat.toString(), new BigDecimal(78), 0.45),
                new BottleOfWater(prod.Vittel.toString(), new BigDecimal(68), 0.43),
                new BottleOfWater("Боржоми", new BigDecimal(125), 0.7)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Боржоми"));
        System.out.println(vmBottle.getProduct("Vittel"));

        System.out.println("**********   ПОИСК ГОРЯЧИХ НАПИТКОВ  **********");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Кофе", new BigDecimal(120), 0.3, 90),
                new HotDrinks("Чай", new BigDecimal(110), 0.4, 80),
                new HotDrinks("Молоко", new BigDecimal(115), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Кофе"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(110)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Baikal,
        Donat,
        Vittel,
    }
}
