package com.hardik.plutocracy.service;

import com.hardik.plutocracy.repository.NoteTagMappingRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NoteTagMappingService {

	private final NoteTagMappingRepository noteTagMappingRepository;

}
