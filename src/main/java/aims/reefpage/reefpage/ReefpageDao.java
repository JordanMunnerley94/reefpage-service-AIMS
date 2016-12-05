package aims.reefpage.reefpage;

import aims.reefpage.entity.*;
import aims.reefpage.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jmunnerl on 25/11/2016.
 */
@Component
public class ReefpageDao {

    @Autowired
    BenthicGroupByDecadeRepository benthicGroupByDecadeRepository;
    @Autowired
    BenthicGroupByYearRepository benthicGroupByYearRepository;
    @Autowired
    FishByDecadeRepository fishByDecadeRepository;
    @Autowired
    FishByYearRepository fishByYearRepository;
    @Autowired
    JuvenileCoralByDecadeRepository juvenileCoralByDecadeRepository;
    @Autowired
    JuvenileCoralByYearRepository juvenileCoralByYearRepository;
    @Autowired
    MantaByYearRepository mantaByYearRepository;
    @Autowired
    MantaByDecadeRepository mantaByDecadeRepository;
    @Autowired
    MantaPathBoundRepository mantaPathBoundRepository;
    @Autowired
    PhotoRepository photoRepository;
    @Autowired
    ReefCommentRepository reefCommentRepository;
    @Autowired
    ReefRepository reefRepository;



    public ReefPageEntity getAll(String id) {
        return new ReefPageEntity(getBenthicGroupByDecade(id), getBenthicGroupByYear(id), getFishByDecade(id), getFishByYear(id), getJuvenileCoralByDecade(id),
                getJuvenileCoralByYear(id), getMantaByDecade(id), getMantaByYear(id), getMantaPathBound(id),
                getPhoto(id), getReefComment(id), getReef(id));
    }

    private List<BenthicGroupByYear> getBenthicGroupByYear(String id) {
        return benthicGroupByYearRepository.findByFullreefIdAndGroupCode(id, "HC");
    }

    private List<BenthicGroupByDecade> getBenthicGroupByDecade(String id) {
        return benthicGroupByDecadeRepository.findByFullreefIdAndGroupCode(id, "HC");
    }

    private List<FishByYear> getFishByYear(String id) {
        return fishByYearRepository.findByFullreefId(id);
    }

    private List<FishByDecade> getFishByDecade(String id) {
        return fishByDecadeRepository.findByFullreefId(id);
    }

    private List<JuvenileCoralByYear> getJuvenileCoralByYear(String id) {
        return juvenileCoralByYearRepository.findByFullreefId(id);
    }

    private List<JuvenileCoralByDecade> getJuvenileCoralByDecade(String id) {
        return juvenileCoralByDecadeRepository.findByFullreefId(id);
    }

    private List<MantaByYear> getMantaByYear(String id) {
        return mantaByYearRepository.findByFullreefId(id);
    }

    private List<MantaByDecade> getMantaByDecade(String id) {
        return mantaByDecadeRepository.findByFullreefId(id);
    }

    private MantaPathBound getMantaPathBound(String id) {
        return mantaPathBoundRepository.findOne(id);
    }

    private List<Photo> getPhoto(String id) {
        return photoRepository.findByFullreefId(id);
    }

    private ReefComment getReefComment(String id) {
        return reefCommentRepository.findOne(id);
    }

    private Reef getReef(String id) {
        return reefRepository.findOne(id);
    }


}
