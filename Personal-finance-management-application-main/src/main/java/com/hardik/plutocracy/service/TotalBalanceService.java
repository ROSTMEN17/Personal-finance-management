package com.hardik.plutocracy.service;

import com.hardik.plutocracy.repository.TotalBalanceRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TotalBalanceService {

	private final TotalBalanceRepository totalBalanceRepository;

}
