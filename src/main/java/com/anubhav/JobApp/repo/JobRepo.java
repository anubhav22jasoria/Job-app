package com.anubhav.JobApp.repo;

import com.anubhav.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

}



//
//List<JobPost> jobs = new ArrayList<>();
//
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost jobPost){
//    jobs.add(jobPost);
////        System.out.println(jobs);
//}