package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "userAddress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Address_id")
    private int addressId;

    @Column(name = "Landmark")
    private String landmark;

    @Column(name = "Street")
    private String street;

    @Column(name = "City", length = 100)
    private String city;

    @Column(name = "Country", length = 100)
    private String country;

    @Lob
    @Column(name = "Image", columnDefinition = "LONGBLOB")
    private byte[] image;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
