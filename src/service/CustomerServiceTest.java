package service;

import dao.alldo.MemberDO;
import org.junit.Assert;

public class CustomerServiceTest {

    @org.junit.Test
    public void register() {
        CustomerService test=  new CustomerService();
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