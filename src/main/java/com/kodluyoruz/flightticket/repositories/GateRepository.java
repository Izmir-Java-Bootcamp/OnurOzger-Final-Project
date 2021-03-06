package com.kodluyoruz.flightticket.repositories;

import com.kodluyoruz.flightticket.models.entity.aboutAirport.Gate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GateRepository extends JpaRepository<Gate,Integer> {
    Optional<Gate> findByIdAndAirportId(Integer gateId,Integer AirportId);


}
