package aims.reefpage.repository;

import aims.reefpage.entity.Reef;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by pBowrey on 05/12/2016.
 */
@Configuration
public interface ReefRepository extends JpaRepository<Reef, String> {
}

//@Configuration
//public class RepositoryConfig extends RepositoryRestMvcConfiguration {
//    @Override
//    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.exposeIdsFor(User.class);
//    }
