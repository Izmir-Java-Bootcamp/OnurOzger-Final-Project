package com.kodluyoruz.flightticket.repositories;

import com.kodluyoruz.flightticket.models.entity.aboutAirport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport,Integer> {


}
