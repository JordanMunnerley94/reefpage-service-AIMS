package aims.reefpage.repository;

import aims.reefpage.entity.MantaByYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface  MantaByYearRepository extends JpaRepository<MantaByYear, String> {
    List<MantaByYear> findByFullreefId(@Param("reefid")String fullreefId);
}
