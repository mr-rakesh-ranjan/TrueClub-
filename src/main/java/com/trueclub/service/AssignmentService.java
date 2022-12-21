package com.trueclub.service;

import com.trueclub.entities.Assignment;

import java.util.List;

public interface AssignmentService {
    //creating an assignment
    public Assignment createAssignment(Assignment assignment);

    //get assignment by id
    public Assignment getAssignmentById(long id);

    //update assignment
    public Assignment updateAssignment(Assignment assignment);

    //delete assignment
    public void deleteAssignment(long id);

    //get all assignment
    public List<Assignment> getAllAssignments();

}
