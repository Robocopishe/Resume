package Lesson_11Groping;
import org.testng.annotations.Test;

public class Groups {

    @Test(groups = {"first"})
    public void one() {
        assertTrue(true);
    }

    @Test(groups = {"second"})
    public void two() {
        assertTrue(true);
    }

    @Test(groups = {"first"})
    public void three() {
        assertTrue(true);
    }

    @Test(groups = {"second"})
    public void four() {
        assertTrue(true);
    }

    @Test(groups = {"first"})
    public void five() {
        assertTrue(true);
    }

    @Test(groups = {"second"})
    public void six() {
        assertTrue(true);
    }

    @Test(groups = {"first"})
    public void seven() {
        assertTrue(true);
    }

    @Test(groups = {"second"})
    public void eight() {
        assertTrue(true);
    }
    public void assertTrue (boolean condition){

    }
}
