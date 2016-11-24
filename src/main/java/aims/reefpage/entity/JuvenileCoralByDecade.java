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
    private Long minColonies;
    private Long maxColonies;
    private Long avgColonies;
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
    @Column(name = "MIN_COLONIES")
    public Long getMinColonies() {
        return minColonies;
    }

    public void setMinColonies(Long minColonies) {
        this.minColonies = minColonies;
    }

    @Basic
    @Column(name = "MAX_COLONIES")
    public Long getMaxColonies() {
        return maxColonies;
    }

    public void setMaxColonies(Long maxColonies) {
        this.maxColonies = maxColonies;
    }

    @Basic
    @Column(name = "AVG_COLONIES")
    public Long getAvgColonies() {
        return avgColonies;
    }

    public void setAvgColonies(Long avgColonies) {
        this.avgColonies = avgColonies;
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
        if (minColonies != null ? !minColonies.equals(that.minColonies) : that.minColonies != null) return false;
        if (maxColonies != null ? !maxColonies.equals(that.maxColonies) : that.maxColonies != null) return false;
        if (avgColonies != null ? !avgColonies.equals(that.avgColonies) : that.avgColonies != null) return false;
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
        result = 31 * result + (minColonies != null ? minColonies.hashCode() : 0);
        result = 31 * result + (maxColonies != null ? maxColonies.hashCode() : 0);
        result = 31 * result + (avgColonies != null ? avgColonies.hashCode() : 0);
        result = 31 * result + (yearsSurveyed != null ? yearsSurveyed.hashCode() : 0);
        return result;
    }
}
