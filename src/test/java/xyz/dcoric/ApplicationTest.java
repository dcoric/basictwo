package xyz.dcoric;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import xyz.dcoric.dao.UserDao;
import xyz.dcoric.models.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created by denis on 15.12.2016..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void exampleTest() {
        User user = new User("test@email.com", "Test");
        userDao.save(user);
        Assert.notNull(user.getId());
    }
}
