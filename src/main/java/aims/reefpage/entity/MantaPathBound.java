package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 3/11/2016.
 */
@Entity
@Table(name = "MANTA_PATH_BOUNDS", schema = "REEFPAGE", catalog = "")
public class MantaPathBound {
    private String sampleId;
    private String fullreefId;
    private String gbrmpaReefId;
    private Double north;
    private Double south;
    private Double east;
    private Double west;

//    gbrmpa_reef_id
    @Basic
    @Column(name = "SAMPLE_ID", nullable = true, length = 10)
    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
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
    @Column(name = "GBRMPA_REEF_ID", nullable = true, length = 10)
    public String getGbrmpaReefId() {
        return gbrmpaReefId;
    }

    public void setGbrmpaReefId(String gbrmpaReefId) {
        this.gbrmpaReefId = gbrmpaReefId;
    }

    @Basic
    @Column(name = "NORTH", nullable = true, precision = 0)
    public Double getNorth() {
        return north;
    }

    public void setNorth(Double north) {
        this.north = north;
    }

    @Basic
    @Column(name = "SOUTH", nullable = true, precision = 0)
    public Double getSouth() {
        return south;
    }

    public void setSouth(Double south) {
        this.south = south;
    }

    @Basic
    @Column(name = "EAST", nullable = true, precision = 0)
    public Double getEast() {
        return east;
    }

    public void setEast(Double east) {
        this.east = east;
    }

    @Basic
    @Column(name = "WEST", nullable = true, precision = 0)
    public Double getWest() {
        return west;
    }

    public void setWest(Double west) {
        this.west = west;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MantaPathBound that = (MantaPathBound) o;

        if (sampleId != null ? !sampleId.equals(that.sampleId) : that.sampleId != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (north != null ? !north.equals(that.north) : that.north != null) return false;
        if (south != null ? !south.equals(that.south) : that.south != null) return false;
        if (east != null ? !east.equals(that.east) : that.east != null) return false;
        if (west != null ? !west.equals(that.west) : that.west != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sampleId != null ? sampleId.hashCode() : 0;
        result = 31 * result + (fullreefId != null ? fullreefId.hashCode() : 0);
        result = 31 * result + (north != null ? north.hashCode() : 0);
        result = 31 * result + (south != null ? south.hashCode() : 0);
        result = 31 * result + (east != null ? east.hashCode() : 0);
        result = 31 * result + (west != null ? west.hashCode() : 0);
        return result;
    }
}
