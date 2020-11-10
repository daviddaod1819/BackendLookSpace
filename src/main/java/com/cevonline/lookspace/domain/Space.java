package com.cevonline.lookspace.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;

/**
 * A Space.
 */
@Entity
@Table(name = "space")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@org.springframework.data.elasticsearch.annotations.Document(indexName = "space")
public class Space implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rooms")
    private Integer rooms;

    @Column(name = "meters")
    private Integer meters;

    @Column(name = "price")
    private Integer price;

    @Column(name = "details")
    private String details;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRooms() {
        return rooms;
    }

    public Space rooms(Integer rooms) {
        this.rooms = rooms;
        return this;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getMeters() {
        return meters;
    }

    public Space meters(Integer meters) {
        this.meters = meters;
        return this;
    }

    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    public Integer getPrice() {
        return price;
    }

    public Space price(Integer price) {
        this.price = price;
        return this;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public Space details(String details) {
        this.details = details;
        return this;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Space)) {
            return false;
        }
        return id != null && id.equals(((Space) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Space{" +
            "id=" + getId() +
            ", rooms=" + getRooms() +
            ", meters=" + getMeters() +
            ", price=" + getPrice() +
            ", details='" + getDetails() + "'" +
            "}";
    }
}
