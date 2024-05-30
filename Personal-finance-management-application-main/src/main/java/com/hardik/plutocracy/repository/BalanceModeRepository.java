package com.hardik.plutocracy.repository;

import java.util.UUID;

import com.hardik.plutocracy.entity.BalanceMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceModeRepository extends JpaRepository<BalanceMode, UUID> {

}
