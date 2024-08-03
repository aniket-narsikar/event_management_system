package com.eventmanagement.system.repository;

import com.eventmanagement.system.entity.Event;
import com.eventmanagement.system.entity.Organizer;
import com.eventmanagement.system.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByVenue_Id(Long venueId);
    List<Event> findByOrganizer_Id(Long organizerId);
}

