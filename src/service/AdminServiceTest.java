package service;

import dao.allDo.MemberDO;
import dao.allDo.TrainerDO;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {

    @Test
    public void addTrainer() {
        TrainerDO u = new TrainerDO();
        u.setId("111546411");
        u.setPassword("vsdnjkvbsi");
        u.setName("cvdsv");
        AdminService S1 = new AdminService();
        Assert.assertEquals(S1.addTrainer(u), "Insert success");
    }

    @Test
    public void addCustomer() {
        MemberDO u = new MemberDO();
        u.setId("1234567");
        u.setPassword("vsdnjkvbsi");
        u.setName("cvdsv");
        AdminService S2 = new AdminService();
        Assert.assertEquals(S2.addCustomer(u), "Insert success");
    }

    @Test
    public void deleteCustomer() {
        AdminService S2 = new AdminService();
        Assert.assertEquals(S2.deleteCustomer("1234567"), "Delete successful");
    }

    @Test
    public void deleteTrainer() {
        AdminService S2 = new AdminService();
        Assert.assertEquals(S2.deleteTrainer("111546411"), "Delete successful");
    }
}