package aims.reefpage.repository;

import aims.reefpage.entity.MantaByDecade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface MantaByDecadeRepository extends JpaRepository<MantaByDecade, String> {
    List<MantaByDecade> findByFullreefId(@Param("reefid") String fullreefId);
}
