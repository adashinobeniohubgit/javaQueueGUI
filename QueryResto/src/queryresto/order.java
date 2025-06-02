package queryresto;


public class order {
    private String foodOrder;
    private String diningOption;

    order(String foodOrder, String diningOption) {
        this.foodOrder = foodOrder;
        this.diningOption = diningOption;
    }

    @Override 
    public String toString() {
        return "Food Order: " + foodOrder + ", Dining Option: " + diningOption;
    }
}
