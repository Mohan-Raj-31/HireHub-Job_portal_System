package com.example.HireHub.repository;

import com.example.HireHub.model.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Integer> {

    List<Application> findByJob(Job job);
    Optional<Application> findById(int applicationId);
    List<Application> findByJob_RecruiterId(int recruiterProfileId);

    Optional<Application> findByJobAndJobSeeker(Job job, JobSeekerProfile jobSeeker);

    List<Application> findByJobSeeker(JobSeekerProfile jobSeeker);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM application WHERE job_id = :jobId", nativeQuery = true)
    void deleteByJobId(@Param("jobId") int jobId);
}
