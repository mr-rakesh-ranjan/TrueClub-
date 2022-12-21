package com.trueclub.dao;

import com.trueclub.entities.Assignment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentDao extends JpaRepository<Assignment, Long> {

    @Query("select u from Assignment u where u.assignmentId = :e")
    public Assignment findById(@Param("e") long assignmentId);
}
