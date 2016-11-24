package aims.reefpage.repository;

import aims.reefpage.entity.BenthicGroupByDecade;
import aims.reefpage.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface PhotoRepository extends JpaRepository<Photo, String> {
    List<Photo> findByFullreefId(@Param("reefid") String fullreefId);
    List<Photo> findByFullreefIdAndReefZoneCode(@Param("reefid") String fullreefId, @Param("zone") String reefZoneCode);
}
