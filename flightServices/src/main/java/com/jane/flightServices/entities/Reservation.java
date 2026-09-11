package com.jane.flightServices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {


  private boolean checkedIn;
  private int numberOfBags;
  @OneToOne
  private Flight flight;

  @OneToOne
  private Passenger passenger;

  public Reservation() {
  }

  public Reservation( boolean checkedIn, int numberOfBags) {
    this.checkedIn = checkedIn;
    this.numberOfBags = numberOfBags;
  }

  public boolean isCheckedIn() {
    return checkedIn;
  }

  public void setCheckedIn(boolean checkedIn) {
    this.checkedIn = checkedIn;
  }

  public int getNumberOfBags() {
    return numberOfBags;
  }

  public void setNumberOfBags(int numberOfBags) {
    this.numberOfBags = numberOfBags;
  }
}
