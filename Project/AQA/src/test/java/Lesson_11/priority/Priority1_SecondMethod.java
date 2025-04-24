package Lesson_11.priority;

import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;


public class Priority1_SecondMethod extends TestListenerAdapter {

    @Test(dependsOnMethods = {"g"})
    public void a() {assertTrue(true);}

    @Test(dependsOnMethods = {"f"})
    public void b() {assertTrue(true);}

    @Test(dependsOnMethods = {"e"})
    public void c() {assertTrue(true);}

    @Test(dependsOnMethods = {"d"})
    public void d() {assertTrue(true);}

    @Test(dependsOnMethods = {"c"})
    public void e() {assertTrue(true);}

    @Test(dependsOnMethods = {"b"})
    public void f() {assertTrue(true);}

    @Test(dependsOnMethods = {"a"})
    public void g() {assertTrue(true);}

    private void assertTrue(boolean conditions) {}
}