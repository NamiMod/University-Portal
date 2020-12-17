/**
 * --Food--
 * in this class we define food for portal
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */
public class Food {

    private String name;
    private int price;

    /**
     * set new name for food
     * @param name name of food
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get name of food
     * @return name of food
     */
    public String getName() {
        return name;
    }

    /**
     * set new price for food
     * @param price of food
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * get price of food
     * @return price of food
     */
    public int getPrice() {
        return price;
    }
}
