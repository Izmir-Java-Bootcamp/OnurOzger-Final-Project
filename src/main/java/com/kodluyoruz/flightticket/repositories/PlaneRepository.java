package com.kodluyoruz.flightticket.repositories;

import com.kodluyoruz.flightticket.models.entity.aboutPlane.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane,Integer> {



}
