package com.hardik.plutocracy.repository;

import java.util.Optional;
import java.util.UUID;

import com.hardik.plutocracy.entity.TotalBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalBalanceRepository extends JpaRepository<TotalBalance, UUID> {

	Optional<TotalBalance> findByUserId(UUID userId);

}
