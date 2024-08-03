package com.eventmanagement.system.service;

import com.eventmanagement.system.entity.Organizer;
import com.eventmanagement.system.repository.OrganizerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    public Organizer updateOrganizer(Long id, Organizer organizer) {
        if (organizerRepository.existsById(id)) {
            organizer.setId(id);
            return organizerRepository.save(organizer);
        }
        return null;
    }

    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }
}
