package Matcher;

/**
 * Created by seth on 11/30/16.
 */
abstract class Matcher {
    public abstract void operation1();
    public abstract void operation2();
    public abstract void operation3();
    public abstract void operation4();

    public void templatMethod() {
        operation1();
        operation2();
        operation3();
        operation4();
    }
}
