package com.caiohenrique.demo_park_api.repositories;

import com.caiohenrique.demo_park_api.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
