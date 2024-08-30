// Mocha.java
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // Correctly appends "Mocha" to the description of the wrapped beverage
        return beverage.getDescription() + "Mocha ";
    }

    @Override
    public double cost() {
        double cost = beverage.cost(); // Get cost of the wrapped beverage
        String size = beverage.getSize(); // Get the size to adjust the cost

        // Adjust Mocha cost based on size using if-else statements
        if (size.equals("tall")) {
            cost += .15; // Cost for tall
        } else if (size.equals("medium")) {
            cost += .20; // Cost for grande
        } else if (size.equals("large")) {
            cost += .25; // Cost for venti
        }

        return cost;
    }
}
