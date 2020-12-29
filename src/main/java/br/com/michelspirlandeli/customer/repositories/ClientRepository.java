package br.com.michelspirlandeli.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.michelspirlandeli.customer.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
