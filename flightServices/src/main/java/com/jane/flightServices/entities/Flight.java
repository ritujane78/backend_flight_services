package com.jane.flightServices.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Flight extends AbstractEntity{

  private String flightNumber;
  private String departureCity;
  private String arrivalCity;
  private String operatingAirline;
  private Date dateOfDeparture;
  private Timestamp estimatedDepartureTime;

  public Flight() {
  }

  public Flight(String flightNumber, String departureCity, String arrivalCity, String operatingAirline,
      Date dateOfDeparture, Timestamp estimatedDepartureTime) {
    this.flightNumber = flightNumber;
    this.departureCity = departureCity;
    this.arrivalCity = arrivalCity;
    this.operatingAirline = operatingAirline;
    this.dateOfDeparture = dateOfDeparture;
    this.estimatedDepartureTime = estimatedDepartureTime;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getDepartureCity() {
    return departureCity;
  }

  public void setDepartureCity(String departureCity) {
    this.departureCity = departureCity;
  }

  public String getArrivalCity() {
    return arrivalCity;
  }

  public void setArrivalCity(String arrivalCity) {
    this.arrivalCity = arrivalCity;
  }

  public String getOperatingAirline() {
    return operatingAirline;
  }

  public void setOperatingAirline(String operatingAirline) {
    this.operatingAirline = operatingAirline;
  }

  public Date getDateOfDeparture() {
    return dateOfDeparture;
  }

  public void setDateOfDeparture(Date dateOfDeparture) {
    this.dateOfDeparture = dateOfDeparture;
  }

  public Timestamp getEstimatedDepartureTime() {
    return estimatedDepartureTime;
  }

  public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
  }
}
