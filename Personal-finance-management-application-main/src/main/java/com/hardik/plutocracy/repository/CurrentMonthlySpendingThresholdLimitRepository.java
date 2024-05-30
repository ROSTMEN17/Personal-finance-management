package com.hardik.plutocracy.repository;

import java.util.Optional;
import java.util.UUID;

import com.hardik.plutocracy.entity.CurrentMonthlySpendingThresholdLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentMonthlySpendingThresholdLimitRepository
		extends JpaRepository<CurrentMonthlySpendingThresholdLimit, Integer> {

	Optional<CurrentMonthlySpendingThresholdLimit> findByUserId(UUID userId);

}
