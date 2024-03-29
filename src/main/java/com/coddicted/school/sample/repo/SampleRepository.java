package com.coddicted.school.sample.repo;

import org.springframework.data.repository.CrudRepository;

import com.coddicted.school.sample.model.Sample;

// This will be AUTO IMPLEMENTED by Spring into a Bean called sampleRepository
// CRUD refers Create, Read, Update, Delete

public interface SampleRepository extends CrudRepository<Sample, Integer> {}
