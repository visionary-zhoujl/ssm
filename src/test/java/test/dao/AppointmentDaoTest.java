package test.dao;

import cn.ssm.dao.AppointmentDao;
import cn.ssm.pojo.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

public class AppointmentDaoTest extends BaseTest {
    @Autowired
    private AppointmentDao appointmentDao;
    @Test
    public void testInsert(){
      appointmentDao.insertAppointment(1001,2005);
   }

   @Test
   public void testQueryAll(){
       Appointment appointment = appointmentDao.queryByKeyWithBook(1001, 2005);
       System.out.println(appointment);
   }
}
