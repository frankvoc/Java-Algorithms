public abstract class Beverage {
    String description = "Unknown Beverage";
    private String size = "";
    public String getDescription(){
        return description;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public abstract double cost();
}
