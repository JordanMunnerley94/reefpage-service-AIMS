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
    private Double reef_lat;
    private Double reef_long;

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

    @Basic
    @Column(name = "REEF_LAT", nullable = true, length = 10)
    public Double getReef_lat() {
        return reef_lat;
    }

    public void setReef_lat(Double reef_lat) {
        this.reef_lat = reef_lat;
    }

    @Basic
    @Column(name = "REEF_LONG", nullable = true, length = 10)
    public Double getReef_long() {
        return reef_long;
    }

    public void setReef_long(Double reef_long) {
        this.reef_long = reef_long;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reef that = (Reef) o;

        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reef_lat != null ? !reef_lat.equals(that.reef_lat) : that.reef_lat != null) return false;
        if (reef_long != null ? !reef_long.equals(that.reef_long) : that.reef_long != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reefName != null ? reefName.hashCode() : 0;
        result = 31 * result + (fullreefId != null ? fullreefId.hashCode() : 0);
        result = 31 * result + (reef_lat != null ? reef_lat.hashCode() : 0);
        result = 31 * result + (reef_long != null ? reef_long.hashCode() : 0);
        return result;
    }
}
