package com.jpaqery.lesson3.dao;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpaqery.lesson3.entity.JobListing;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

    @Override
    public List<JobListing> findAll() {

        TypedQuery<JobListing> theQuery = entityManager.createQuery("FROM JobListing", JobListing.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(JobListing jobListing) {
        entityManager.merge(jobListing);
    }

    @Override
    @Transactional
    public void updateViaJPQLQuery(int id) {
        entityManager.createQuery("UPDATE JobListing jl set jl.title='Some Title' WHERE jl.id=:id")
                .setParameter("id", id).executeUpdate();
    }

}
