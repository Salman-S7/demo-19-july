package secondproblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EmployeeSalary {
    static HashMap<Integer,Integer> increaseSal(HashMap<Integer,String> hm,HashMap<Integer,Integer> hm1){
        HashMap<Integer,Integer> idsal = new HashMap<>();
        Set s = hm.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            int id1 = (int) itr.next();
            String des = hm.get(id1);
            if(des.equalsIgnoreCase("manager")){
                int sal = hm1.get(id1);
                sal += 5000;
                idsal.put(id1,sal);
            }
        }
        return idsal;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hm = new HashMap<>();
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        System.out.println("Enter the number of employees you want to add");
        int n = sc.nextInt();
        for(int i= 0; i<n; i++){
            System.out.println("Enter the ID");
            int id = sc.nextInt();
            System.out.println("Enter the salaary");
            int salary = sc.nextInt();
            System.out.println("Enter the designation");
            String  ds = sc.next();
            hm.put(id,ds);
            hm1.put(id,salary);
        }
        HashMap<Integer,Integer> hm2 = increaseSal(hm,hm1);
        Set<Integer> s1 = hm2.keySet();
        Iterator<Integer> ids = s1.iterator();
        while (ids.hasNext()){
            int id = ids.next();
            System.out.println("id: "+id+"  salary: "+hm2.get(id));
        }

    }
}

/*.

 Read Employee details from the User. The details would include id,
designation and salary in the given order. The datatype for id is integer, designation is string and salary is integer.
2. You decide to build two hashmaps. The first hashmap contains employee id
as key and designation as value, and the second hashmap contains same employee ids as key and salary as value.
3. The company decides to hike the salary of managers by 5000. You decide to
 write a function increaseSalaries which takes the above hashmaps as input and
 returns a hashmap with only managers id and their increased salary as output.
  Include this function in class UserMainCode.


  */