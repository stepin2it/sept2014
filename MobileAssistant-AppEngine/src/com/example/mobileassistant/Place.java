package com.example.mobileassistant;


import com.google.appengine.api.datastore.GeoPt;
import com.google.appengine.api.datastore.Key;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Place entity.
 *
*/

@Entity
public class Place {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Key key;

  private String placeId;

  private String name;

  private String address;

  private GeoPt location;

  public Key getKey() {
    return key;
  }

  public String getPlaceId() {
    return placeId;
  }

  public void setplaceID(String placeId) {
    this.placeId = placeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public GeoPt getLocation() {
    return location;
  }

  public void setLocation(GeoPt location) {
    this.location = location;
  }
}

