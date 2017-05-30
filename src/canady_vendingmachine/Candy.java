package canady_vendingmachine;

public class Candy {

    String name;
    String brand;
    double cost;
    int cals;

    public Candy() {
        name = "";
        brand = "";
        cost = 0.0;
        cals = 0;
    }

    public Candy(String a, String b, int c, double d) {
        name = a;
        brand = b;
        cals = c;
        cost = d;
    }

    @Override
    public String toString() {
        return name + "\nType: " + brand + "\nCalories/Serving: " + cals + "\nCost: $" + cost;
    }
}
