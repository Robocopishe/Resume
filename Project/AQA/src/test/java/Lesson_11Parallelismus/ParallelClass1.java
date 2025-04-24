package Lesson_11Parallelismus;

import org.testng.annotations.Test;

public class ParallelClass1 {

    @Test
    public void parallel1() throws  InterruptedException  {
       Thread.sleep(1000);
       assertTrue(true);
    }
    @Test
    public void parallel2() throws  InterruptedException  {
        Thread.sleep(1500);
        assertTrue(true);
    }
    @Test
    public void parallel3() throws  InterruptedException  {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void parallel4() throws  InterruptedException  {
        Thread.sleep(2500);
        assertTrue(true);
    }
    @Test
    public void parallel5() throws  InterruptedException  {
        Thread.sleep(3000);
        assertTrue(true);
    }


    public void assertTrue(boolean conditions){
    }
}
