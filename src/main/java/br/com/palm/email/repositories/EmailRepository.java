package br.com.palm.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.palm.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}