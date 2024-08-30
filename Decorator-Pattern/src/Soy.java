public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+ "Soy";
    }
    public double cost(){
        double cost = beverage.cost();
        String size = beverage.getSize();
        if(size.equals("tall")){
            cost += .10;
        }else if (size.equals("medium")){
            cost += .15;
        }else if (size.equals("large")){
            cost += .20;
        }
        return cost;
    }
}
