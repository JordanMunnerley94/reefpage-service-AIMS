package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "MANTA_BY_DECADE", schema = "REEFPAGE", catalog = "")
public class MantaByDecade {
    private String decade;
    private String fullreefId;
    private String reefName;
    private String aSector;
    private String shelf;
    private Double minCotsPerTow;
    private Double maxCotsPerTow;
    private Double avgCotsPerTow;
    private Long minMedianHcRange;
    private Long maxMedianHcRange;
    private Long avgMedianHc;
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
    @Column(name = "MIN_COTS_PER_TOW")
    public Double getMinCotsPerTow() {
        return minCotsPerTow;
    }

    public void setMinCotsPerTow(Double minCotsPerTow) {
        this.minCotsPerTow = minCotsPerTow;
    }

    @Basic
    @Column(name = "MAX_COTS_PER_TOW")
    public Double getMaxCotsPerTow() {
        return maxCotsPerTow;
    }

    public void setMaxCotsPerTow(Double maxCotsPerTow) {
        this.maxCotsPerTow = maxCotsPerTow;
    }

    @Basic
    @Column(name = "AVG_COTS_PER_TOW")
    public Double getAvgCotsPerTow() {
        return avgCotsPerTow;
    }

    public void setAvgCotsPerTow(Double avgCotsPerTow) {
        this.avgCotsPerTow = avgCotsPerTow;
    }

    @Basic
    @Column(name = "MIN_MEDIAN_HC_RANGE")
    public Long getMinMedianHcRange() {
        return minMedianHcRange;
    }

    public void setMinMedianHcRange(Long minMedianHcRange) {
        this.minMedianHcRange = minMedianHcRange;
    }

    @Basic
    @Column(name = "MAX_MEDIAN_HC_RANGE")
    public Long getMaxMedianHcRange() {
        return maxMedianHcRange;
    }

    public void setMaxMedianHcRange(Long maxMedianHcRange) {
        this.maxMedianHcRange = maxMedianHcRange;
    }

    @Basic
    @Column(name = "AVG_MEDIAN_HC")
    public Long getAvgMedianHc() {
        return avgMedianHc;
    }

    public void setAvgMedianHc(Long avgMedianHc) {
        this.avgMedianHc = avgMedianHc;
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

        MantaByDecade that = (MantaByDecade) o;

        if (decade != null ? !decade.equals(that.decade) : that.decade != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (aSector != null ? !aSector.equals(that.aSector) : that.aSector != null) return false;
        if (shelf != null ? !shelf.equals(that.shelf) : that.shelf != null) return false;
        if (minCotsPerTow != null ? !minCotsPerTow.equals(that.minCotsPerTow) : that.minCotsPerTow != null)
            return false;
        if (maxCotsPerTow != null ? !maxCotsPerTow.equals(that.maxCotsPerTow) : that.maxCotsPerTow != null)
            return false;
        if (avgCotsPerTow != null ? !avgCotsPerTow.equals(that.avgCotsPerTow) : that.avgCotsPerTow != null)
            return false;
        if (minMedianHcRange != null ? !minMedianHcRange.equals(that.minMedianHcRange) : that.minMedianHcRange != null)
            return false;
        if (maxMedianHcRange != null ? !maxMedianHcRange.equals(that.maxMedianHcRange) : that.maxMedianHcRange != null)
            return false;
        if (avgMedianHc != null ? !avgMedianHc.equals(that.avgMedianHc) : that.avgMedianHc != null) return false;
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
        result = 31 * result + (minCotsPerTow != null ? minCotsPerTow.hashCode() : 0);
        result = 31 * result + (maxCotsPerTow != null ? maxCotsPerTow.hashCode() : 0);
        result = 31 * result + (avgCotsPerTow != null ? avgCotsPerTow.hashCode() : 0);
        result = 31 * result + (minMedianHcRange != null ? minMedianHcRange.hashCode() : 0);
        result = 31 * result + (maxMedianHcRange != null ? maxMedianHcRange.hashCode() : 0);
        result = 31 * result + (avgMedianHc != null ? avgMedianHc.hashCode() : 0);
        result = 31 * result + (yearsSurveyed != null ? yearsSurveyed.hashCode() : 0);
        return result;
    }
}
