package com.jpaqery.lesson3.dao;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpaqery.lesson3.entity.JobListing;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class JobListingDAOImpl implements JobListingDAO {

    @Autowired
    public EntityManager entityManager;

    @Override
    @Transactional
    public void save(JobListing jobListing) {
        entityManager.persist(jobListing);
    }

    @Override
    public JobListing findById(int id) {
        return entityManager.find(JobListing.class, id);
    }

}
