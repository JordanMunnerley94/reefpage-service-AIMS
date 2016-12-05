package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by pBowrey on 5/12/2016.
 */
@Entity
@Table(name = "REEF", schema = "REEFPAGE", catalog = "")
public class Reef {
    private String reefName;
    private String fullreefId;

    @Basic
    @Column(name = "REEF_NAME", nullable = true, length = 10)
    public String getReefName() {
        return reefName;
    }

    public void setReefName(String sampleId) {
        this.reefName = sampleId;
    }

    @Id
    @Column(name = "FULLREEF_ID", nullable = false, length = 10)
    public String getFullreefId() {
        return fullreefId;
    }

    public void setFullreefId(String fullreefId) {
        this.fullreefId = fullreefId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reef that = (Reef) o;

        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reefName != null ? reefName.hashCode() : 0;
        result = 31 * result + (fullreefId != null ? fullreefId.hashCode() : 0);
        return result;
    }
}
