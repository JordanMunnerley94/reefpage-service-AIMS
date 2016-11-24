package aims.reefpage.repository;

import aims.reefpage.entity.FishByYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface FishByYearRepository extends JpaRepository<FishByYear, String> {
    List<FishByYear> findByFullreefId(@Param("reefid") String fullreefId);
}
