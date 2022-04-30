/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Applicant;

import java.util.ArrayList;

public class CandidateDirectory {
    private ArrayList <Candidate> applicantList;
    
    public CandidateDirectory(){
        this.applicantList = new ArrayList<>();
    }

    public ArrayList<Candidate> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<Candidate> applicantList) {
        this.applicantList = applicantList;
    }
    public Candidate createApplicant(String name){
        Candidate applicant = new Candidate();
        applicant.setName(name);
        applicantList.add(applicant);
        return applicant;
    }
    
    public void removeApplicant (Candidate applicant){
        applicantList.remove(applicant);
    }
}
