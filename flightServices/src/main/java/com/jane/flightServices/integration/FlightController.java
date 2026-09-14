package com.jane.flightServices.integration;

import com.jane.flightServices.dto.CreateReservationRequest;
import com.jane.flightServices.entities.Flight;
import com.jane.flightServices.entities.Passenger;
import com.jane.flightServices.entities.Reservation;
import com.jane.flightServices.repository.FlightRepository;
import com.jane.flightServices.repository.PassengerRepository;
import com.jane.flightServices.repository.ReservationRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api)")
public class FlightController {

  FlightRepository flightRepository;
  PassengerRepository passengerRepository;
  ReservationRepository ReservationRepository;

  public FlightController(FlightRepository flightRepository, PassengerRepository passengerRepository, ReservationRepository reservationRepository) {
    this.flightRepository = flightRepository;
    this.passengerRepository = passengerRepository;
    this.ReservationRepository = reservationRepository;
  }

  @GetMapping("/flights")
  public List<Flight> getFlights() {
    return flightRepository.findAll();
  }

  @PostMapping("/flights")
  @Transactional
  public Reservation createFlight(CreateReservationRequest request) {
    Flight flight = flightRepository.findById(request.getFlightId()).orElseThrow(() -> new RuntimeException("Flight not found"));
    Passenger passenger = new Passenger();
    passenger.setFirstName(request.getPassengerFirstName());
    passenger.setLastName(request.getPassengerLastName());
    passenger.setEmail(request.getPassengerEmail());
    passenger.setPhone(request.getPassengerPhone());
    Passenger savedPassenger = passengerRepository.save(passenger);

    Reservation reservation = new Reservation();
    reservation.setFlight(flight);
    reservation.setPassenger(savedPassenger);
    reservation.setCheckedIn(false);
    Reservation savedReservation = ReservationRepository.save(reservation);


    return savedReservation;
  }

  @GetMapping("/reservations/{id}")
  public Reservation getReservation(@PathVariable Integer id) {
    return ReservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Reservation not found"));
  }

  @PutMapping("/reservations/{id}")
  public Reservation updateReservation(@PathVariable Integer id, @RequestBody Reservation reservation) {
    Reservation existingReservation = ReservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Reservation not found"));
    existingReservation.setCheckedIn(reservation.isCheckedIn());
    existingReservation.setNumberOfBags(reservation.getNumberOfBags());
    return ReservationRepository.save(existingReservation);
  }
}
