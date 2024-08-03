package com.eventmanagement.system.repository;

import com.eventmanagement.system.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
