package Lesson_11Parallelismus;

import org.testng.annotations.Test;

public class ParallelClass2 {
    @Test
    public void parallel6() throws  InterruptedException  {
        Thread.sleep(1200);
        assertTrue(true);
    }
    @Test
    public void parallel7() throws  InterruptedException  {
        Thread.sleep(1700);
        assertTrue(true);
    }
    @Test
    public void parallel8() throws  InterruptedException  {
        Thread.sleep(2200);
        assertTrue(true);
    }
    @Test
    public void parallel9() throws  InterruptedException  {
        Thread.sleep(2700);
        assertTrue(true);
    }
    @Test
    public void parallel10() throws  InterruptedException  {
        Thread.sleep(3200);
        assertTrue(true);
    }
    public void assertTrue(boolean conditions){
    }
}