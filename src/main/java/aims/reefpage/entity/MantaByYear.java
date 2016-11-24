package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "MANTA_BY_YEAR", schema = "REEFPAGE", catalog = "")
public class MantaByYear {
    private String fullreefId;
    private String reefName;
    private String aSector;
    private String shelf;
    private Long visitNo;
    private Long reportYear;
    private Long meanCots;
    private String mLive;
    private String medianHcRange;
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "VISIT_NO")
    public Long getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(Long visitNo) {
        this.visitNo = visitNo;
    }

    @Basic
    @Column(name = "REPORT_YEAR")
    public Long getReportYear() {
        return reportYear;
    }

    public void setReportYear(Long reportYear) {
        this.reportYear = reportYear;
    }

    @Basic
    @Column(name = "MEAN_COTS")
    public Long getMeanCots() {
        return meanCots;
    }

    public void setMeanCots(Long meanCots) {
        this.meanCots = meanCots;
    }

    @Basic
    @Column(name = "M_LIVE")
    public String getmLive() {
        return mLive;
    }

    public void setmLive(String mLive) {
        this.mLive = mLive;
    }

    @Basic
    @Column(name = "MEDIAN_HC_RANGE")
    public String getMedianHcRange() {
        return medianHcRange;
    }

    public void setMedianHcRange(String medianHcRange) {
        this.medianHcRange = medianHcRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MantaByYear that = (MantaByYear) o;

        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (aSector != null ? !aSector.equals(that.aSector) : that.aSector != null) return false;
        if (shelf != null ? !shelf.equals(that.shelf) : that.shelf != null) return false;
        if (visitNo != null ? !visitNo.equals(that.visitNo) : that.visitNo != null) return false;
        if (reportYear != null ? !reportYear.equals(that.reportYear) : that.reportYear != null) return false;
        if (meanCots != null ? !meanCots.equals(that.meanCots) : that.meanCots != null) return false;
        if (mLive != null ? !mLive.equals(that.mLive) : that.mLive != null) return false;
        if (medianHcRange != null ? !medianHcRange.equals(that.medianHcRange) : that.medianHcRange != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fullreefId != null ? fullreefId.hashCode() : 0;
        result = 31 * result + (reefName != null ? reefName.hashCode() : 0);
        result = 31 * result + (aSector != null ? aSector.hashCode() : 0);
        result = 31 * result + (shelf != null ? shelf.hashCode() : 0);
        result = 31 * result + (visitNo != null ? visitNo.hashCode() : 0);
        result = 31 * result + (reportYear != null ? reportYear.hashCode() : 0);
        result = 31 * result + (meanCots != null ? meanCots.hashCode() : 0);
        result = 31 * result + (mLive != null ? mLive.hashCode() : 0);
        result = 31 * result + (medianHcRange != null ? medianHcRange.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MantaByYear{" +
                "fullreefId='" + fullreefId + '\'' +
                ", reefName='" + reefName + '\'' +
                ", aSector='" + aSector + '\'' +
                ", shelf='" + shelf + '\'' +
                ", visitNo=" + visitNo +
                ", reportYear=" + reportYear +
                ", meanCots=" + meanCots +
                ", mLive='" + mLive + '\'' +
                ", medianHcRange='" + medianHcRange + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
