package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "JUVENILE_CORAL_BY_DECADE", schema = "REEFPAGE", catalog = "")
public class JuvenileCoralByDecade {
    private String decade;
    private String fullreefId;
    private String reefName;
    private String aSector;
    private String shelf;
    private Long minColoniesPerTransect;
    private Long maxColoniesPerTransect;
    private Long avgColoniesPerTransect;
    private Long yearsSurveyed;
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DECADE")
    public String getDecade() {
        return decade;
    }

    public void setDecade(String decade) {
        this.decade = decade;
    }

    @Basic
    @Column(name = "FULLREEF_ID")
    public String getFullreefId() {
        return fullreefId;
    }

    public void setFullreefId(String fullreefId) {
        this.fullreefId = fullreefId;
    }

    @Basic
    @Column(name = "REEF_NAME")
    public String getReefName() {
        return reefName;
    }

    public void setReefName(String reefName) {
        this.reefName = reefName;
    }

    @Basic
    @Column(name = "A_SECTOR")
    public String getaSector() {
        return aSector;
    }

    public void setaSector(String aSector) {
        this.aSector = aSector;
    }

    @Basic
    @Column(name = "SHELF")
    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Basic
    @Column(name = "MIN_COLONIES_PER_TRANSECT")
    public Long getMinColoniesPerTransect() {
        return minColoniesPerTransect;
    }

    public void setMinColoniesPerTransect(Long minColoniesPerTransect) {
        this.minColoniesPerTransect = minColoniesPerTransect;
    }

    @Basic
    @Column(name = "MAX_COLONIES_PER_TRANSECT")
    public Long getMaxColoniesPerTransect() {
        return maxColoniesPerTransect;
    }

    public void setMaxColoniesPerTransect(Long maxColoniesPerTransect) {
        this.maxColoniesPerTransect = maxColoniesPerTransect;
    }

    @Basic
    @Column(name = "AVG_COLONIES_PER_TRANSECT")
    public Long getAvgColoniesPerTransect() {
        return avgColoniesPerTransect;
    }

    public void setAvgColoniesPerTransect(Long avgColoniesPerTransect) {
        this.avgColoniesPerTransect = avgColoniesPerTransect;
    }

    @Basic
    @Column(name = "YEARS_SURVEYED")
    public Long getYearsSurveyed() {
        return yearsSurveyed;
    }

    public void setYearsSurveyed(Long yearsSurveyed) {
        this.yearsSurveyed = yearsSurveyed;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JuvenileCoralByDecade that = (JuvenileCoralByDecade) o;

        if (decade != null ? !decade.equals(that.decade) : that.decade != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (aSector != null ? !aSector.equals(that.aSector) : that.aSector != null) return false;
        if (shelf != null ? !shelf.equals(that.shelf) : that.shelf != null) return false;
        if (minColoniesPerTransect != null ? !minColoniesPerTransect.equals(that.minColoniesPerTransect) : that.minColoniesPerTransect != null) return false;
        if (maxColoniesPerTransect != null ? !maxColoniesPerTransect.equals(that.maxColoniesPerTransect) : that.maxColoniesPerTransect != null) return false;
        if (avgColoniesPerTransect != null ? !avgColoniesPerTransect.equals(that.avgColoniesPerTransect) : that.avgColoniesPerTransect != null) return false;
        if (yearsSurveyed != null ? !yearsSurveyed.equals(that.yearsSurveyed) : that.yearsSurveyed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = decade != null ? decade.hashCode() : 0;
        result = 31 * result + (fullreefId != null ? fullreefId.hashCode() : 0);
        result = 31 * result + (reefName != null ? reefName.hashCode() : 0);
        result = 31 * result + (aSector != null ? aSector.hashCode() : 0);
        result = 31 * result + (shelf != null ? shelf.hashCode() : 0);
        result = 31 * result + (minColoniesPerTransect != null ? minColoniesPerTransect.hashCode() : 0);
        result = 31 * result + (maxColoniesPerTransect != null ? maxColoniesPerTransect.hashCode() : 0);
        result = 31 * result + (avgColoniesPerTransect != null ? avgColoniesPerTransect.hashCode() : 0);
        result = 31 * result + (yearsSurveyed != null ? yearsSurveyed.hashCode() : 0);
        return result;
    }
}
