//Observer is not a "no argument" method for updating
//we will now pull data!
public interface Observer {
    //we remove the parameters from the interface since the data will no longer be pushed directly
    void update();
}
