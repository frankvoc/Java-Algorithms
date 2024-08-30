public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + "Whip";
    }
    public double cost(){
        double cost =beverage.cost();
        String size = beverage.getSize();
        if(size.equals("tall")){
            cost += .5;
        }else if (size.equals("medium")){
            cost += .10;
        }else if (size.equals("large")){
            cost += .15;
        }
        return cost;
    }
}
