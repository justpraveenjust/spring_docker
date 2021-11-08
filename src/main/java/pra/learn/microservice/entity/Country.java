package pra.learn.microservice.entity;

import org.springframework.data.annotation.Id;

public class Country {
    @Id
    public String countryId;
    public String countryName;
    public long geoLocation;

    public Country() {
    }

    public Country(String countryName, long geoLocation) {
        this.countryName = countryName;
        this.geoLocation = geoLocation;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(long geoLocation) {
        this.geoLocation = geoLocation;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", geoLocation=" + geoLocation +
                '}';
    }
}
