/**
 * --Food Schedule--
 * in this class we define food Schedule for portal
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */
public class FoodSchedule {

    private Food[] schedule;

    /**
     * create new schedule
     */
    public FoodSchedule() {
        schedule = new Food[5];
    }

    /**
     * get schedule
     *
     * @return food schedule
     */
    public Food[] getSchedule() {
        return schedule;
    }

    /**
     * get food
     *
     * @return food from schedule
     */
    public Food getFood(int i) {
        return schedule[i];
    }

    /**
     * set schedule
     *
     * @param schedule new food schedule for week
     */
    public void setSchedule(Food[] schedule) {
        this.schedule = schedule;
    }
}
