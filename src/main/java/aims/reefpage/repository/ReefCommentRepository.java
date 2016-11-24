package aims.reefpage.repository;

import aims.reefpage.entity.Photo;
import aims.reefpage.entity.ReefComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gcoleman on 14/10/2016.
 */
public interface ReefCommentRepository extends JpaRepository<ReefComment, String> {
}
