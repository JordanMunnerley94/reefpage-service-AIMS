package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "JUVENILE_CORAL_BY_YEAR", schema = "REEFPAGE", catalog = "")
public class JuvenileCoralByYear {
    private String fullreefId;
    private String reefName;
    private String aSector;
    private String shelf;
    private Long visitNo;
    private Long reportYear;
    private Long colonies;
    private Long transects;
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
    @Column(name = "COLONIES")
    public Long getColonies() {
        return colonies;
    }

    public void setColonies(Long colonies) {
        this.colonies = colonies;
    }

    @Basic
    @Column(name = "TRANSECTS")
    public Long getTransects() {
        return transects;
    }

    public void setTransects(Long transects) {
        this.transects = transects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JuvenileCoralByYear that = (JuvenileCoralByYear) o;

        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (aSector != null ? !aSector.equals(that.aSector) : that.aSector != null) return false;
        if (shelf != null ? !shelf.equals(that.shelf) : that.shelf != null) return false;
        if (visitNo != null ? !visitNo.equals(that.visitNo) : that.visitNo != null) return false;
        if (reportYear != null ? !reportYear.equals(that.reportYear) : that.reportYear != null) return false;
        if (colonies != null ? !colonies.equals(that.colonies) : that.colonies != null) return false;
        if (transects != null ? !transects.equals(that.transects) : that.transects != null) return false;

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
        result = 31 * result + (colonies != null ? colonies.hashCode() : 0);
        result = 31 * result + (transects != null ? transects.hashCode() : 0);
        return result;
    }
}
