package service;

import dao.allDo.MemberDO;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CustomerServiceImplementTest {

    @org.junit.Test
    public void register() {
        CustomerServiceImplement test=  new CustomerServiceImplement();
        MemberDO u = new MemberDO();
        u.setId("1111111111");
        u.setPassword("12214325436547547");
        Assert.assertEquals(test.register(u), "注册成功,请登录！");
    }

    @org.junit.Test
    public void passwordIsValid() {


    }

    @org.junit.Test
    public void useridIsValid() {
    }

    @org.junit.Test
    public void login() {
    }

    @org.junit.Test
    public void upgrade() {
    }
}