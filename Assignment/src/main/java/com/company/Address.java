package com.company;

public class Address {

  String street;

  String city;

  String state;

  long zip;

  String country;

  @Override
  public String toString() {

    return "Address [street=" + this.street + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip
        + ", country=" + this.country + "]";
  }

  public String getStreet() {

    return this.street;
  }

  public void setStreet(String street) {

    this.street = street;
  }

  public String getCity() {

    return this.city;
  }

  public void setCity(String city) {

    this.city = city;
  }

  public String getState() {

    return this.state;
  }

  public void setState(String state) {

    this.state = state;
  }

  public long getZip() {

    return this.zip;
  }

  public void setZip(long zip) {

    this.zip = zip;
  }

  public String getCountry() {

    return this.country;
  }

  public void setCountry(String country) {

    this.country = country;
  }

}
