package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.Space} entity.
 */
public class SpaceDTO implements Serializable {
    private Long id;

    @Size(min = 1, max = 50)
    private String title;

    @Min(value = 0)
    private Integer rooms;

    @Min(value = 0)
    private Integer meters;

    @DecimalMin(value = "0")
    private Double price;

    private String details;

    @Size(min = 3)
    private String place;

    @Min(value = 0)
    private Integer bathrooms;

    private String photos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getMeters() {
        return meters;
    }

    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpaceDTO)) {
            return false;
        }

        return id != null && id.equals(((SpaceDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SpaceDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", rooms=" + getRooms() +
            ", meters=" + getMeters() +
            ", price=" + getPrice() +
            ", details='" + getDetails() + "'" +
            ", place='" + getPlace() + "'" +
            ", bathrooms=" + getBathrooms() +
            ", photos='" + getPhotos() + "'" +
            "}";
    }
}
