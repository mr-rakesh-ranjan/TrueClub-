package com.trueclub.entities;

import javax.persistence.*;

import java.util.Date;
import java.util.TimeZone;

@Entity
@Table(name = "assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long assignmentId;
    @Column(name = "name")
    private String assignmentName;
    @Column(name = "address")
    private String assignmentAddress;
    @Column(name = "pincode")
    private String assignmentPincode;
    @Column(name = "state")
    private String assignmentState;
    @Column(name = "row_creation_timestamp")
    private Date assignmentCreationTime;

    public Assignment() {
        super();
    }

    public Assignment(long assignmentId, String assignmentName, String assignmentAddress, String assignmentPincode, String assignmentState, Date assignmentCreationTime) {
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
        this.assignmentAddress = assignmentAddress;
        this.assignmentPincode = assignmentPincode;
        this.assignmentState = assignmentState;
        this.assignmentCreationTime = assignmentCreationTime;
    }

    public long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getAssignmentAddress() {
        return assignmentAddress;
    }

    public void setAssignmentAddress(String assignmentAddress) {
        this.assignmentAddress = assignmentAddress;
    }

    public String getAssignmentPincode() {
        return assignmentPincode;
    }

    public void setAssignmentPincode(String assignmentPincode) {
        this.assignmentPincode = assignmentPincode;
    }

    public String getAssignmentState() {
        return assignmentState;
    }

    public void setAssignmentState(String assignmentState) {
        this.assignmentState = assignmentState;
    }

    public Date getAssignmentCreationTime() {
        return assignmentCreationTime;
    }

    public void setAssignmentCreationTime(Date assignmentCreationTime) {
        this.assignmentCreationTime = assignmentCreationTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Assignment{");
        sb.append("assignmentId=").append(assignmentId);
        sb.append(", assignmentName='").append(assignmentName).append('\'');
        sb.append(", assignmentAddress='").append(assignmentAddress).append('\'');
        sb.append(", assignmentPincode='").append(assignmentPincode).append('\'');
        sb.append(", assignmentState='").append(assignmentState).append('\'');
        sb.append(", assignmentCreationTime=").append(assignmentCreationTime);
        sb.append('}');
        return sb.toString();
    }
}
