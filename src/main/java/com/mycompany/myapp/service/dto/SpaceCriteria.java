package com.mycompany.myapp.service.dto;

import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import java.io.Serializable;
import java.util.Objects;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.Space} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.SpaceResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /spaces?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class SpaceCriteria implements Serializable, Criteria {
    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter title;

    private IntegerFilter rooms;

    private IntegerFilter meters;

    private DoubleFilter price;

    private StringFilter details;

    private StringFilter place;

    private IntegerFilter bathrooms;

    private StringFilter photos;

    public SpaceCriteria() {}

    public SpaceCriteria(SpaceCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.title = other.title == null ? null : other.title.copy();
        this.rooms = other.rooms == null ? null : other.rooms.copy();
        this.meters = other.meters == null ? null : other.meters.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.details = other.details == null ? null : other.details.copy();
        this.place = other.place == null ? null : other.place.copy();
        this.bathrooms = other.bathrooms == null ? null : other.bathrooms.copy();
        this.photos = other.photos == null ? null : other.photos.copy();
    }

    @Override
    public SpaceCriteria copy() {
        return new SpaceCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public IntegerFilter getRooms() {
        return rooms;
    }

    public void setRooms(IntegerFilter rooms) {
        this.rooms = rooms;
    }

    public IntegerFilter getMeters() {
        return meters;
    }

    public void setMeters(IntegerFilter meters) {
        this.meters = meters;
    }

    public DoubleFilter getPrice() {
        return price;
    }

    public void setPrice(DoubleFilter price) {
        this.price = price;
    }

    public StringFilter getDetails() {
        return details;
    }

    public void setDetails(StringFilter details) {
        this.details = details;
    }

    public StringFilter getPlace() {
        return place;
    }

    public void setPlace(StringFilter place) {
        this.place = place;
    }

    public IntegerFilter getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(IntegerFilter bathrooms) {
        this.bathrooms = bathrooms;
    }

    public StringFilter getPhotos() {
        return photos;
    }

    public void setPhotos(StringFilter photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final SpaceCriteria that = (SpaceCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(title, that.title) &&
            Objects.equals(rooms, that.rooms) &&
            Objects.equals(meters, that.meters) &&
            Objects.equals(price, that.price) &&
            Objects.equals(details, that.details) &&
            Objects.equals(place, that.place) &&
            Objects.equals(bathrooms, that.bathrooms) &&
            Objects.equals(photos, that.photos)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, rooms, meters, price, details, place, bathrooms, photos);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SpaceCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (title != null ? "title=" + title + ", " : "") +
                (rooms != null ? "rooms=" + rooms + ", " : "") +
                (meters != null ? "meters=" + meters + ", " : "") +
                (price != null ? "price=" + price + ", " : "") +
                (details != null ? "details=" + details + ", " : "") +
                (place != null ? "place=" + place + ", " : "") +
                (bathrooms != null ? "bathrooms=" + bathrooms + ", " : "") +
                (photos != null ? "bathrooms=" + photos + ", " : "") +
            "}";
    }
}
