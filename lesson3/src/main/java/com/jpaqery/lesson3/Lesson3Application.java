package com.jpaqery.lesson3;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.context.annotation.Bean;

import com.jpaqery.lesson3.dao.JobListingDAO;
import com.jpaqery.lesson3.entity.JobListing;

@SpringBootApplication
public class Lesson3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson3Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(JobListingDAO jobListingDAO) {
		return runner -> {

			// void AddJobListing(jobListingDAO);

			// getJobListById(jobListingDAO);

			// JPQLQueryToGetJobListings(jobListingDAO);

			// updateJoblisting(jobListingDAO);
			updateUsingQuery(jobListingDAO);
		};
	}

	private void updateUsingQuery(JobListingDAO jobListingDAO) {

		int jobListingId = 2;
		jobListingDAO.updateViaJPQLQuery(jobListingId);
	}

	private void AddJobListing(JobListingDAO jobListingDAO) {
		JobListing listing = new JobListing();
		listing.setCompany("Tech Solutions");
		listing.setTitle("Software Engineer");
		listing.setCategory_id("IT");
		listing.setLocation("Remote");
		listing.setShort_description("Looking for a skilled software engineer.");
		listing.setLong_description("We are seeking a software engineer with experience in Java and Spring Boot.");
		listing.setJob_listing_type("Full-time");
		listing.setInstructions("Please send your resume to");
		listing.setStatus("Open");
		listing.setCreated_at(LocalDateTime.now());
		listing.setUpdated_at(LocalDateTime.now());
		listing.setExpires_at(LocalDateTime.now().plusDays(30));
		jobListingDAO.save(listing);
		System.out.println("Lesson 3 Application has started successfully!");
	}

	private void getJobListById(JobListingDAO jobListingDAO) {
		JobListing jlist = new JobListing();
		jlist.setId(3);
		int jid = jlist.getId();
		System.out.println(jid);
		JobListing lt = jobListingDAO.findById(jid);
		System.out.println(lt);
	}

	private void JPQLQueryToGetJobListings(JobListingDAO jobListingDAO) {
		List<JobListing> jobl = jobListingDAO.findAll();
		for (JobListing j : jobl) {
			System.out.println(j + "\n");
		}
	};

	private void updateJoblisting(JobListingDAO jobListingDAO) {
		int joblistingId = 3;
		JobListing listing = jobListingDAO.findById(joblistingId);
		listing.setCompany("Random Company");
		jobListingDAO.update(listing);
	}

	// private List<JobListing> findById(JobListingDAO jobListingDAO) {
	// JobListing listing = new JobListing();
	// listing.setId(1); // Assuming the ID is "1" for demonstration
	// listing = jobListingDAO.findById(listing.getId());
	// }

}
