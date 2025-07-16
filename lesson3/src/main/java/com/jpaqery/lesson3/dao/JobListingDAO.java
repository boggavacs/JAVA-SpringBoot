package com.jpaqery.lesson3.dao;

import java.util.List;

import com.jpaqery.lesson3.entity.JobListing;

public interface JobListingDAO {

    void save(JobListing jobListing);

    JobListing findById(int id);

    List<JobListing> findAll();

    void update(JobListing jobListing);

    void updateViaJPQLQuery(int id);

}
