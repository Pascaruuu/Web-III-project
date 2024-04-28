package com.example.WebFinalProject.repo;

import com.example.WebFinalProject.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContactRepo extends JpaRepository<Contact, Long> {
}
