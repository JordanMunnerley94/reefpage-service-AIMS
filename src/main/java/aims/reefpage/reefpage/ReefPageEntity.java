package aims.reefpage.reefpage;

import aims.reefpage.entity.*;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pbowrey on 25/11/2016.
 */

public class ReefPageEntity extends ResourceSupport {

    private List<BenthicGroupByDecade> benthicGroupByDecade;
    private List<BenthicGroupByYear> benthicGroupByYear;
    private List<FishByDecade> fishByDecade;
    private List<FishByYear> fishByYear;
    private List<JuvenileCoralByDecade> juvenileCoralByDecade;
    private List<JuvenileCoralByYear> juvenileCoralByYear;
    private List<MantaByDecade> mantaByDecade;
    private List<MantaByYear> mantaByYear;
    private MantaPathBound mantaPathBound;
    private List<Photo> photo;
    private ReefComment reefComment;
    private Reef reef;

    @JsonCreator
    public ReefPageEntity(@JsonProperty("benthicGroupByDecade") List<BenthicGroupByDecade> benthicGroupByDecade,
                          @JsonProperty("benthicGroupByYear") List<BenthicGroupByYear> benthicGroupByYear,
                          @JsonProperty("fishByDecade") List<FishByDecade> fishByDecade,
                          @JsonProperty("fishByYear") List<FishByYear> fishByYear,
                          @JsonProperty("juvenileCoralByDecade") List<JuvenileCoralByDecade> juvenileCoralByDecade,
                          @JsonProperty("juvenileCoralByYear") List<JuvenileCoralByYear> juvenileCoralByYear,
                          @JsonProperty("mantaByDecade")List<MantaByDecade> mantaByDecade,
                          @JsonProperty("mantaByYear")List<MantaByYear> mantaByYear,
                          @JsonProperty("mantaPathBound")MantaPathBound mantaPathBound,
                          @JsonProperty("photo")List<Photo> photo,
                          @JsonProperty("reefComment")ReefComment reefComment,
                          @JsonProperty("reef")Reef reef)
    {
        this.benthicGroupByDecade = benthicGroupByDecade;
        this.benthicGroupByYear = benthicGroupByYear;
        this.fishByDecade = fishByDecade;
        this.fishByYear = fishByYear;
        this.juvenileCoralByDecade = juvenileCoralByDecade;
        this.juvenileCoralByYear = juvenileCoralByYear;
        this.mantaByDecade = mantaByDecade;
        this.mantaByYear = mantaByYear;
        this.mantaPathBound = mantaPathBound;
        this.photo = photo;
        this.reefComment = reefComment;
        this.reef = reef;
    }

    public List<BenthicGroupByDecade> getBenthicGroupByDecade() {
        return benthicGroupByDecade;
    }

    public void setBenthicGroupByDecade(List<BenthicGroupByDecade> benthicGroupByDecade) {
        this.benthicGroupByDecade = benthicGroupByDecade;
    }

    public List<BenthicGroupByYear> getBenthicGroupByYear() {
        return benthicGroupByYear;
    }

    public void setBenthicGroupByYear(List<BenthicGroupByYear> benthicGroupByYear) {
        this.benthicGroupByYear = benthicGroupByYear;
    }

    public List<FishByDecade> getFishByDecade() {
        return fishByDecade;
    }

    public void setFishByDecade(List<FishByDecade> fishByDecade) {
        this.fishByDecade = fishByDecade;
    }

    public List<FishByYear> getFishByYear() {
        return fishByYear;
    }

    public void setFishByYear(List<FishByYear> fishByYear) {
        this.fishByYear = fishByYear;
    }

    public List<JuvenileCoralByDecade> getJuvenileCoralByDecade() {
        return juvenileCoralByDecade;
    }

    public void setJuvenileCoralByDecade(List<JuvenileCoralByDecade> juvenileCoralByDecade) {
        this.juvenileCoralByDecade = juvenileCoralByDecade;
    }

    public List<JuvenileCoralByYear> getJuvenileCoralByYear() {
        return juvenileCoralByYear;
    }

    public void setJuvenileCoralByYear(List<JuvenileCoralByYear> juvenileCoralByYear) {
        this.juvenileCoralByYear = juvenileCoralByYear;
    }

    public List<MantaByDecade> getMantaByDecade() {
        return mantaByDecade;
    }

    public void setMantaByDecade(List<MantaByDecade> mantaByDecade) {
        this.mantaByDecade = mantaByDecade;
    }

    public List<MantaByYear> getMantaByYear() {
        return mantaByYear;
    }

    public void setMantaByYear(List<MantaByYear> mantaByYear) {
        this.mantaByYear = mantaByYear;
    }

    public MantaPathBound getMantaPathBound() {
        return mantaPathBound;
    }

    public void setMantaPathBound(MantaPathBound mantaPathBound) {
        this.mantaPathBound = mantaPathBound;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public ReefComment getReefComment() {
        return reefComment;
    }

    public void setReefComment(ReefComment reefComment) {
        this.reefComment = reefComment;
    }

    public Reef getReef() {
        return reef;
    }

    public void setReef(Reef reef) {
        this.reef = reef;
    }

    @Override
    public String toString() {
        return "ReefPageEntity{" +
                "\nbenthicGroupByDecade=" + benthicGroupByDecade +
                ", \nbenthicGroupByYear=" + benthicGroupByYear +
                ", \nfishByDecade=" + fishByDecade +
                ", \nfishByYear=" + fishByYear +
                ", \njuvenileCoralByDecade=" + juvenileCoralByDecade +
                ", \njuvenileCoralByYear=" + juvenileCoralByYear +
                ", \nmantaByDecade=" + mantaByDecade +
                ", \nmantaByYear=" + mantaByYear +
                ", \nmantaPathBound=" + mantaPathBound +
                ", \nphoto=" + photo +
                ", \nreefComment=" + reefComment +
                ", \nreefDetails=" + reef +
                '}';
    }
}
