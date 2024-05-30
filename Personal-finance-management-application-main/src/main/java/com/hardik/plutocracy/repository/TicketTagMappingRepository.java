package com.hardik.plutocracy.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.hardik.plutocracy.entity.TicketTagMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketTagMappingRepository extends JpaRepository<TicketTagMapping, Integer> {

	Optional<TicketTagMapping> findByTagIdAndTicketId(Integer tagId, UUID ticketId);

	List<TicketTagMapping> findByTicketId(UUID ticketId);

}
