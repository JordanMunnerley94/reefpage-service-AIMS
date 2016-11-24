package aims.reefpage.repository;

import aims.reefpage.entity.MantaPathBound;
import aims.reefpage.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface MantaPathBoundRepository extends JpaRepository<MantaPathBound, String> {
}
