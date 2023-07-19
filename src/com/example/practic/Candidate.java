package com.example.practic;

import java.util.Set;

public class Candidate {
    int candidateId;
    String candidateName;
    Set<String> skills;
    int candidateYearOFExp;
    int candidateAge;
    String gender;

    public Candidate(int candidateId, String candidateName, Set<String> skills, int candidateYearOFExp, int candidateAge, String gender) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.skills = skills;
        this.candidateYearOFExp = candidateYearOFExp;
        this.candidateAge = candidateAge;
        this.gender = gender;
    }

    public Candidate() {
    }

    @Override
    public String toString() {
        return "Candidate" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", skills=" + skills +
                ", candidateYearOFExp=" + candidateYearOFExp +
                ", candidateAge=" + candidateAge +
                ", gender='" + gender + '\''
                ;
    }
}
