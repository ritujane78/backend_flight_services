package com.jane.flightServices.dto;

public class CreateReservationRequest {
  private int flightId;
  private String passengerFirstName;
  private String passengerLastName;
  private String passengerEmail;
  private String passengerPhone;
  private String cardNumber;
  private String cardExpiration;
  private String cardCVV;

  public CreateReservationRequest() {
  }

  public CreateReservationRequest(int flightId, String passengerFirstName, String passengerLastName, String passengerEmail, String passengerPhone, String cardNumber, String cardExpiration, String cardCVV) {
    this.flightId = flightId;
    this.passengerFirstName = passengerFirstName;
    this.passengerLastName = passengerLastName;
    this.passengerEmail = passengerEmail;
    this.passengerPhone = passengerPhone;
    this.cardNumber = cardNumber;
    this.cardExpiration = cardExpiration;
    this.cardCVV = cardCVV;
  }

  public int getFlightId() {
    return flightId;
  }

  public void setFlightId(int flightId) {
    this.flightId = flightId;
  }

  public String getPassengerFirstName() {
    return passengerFirstName;
  }

  public void setPassengerFirstName(String passengerFirstName) {
    this.passengerFirstName = passengerFirstName;
  }

  public String getPassengerLastName() {
    return passengerLastName;
  }

  public void setPassengerLastName(String passengerLastName) {
    this.passengerLastName = passengerLastName;
  }

  public String getPassengerEmail() {
    return passengerEmail;
  }

  public void setPassengerEmail(String passengerEmail) {
    this.passengerEmail = passengerEmail;
  }

  public String getPassengerPhone() {
    return passengerPhone;
  }

  public void setPassengerPhone(String passengerPhone) {
    this.passengerPhone = passengerPhone;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardExpiration() {
    return cardExpiration;
  }

  public void setCardExpiration(String cardExpiration) {
    this.cardExpiration = cardExpiration;
  }

  public String getCardCVV() {
    return cardCVV;
  }

  public void setCardCVV(String cardCVV) {
    this.cardCVV = cardCVV;
  }
}
