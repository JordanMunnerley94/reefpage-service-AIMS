package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "FISH_BY_DECADE", schema = "REEFPAGE", catalog = "")
public class FishByDecade {
    private String decade;
    private String fullreefId;
    private String reefName;
    private String aSector;
    private String shelf;
    private Long minSpecies;
    private Long maxSpecies;
    private Long avgSpecies;
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
    @Column(name = "MIN_SPECIES")
    public Long getMinSpecies() {
        return minSpecies;
    }

    public void setMinSpecies(Long minSpecies) {
        this.minSpecies = minSpecies;
    }

    @Basic
    @Column(name = "MAX_SPECIES")
    public Long getMaxSpecies() {
        return maxSpecies;
    }

    public void setMaxSpecies(Long maxSpecies) {
        this.maxSpecies = maxSpecies;
    }

    @Basic
    @Column(name = "AVG_SPECIES")
    public Long getAvgSpecies() {
        return avgSpecies;
    }

    public void setAvgSpecies(Long avgSpecies) {
        this.avgSpecies = avgSpecies;
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

        FishByDecade that = (FishByDecade) o;

        if (decade != null ? !decade.equals(that.decade) : that.decade != null) return false;
        if (fullreefId != null ? !fullreefId.equals(that.fullreefId) : that.fullreefId != null) return false;
        if (reefName != null ? !reefName.equals(that.reefName) : that.reefName != null) return false;
        if (aSector != null ? !aSector.equals(that.aSector) : that.aSector != null) return false;
        if (shelf != null ? !shelf.equals(that.shelf) : that.shelf != null) return false;
        if (minSpecies != null ? !minSpecies.equals(that.minSpecies) : that.minSpecies != null) return false;
        if (maxSpecies != null ? !maxSpecies.equals(that.maxSpecies) : that.maxSpecies != null) return false;
        if (avgSpecies != null ? !avgSpecies.equals(that.avgSpecies) : that.avgSpecies != null) return false;
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
        result = 31 * result + (minSpecies != null ? minSpecies.hashCode() : 0);
        result = 31 * result + (maxSpecies != null ? maxSpecies.hashCode() : 0);
        result = 31 * result + (avgSpecies != null ? avgSpecies.hashCode() : 0);
        result = 31 * result + (yearsSurveyed != null ? yearsSurveyed.hashCode() : 0);
        return result;
    }
}
