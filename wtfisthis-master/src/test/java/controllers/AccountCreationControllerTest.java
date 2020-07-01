package controllers;

import org.junit.*;



public class AccountCreationControllerTest
{


    @Before
    public void set()
    {
        AccountCreationController.setCode("3465464");
    }


    @Test
    public void noInputTest()
    {


    }

    @After
    public void unset()
    {
        AccountCreationController.setCode(null);
    }
}