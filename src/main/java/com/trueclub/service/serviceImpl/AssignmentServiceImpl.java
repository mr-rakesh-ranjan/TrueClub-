package com.trueclub.service.serviceImpl;

import com.trueclub.dao.AssignmentDao;
import com.trueclub.entities.Assignment;
import com.trueclub.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentDao assignmentDao;


    @Override
    public Assignment createAssignment(Assignment assignment) {
        this.assignmentDao.save(assignment);
        System.out.println(assignment);
        return assignment;
    }

    @Override
    public Assignment getAssignmentById(long id) {
        Assignment assignment = this.assignmentDao.findById(id);
        return assignment;
    }

    @Override
    public Assignment updateAssignment(Assignment assignment) {
        return this.assignmentDao.save(assignment);
    }

    @Override
    public void deleteAssignment(long id) {
        Assignment assignment = this.assignmentDao.findById(id);
        this.assignmentDao.delete(assignment);
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return this.assignmentDao.findAll();
    }
}
