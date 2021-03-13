package de.dhbw.bds.RESTWebservice.controller;

import de.dhbw.bds.RESTWebservice.model.Candidate;
import de.dhbw.bds.RESTWebservice.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Candidate add(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }
}
