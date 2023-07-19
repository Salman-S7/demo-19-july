package com.example.practic;

import java.util.*;

public class CandidateService {
    Map<Integer,Candidate> candidates = new HashMap();
    public void addCandidate(Map<Integer,Candidate> candidate){
        candidates.putAll(candidate);
    }

    public Map<Integer,Candidate> viewAllCandidate(){
        for(Map.Entry<Integer,Candidate> entry : candidates.entrySet()){
            int id = entry.getKey();
            Candidate candidateObj = entry.getValue();
            //candidates.put(id, candidateObj);
            System.out.println(id);
            System.out.println(candidateObj.toString());
        }
        return candidates;
    }
    /*public Map<Integer,Candidate> viewCandidateBySkill(String[] sk){
        Map<Integer,Candidate> newmap = new HashMap<>();
        for(Map.Entry<Integer,Candidate> entry : candidates.entrySet()){
            int id = entry.getKey();
            Candidate candidateObj = entry.getValue();
            Set<String> skillset = candidateObj.skills;
            Iterator itr = skillset.iterator();
            while (itr.hasNext()){
                String skillwehave = (String) itr.next();
                for(String s : sk){
                    if(skillwehave.equalsIgnoreCase(s)){
                        newmap.put(id,candidateObj);
                        System.out.println(id);
                        System.out.println(candidateObj.toString());
                    }
                }
            }
          //  if(candidateObj.skills)
        }
        return newmap;
    }*/
    public Set<Candidate> getCandidateBasedOnExp(){
        //yrs of exp is more than 10 yrs
        Set<Candidate> expMoreThanTen = new HashSet<>();
        for(Map.Entry<Integer,Candidate> entry : candidates.entrySet()){
            int id = entry.getKey();
            Candidate candidateObj = entry.getValue();
            if(candidateObj.candidateAge>10){
                expMoreThanTen.add(candidateObj);
            }
            //System.out.println(candidateObj.toString());
        }
        return expMoreThanTen;
    }
    public String countMaleCandidates(){
       // Set<Candidate> male = new HashSet<>();
        int num = 0;
        for(Map.Entry<Integer,Candidate> entry : candidates.entrySet()){
            int id = entry.getKey();
            Candidate candidateObj = entry.getValue();
            if(candidateObj.gender.equalsIgnoreCase("male")){
               num++;
            }
            //System.out.println(candidateObj.toString());

        }
        return num+"";
    }
    public Candidate getYoungestCandidate(){
        ArrayList<Integer> age = new ArrayList<>();
        for(Map.Entry<Integer,Candidate> entry : candidates.entrySet()){
            int id = entry.getKey();
            Candidate candidateObj = entry.getValue();
            age.add(candidateObj.candidateAge);


            //System.out.println(candidateObj.toString());
        }
        Collections.sort(age);
        return candidates.get(age.get(0));

    }
}
