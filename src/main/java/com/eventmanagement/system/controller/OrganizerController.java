package com.eventmanagement.system.controller;

import com.eventmanagement.system.entity.Organizer;
import com.eventmanagement.system.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/organizers")
    public class OrganizerController {

        @Autowired
        private OrganizerService organizerService;

        @PostMapping
        public Organizer createOrganizer(@RequestBody Organizer organizer) {
            return organizerService.createOrganizer(organizer);
        }

        @GetMapping("/{id}")
        public Organizer getOrganizerById(@PathVariable Long id) {
            return organizerService.getOrganizerById(id);
        }

        @PutMapping("/{id}")
        public Organizer updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizer) {
            return organizerService.updateOrganizer(id, organizer);
        }

        @DeleteMapping("/{id}")
        public void deleteOrganizer(@PathVariable Long id) {
            organizerService.deleteOrganizer(id);
        }

    }
