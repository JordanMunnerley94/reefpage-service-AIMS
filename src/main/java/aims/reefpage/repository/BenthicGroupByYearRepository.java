package aims.reefpage.repository;

import aims.reefpage.entity.BenthicGroupByYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface BenthicGroupByYearRepository extends JpaRepository<BenthicGroupByYear, String> {
    List<BenthicGroupByYear> findByFullreefId(@Param("reefid") String fullreefId);
    List<BenthicGroupByYear> findByFullreefIdAndGroupCode(@Param("reefid") String fullreefId, @Param("group") String groupCode);
}
