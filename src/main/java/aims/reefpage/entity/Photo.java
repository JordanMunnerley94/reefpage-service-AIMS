package aims.reefpage.entity;

import javax.persistence.*;

/**
 * Created by gcoleman on 14/10/2016.
 */
@Entity
@Table(name = "PHOTO", schema = "REEFPAGE", catalog = "")

public class Photo {
    private String id;

    @Id
    @Column(name = "ID", nullable = true, length = 11)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String fullreefId;

    @Basic
    @Column(name = "FULLREEF_ID", nullable = false, length = 10)
    public String getFullreefId() {
        return fullreefId;
    }

    public void setFullreefId(String fullreefId) {
        this.fullreefId = fullreefId;
    }

    private String reefZoneCode;


    @Basic
    @Column(name = "REEF_ZONE_CODE", nullable = true, length = 1)
    public String getReefZoneCode() {
        return reefZoneCode;
    }

    public void setReefZoneCode(String reefZoneCode) {
        this.reefZoneCode = reefZoneCode;
    }    private String photo;

    @Basic
    @Column(name = "PHOTO", nullable = true, length = 500)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo1 = (Photo) o;

        if (id != null ? !id.equals(photo1.id) : photo1.id != null) return false;
        if (fullreefId != null ? !fullreefId.equals(photo1.fullreefId) : photo1.fullreefId != null) return false;
        if (reefZoneCode != null ? !reefZoneCode.equals(photo1.reefZoneCode) : photo1.reefZoneCode != null)
            return false;
        if (photo != null ? !photo.equals(photo1.photo) : photo1.photo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullreefId != null ? fullreefId.hashCode() : 0);
        result = 31 * result + (reefZoneCode != null ? reefZoneCode.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }
}
