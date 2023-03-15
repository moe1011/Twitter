package org.ac.cst8277.abdulla.mohammed.ums.repositories;

import org.ac.cst8277.abdulla.mohammed.ums.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MessageRepository extends JpaRepository<Message, UUID> {

    Optional<Message> findAllByUser_UserId(UUID UserId);

}