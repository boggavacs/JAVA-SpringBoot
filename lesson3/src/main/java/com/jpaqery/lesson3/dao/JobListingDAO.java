package com.jpaqery.lesson3.dao;

import com.jpaqery.lesson3.entity.JobListing;

public interface JobListingDAO {

    void save(JobListing jobListing);

    JobListing findById(int id);

}
