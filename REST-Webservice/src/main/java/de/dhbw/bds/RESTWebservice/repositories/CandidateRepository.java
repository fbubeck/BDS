package de.dhbw.bds.RESTWebservice.repositories;

import de.dhbw.bds.RESTWebservice.model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<Candidate, String> {}
