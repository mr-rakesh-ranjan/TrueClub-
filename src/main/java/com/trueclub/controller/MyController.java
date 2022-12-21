package com.trueclub.controller;

import com.trueclub.entities.Assignment;
import com.trueclub.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/home")
    public static String home(){
        return "this is home start up";
    }

    @PostMapping("/add-assignment")
    public Assignment addAssignment(@RequestBody Assignment assignment){
        return this.assignmentService.createAssignment(assignment);
    }

    @GetMapping("/assignment/{id}")
    public Assignment getAssignment(@PathVariable ("id") String id){
        return this.assignmentService.getAssignmentById(Long.parseLong(id));
    }

    @PostMapping("/update-assignment")
    public Assignment updateAssignment(@RequestBody Assignment assignment){
        return this.assignmentService.updateAssignment(assignment);
    }

    @DeleteMapping("/delete-assignment/{id}")
    public ResponseEntity<HttpStatus> deleteAssignment(@PathVariable("id") String id){
        try{
            this.assignmentService.deleteAssignment(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/assignments")
    public List<Assignment> getAllAssignment(){
        return this.assignmentService.getAllAssignments();
    }
}
