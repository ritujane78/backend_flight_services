package com.jane.flightServices.integration;

import com.jane.flightServices.entities.Flight;
import com.jane.flightServices.repository.FlightRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api)")
public class FlightController {

  FlightRepository flightRepository;

  public FlightController(FlightRepository flightRepository) {
    this.flightRepository = flightRepository;
  }

  @GetMapping("/flights")
  public List<Flight> getFlights() {
    return flightRepository.findAll();
  }
}
