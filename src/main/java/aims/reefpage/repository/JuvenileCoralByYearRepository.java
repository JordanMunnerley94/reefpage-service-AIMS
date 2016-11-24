package aims.reefpage.repository;

import aims.reefpage.entity.JuvenileCoralByYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface JuvenileCoralByYearRepository extends JpaRepository<JuvenileCoralByYear, String> {
    List<JuvenileCoralByYear> findByFullreefId(@Param("reefid") String fullreefId);
}
