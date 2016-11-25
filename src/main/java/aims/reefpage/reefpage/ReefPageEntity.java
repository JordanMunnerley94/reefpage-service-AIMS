package aims.reefpage.reefpage;

import aims.reefpage.entity.*;

import java.util.List;

/**
 * Created by pbowrey on 25/11/2016.
 */

public class ReefPageEntity {

    private String id;

    private List<BenthicGroupByDecade> bethicGroupByDecade;
    private List<BenthicGroupByYear> benthicGroupByYear;
    private List<FishByDecade> fishByDecade;
    private List<FishByYear> fishByYear;
    private List<JuvenileCoralByDecade> juvenileCoralByDecade;
    private List<JuvenileCoralByYear> juvenileCoralByYear;
    private List<MantaByDecade> mantaByDecade;
    private List<MantaByYear> mantaByYear;
    private List<MantaPathBound> mantaPathBound;
    private List<Photo> photo;
    private List<ReefComment> reefComment;

    public ReefPageEntity(List<BenthicGroupByDecade> bethicGroupByDecade,
                          List<BenthicGroupByYear> benthicGroupByYear,
                          List<FishByDecade> fishByDecade,
                          List<FishByYear> fishByYear,
                          List<JuvenileCoralByDecade> juvenileCoralByDecade,
                          List<JuvenileCoralByYear> juvenileCoralByYear,
                          List<MantaByDecade> mantaByDecade,
                          List<MantaByYear> mantaByYear,
                          List<MantaPathBound> mantaPathBound,
                          List<Photo> photo,
                          List<ReefComment> reefComment)
    {
        this.bethicGroupByDecade = bethicGroupByDecade;
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
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<BenthicGroupByDecade> getBethicGroupByDecade() {
        return bethicGroupByDecade;
    }

    public void setBethicGroupByDecade(List<BenthicGroupByDecade> bethicGroupByDecade) {
        this.bethicGroupByDecade = bethicGroupByDecade;
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

    public List<MantaPathBound> getMantaPathBound() {
        return mantaPathBound;
    }

    public void setMantaPathBound(List<MantaPathBound> mantaPathBound) {
        this.mantaPathBound = mantaPathBound;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public List<ReefComment> getReefComment() {
        return reefComment;
    }

    public void setReefComment(List<ReefComment> reefComment) {
        this.reefComment = reefComment;
    }

    @Override
    public String toString() {
        return "ReefPageEntity{" +
                "\nbethicGroupByDecade=" + bethicGroupByDecade +
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
                '}';
    }
}
