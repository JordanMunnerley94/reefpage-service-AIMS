package aims.reefpage;

import aims.reefpage.entity.MantaByYear;
import aims.reefpage.repository.MantaByYearRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersistenceTests {
    @Autowired
    MantaByYearRepository mantaByYearRepository;

    private Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void testMantaReefAll() {
        log.info("Manta All");
        final MantaByYear mantaByYearEntity = mantaByYearRepository.findAll().get(0);

        log.info(mantaByYearEntity.toString());

    }

    @Test
    public void testMantaReefByReef() {
        log.info("Manta By Reef");
        final List<MantaByYear> mantaByYearEntities = mantaByYearRepository.findByFullreefId("21529S");

        log.info(mantaByYearEntities.toString());

    }

}
