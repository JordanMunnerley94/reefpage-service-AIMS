package aims.reefpage.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Calendar;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "REEF_COMMENT", schema = "REEFPAGE", catalog = "")
public class ReefComment {
    private String fullreefId;
    private String comments;
    private Calendar sampleDate;
    private String reefName;

    @Id
    @Column(name = "FULLREEF_ID", nullable = true, length = 20)
    public String getFullreefId() {
        return fullreefId;
    }

    public void setFullreefId(String fullreefId) {
        this.fullreefId = fullreefId;
    }

    @Basic
    @Column(name = "COMMENTS", nullable = true, length = 4000)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "SAMPLE_DATE", nullable = true)
    public Calendar getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(Calendar sampleDate) {
        this.sampleDate = sampleDate;
    }

    @Basic
    @Column(name = "REEF_NAME", nullable = true, length = 50)
    public String getReefName() {
        return reefName;
    }

    public void setReefName(String reef) {
        this.reefName = reef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReefComment that = (ReefComment) o;

        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (sampleDate != null ? !sampleDate.equals(that.sampleDate) : that.sampleDate != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fullreefId != null ? fullreefId.hashCode() : 0;
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (sampleDate != null ? sampleDate.hashCode() : 0);
        result = 31 * result + (reefName != null ? reefName.hashCode() : 0);
        return result;
    }
}
