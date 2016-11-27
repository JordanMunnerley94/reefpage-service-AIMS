package aims.reefpage.reefpage;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ReefPageController {

    @Autowired
    ReefpageDao reefpageDao;

    private static final String TEMPLATE = "Hello, %s!";

    @RequestMapping("/reefpage")
    public HttpEntity<ReefPageEntity> greeting(
            @RequestParam(value = "reefid", required = false, defaultValue = "18032S")
            String id)
    {
        ReefPageEntity result = reefpageDao.getAll(id);

        return new ResponseEntity<ReefPageEntity>(result, HttpStatus.OK);
    }
}