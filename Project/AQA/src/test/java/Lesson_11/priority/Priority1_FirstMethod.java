package Lesson_11.priority;

import org.testng.annotations.Test;

public class Priority1_FirstMethod {

    @Test(description = "Test a", priority = 7)
    public void a() {assertTrue(true);}

    @Test(description = "Test b", priority = 6)
    public void b() {assertTrue(true);}

    @Test(description = "Test c", priority = 5)
    public void c() {assertTrue(true);}

    @Test(description = "Test d", priority = 4)
    public void d() {assertTrue(true);}

    @Test(description = "Test e", priority = 3)
    public void e() {assertTrue(true);}

    @Test(description = "Test f", priority = 2)
    public void f() {assertTrue(true);}

    @Test(description = "Test g", priority = 1)
    public void g() {assertTrue(true);}

    private void assertTrue(boolean conditions) {}
}