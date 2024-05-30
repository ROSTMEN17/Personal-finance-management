package com.hardik.plutocracy.repository;

import java.util.List;
import java.util.UUID;

import com.hardik.plutocracy.entity.SpendingThresholdRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingThresholdRecordRepository extends JpaRepository<SpendingThresholdRecord, Integer> {

	List<SpendingThresholdRecord> findByUserId(UUID userId);

}
