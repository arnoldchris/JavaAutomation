package software.testing.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJunitDemo {

    @Ignore
    public void test1(){
        System.out.println("Running Test 1");
    }
    @Test
    public void test2(){
        login("Customer","CustPassword");
        System.out.println("Running Test 2");
    }

    @Test
    public void test3(){
        login("Admin","Password123");
        System.out.println("Running Test 3");
    }

    private void login(String username, String password){
        //Code to launch browser
        //Enter usernmae
        //Enter password
        //Click on login button#
        System.out.println(username);
        System.out.println(password);
    }
}
