package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "BENTHIC_GROUP_BY_DECADE", schema = "REEFPAGE", catalog = "")
public class BenthicGroupByDecade {
    private String decade;
    private String fullreefId;
    private String reefName;
    private String aSector;
    private String shelf;
    private String groupCode;
    private String groupDesc;
    private Long minCover;
    private Long maxCover;
    private Long avgCover;
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
    @Column(name = "GROUP_CODE")
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    @Basic
    @Column(name = "GROUP_DESC")
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Basic
    @Column(name = "MIN_COVER")
    public Long getMinCover() {
        return minCover;
    }

    public void setMinCover(Long minCover) {
        this.minCover = minCover;
    }

    @Basic
    @Column(name = "MAX_COVER")
    public Long getMaxCover() {
        return maxCover;
    }

    public void setMaxCover(Long maxCover) {
        this.maxCover = maxCover;
    }

    @Basic
    @Column(name = "AVG_COVER")
    public Long getAvgCover() {
        return avgCover;
    }

    public void setAvgCover(Long avgCover) {
        this.avgCover = avgCover;
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

        BenthicGroupByDecade that = (BenthicGroupByDecade) o;

        if (decade != null ? !decade.equals(that.decade) : that.decade != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (aSector != null ? !aSector.equals(that.aSector) : that.aSector != null) return false;
        if (shelf != null ? !shelf.equals(that.shelf) : that.shelf != null) return false;
        if (groupCode != null ? !groupCode.equals(that.groupCode) : that.groupCode != null) return false;
        if (groupDesc != null ? !groupDesc.equals(that.groupDesc) : that.groupDesc != null) return false;
        if (minCover != null ? !minCover.equals(that.minCover) : that.minCover != null) return false;
        if (maxCover != null ? !maxCover.equals(that.maxCover) : that.maxCover != null) return false;
        if (avgCover != null ? !avgCover.equals(that.avgCover) : that.avgCover != null) return false;
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
        result = 31 * result + (groupCode != null ? groupCode.hashCode() : 0);
        result = 31 * result + (groupDesc != null ? groupDesc.hashCode() : 0);
        result = 31 * result + (minCover != null ? minCover.hashCode() : 0);
        result = 31 * result + (maxCover != null ? maxCover.hashCode() : 0);
        result = 31 * result + (avgCover != null ? avgCover.hashCode() : 0);
        result = 31 * result + (yearsSurveyed != null ? yearsSurveyed.hashCode() : 0);
        return result;
    }
}
