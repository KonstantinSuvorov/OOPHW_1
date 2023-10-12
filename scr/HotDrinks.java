import java.math.BigDecimal;

/**
 * Класс Горячих напитков
 */
public class HotDrinks extends Drinkables {
    private int temp;

    /**
     * Перегруженный конструктор класса Горячих напитков
     *
     * @param name   Наименование напитка
     * @param price  Цена напитка
     * @param volume Объем напитка
     * @param temp   Температура напитка
     */
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    /**
     * Получение температуры напитка
     *
     * @return температуру напитка
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Переопределенный метод
     *
     * @return наименование продукта, стоимость, объем и температуру.
     */
    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}
