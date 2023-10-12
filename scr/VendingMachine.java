/**
 * Интерфейс Торгового автомата
 */
public interface VendingMachine {
    /**
     * Внесение Продуктов в Торговый автомат
     */
    void initProduct();

    /**
     * Получение Продукта из Торгового автомата
     *
     * @return строку
     */
    String getProduct();
}
