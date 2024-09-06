
public interface Command {
    // all we need is one method called execute().
    public void execute();
    public void undo(); // opposite of what was executed.
}
