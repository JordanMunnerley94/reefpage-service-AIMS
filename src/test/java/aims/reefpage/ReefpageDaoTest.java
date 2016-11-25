package aims.reefpage;

import aims.reefpage.reefpage.ReefpageDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jmunnerl on 25/11/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReefpageDaoTest {
    @Autowired
    ReefpageDao reefpageDao;

    private Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void testHello() {
        log.info(reefpageDao.hello());
    }
}
