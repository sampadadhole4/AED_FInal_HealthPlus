/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Org;

import Healthplus.Account.AccountDirectory;
import Healthplus.Agency.AgencyDirectory;
import Healthplus.SeniorMedical.SeniorMedicalDirectory;
import Healthplus.Worker.WorkerDirectory;
import Healthplus.SeniorCare.SeniorCareDirectory;
import Healthplus.Project.ProjectDirectory;
import Healthplus.Role.Roles;
import Healthplus.Job.JobDirectory;
import Healthplus.UserAccount.UserAccountDirectory;
import Healthplus.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Org {
    
   private String name;
    private WorkQueue workQueue;
    private WorkerDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ProjectDirectory projectDirectory;
    private AgencyDirectory agencyDirectory;
    private AccountDirectory accountDirectory;
    private JobDirectory jobDirectory;
    private SeniorMedicalDirectory seniorMedicalDirectory;
    private SeniorCareDirectory seniorCareDirectory;
    private int organizationID;
    private static int counter = 1;
    
    
    public enum OrgType{
        Admin("Admin Organization"),
        Manager("Manager Organization"), 
        Campaign("Campaign Organization"), 
        Welfare("Welfare Organization"),
        SeniorCare("Senior Care Organization"),
        Medical("Medical Organization");
        //EmergencyServices("Emergency Services");
        
        private String value;
        private OrgType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Org(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new WorkerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        projectDirectory = new ProjectDirectory();
        jobDirectory = new JobDirectory();
        agencyDirectory = new AgencyDirectory();
        accountDirectory = new AccountDirectory();
        seniorMedicalDirectory = new SeniorMedicalDirectory();
        seniorCareDirectory = new SeniorCareDirectory();
        organizationID = counter;
        ++counter;
    }
    public abstract ArrayList<Roles> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkerDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(WorkerDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

//    public ApplicantDirectory getApplicantDirectory() {
//        return applicantDirectory;
//    }
//
//    public void setApplicantDirectory (ApplicantDirectory applicantDirectory) {
//        this.applicantDirectory = applicantDirectory;
//    }

    public ProjectDirectory getProjectDirectory() {
        return projectDirectory;
    }

    public void setProjectDirectory(ProjectDirectory projectDirectory) {
        this.projectDirectory = projectDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public AgencyDirectory getAgencyDirectory() {
        return agencyDirectory;
    }

    public void setAgencyDirectory(AgencyDirectory agencyDirectory) {
        this.agencyDirectory = agencyDirectory;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(AccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }
    public JobDirectory getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    }

    public SeniorCareDirectory getSeniorCareDirectory() {
        return seniorCareDirectory;
    }

    public void setSeniorCareDirectory(SeniorCareDirectory seniorCareDirectory) {
        this.seniorCareDirectory = seniorCareDirectory;
    }

    public SeniorMedicalDirectory getSeniorMedicalDirectory() {
        return seniorMedicalDirectory;
    }

    public void setSeniorMedicalDirectory(SeniorMedicalDirectory seniorMedicalDirectory) {
        this.seniorMedicalDirectory = seniorMedicalDirectory;
    }
 
    @Override
    public String toString() {
        return name;
    }
    
}
