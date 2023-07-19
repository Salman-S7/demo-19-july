package com.example.practic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Candidate> can= new HashMap();
        CandidateService canserv = new CandidateService();

        for(int i = 0; i<3; i++) {
            System.out.println("Enter the ID: ");
            int candidateId = sc.nextInt();
            System.out.println("Enter the Name: ");
            String candidateName = sc.next();

            Set<String> skills = new HashSet();
            System.out.println("Enter the Skills: ");
            String skill = sc.next();
            skills.add(skill);
            System.out.println("do you want to add more skills: \nEnter y for yes and n for n");
            String choice = sc.next();
            while (choice.equalsIgnoreCase("y")) {
                skill = sc.next();
                skills.add(skill);
                System.out.println("do you want to add more skills: \nEnter y for yes and n for n");
                choice = sc.next();
            }

            System.out.println("Enter the Year of Exp: ");
            int candidateYearOFExp = sc.nextInt();
            System.out.println("Enter the age: ");
            int candidateAge = sc.nextInt();
            System.out.println("Enter the gender: ");
            String gender = sc.next();

            Candidate c = new Candidate(candidateId, candidateName, skills, candidateYearOFExp, candidateAge, gender);
            can.put(candidateId, c);
            canserv.addCandidate(can);
            can.clear();
        }

        System.out.println("viiewing all candidates");
        canserv.viewAllCandidate();

       /* System.out.println("Enter the skills you want that candidate to search with \n give comma[,] after each skill");
        String skillToSearch = sc.nextLine();
        sc.next();
        String[] sk = skillToSearch.split(",");
        System.out.println("candidates based on skills are");
        System.out.println(canserv.viewCandidateBySkill(sk));;
*/
        System.out.println("Candidates with more exp than 10");
        System.out.println(canserv.getCandidateBasedOnExp());






        System.out.println("number of males are");
        System.out.println(canserv.countMaleCandidates());

        System.out.println("Youngest candidate");
        System.out.println(canserv.getYoungestCandidate().toString());



    }
}
