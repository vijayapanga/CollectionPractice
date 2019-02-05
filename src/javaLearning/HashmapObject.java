package javaLearning;
import java.util.HashMap;
import java.util.Map;

public class HashmapObject {
    public static void main(String[] args) {

        HashMap<Integer, EmpDetails> hm = new HashMap<Integer, EmpDetails>();

        // Hashmap (key, value) through passing a abject as value
        
        EmpDetails E1 = new EmpDetails(101, "Employee1", 16, "India");
        EmpDetails E2 = new EmpDetails(102, "Employee2", 18, "India");
        EmpDetails E3 = new EmpDetails(103, "Employee3", 19, "India");
        EmpDetails E4 = new EmpDetails(104, "Employee4", 20, "India");
        EmpDetails E5 = new EmpDetails(105, "Employee5", 21, "India");
        hm.put(1,E1);
        hm.put(2,E2);
        hm.put(3,E3);
        hm.put(4,E4);
        hm.put(5,E5);

        for(HashMap.Entry<Integer,EmpDetails> entry: hm.entrySet()) {
            int key = entry.getKey();
            EmpDetails e = entry.getValue();
            System.out.println(key + " Details " + e.empID + " " + e.empName + " " + e.age + " " + e.empAdress);
        }
    }
}

class EmpDetails {

    int empID, age;
    String empName, empAdress;

    public EmpDetails(int empID, String empName, int age, String empAdress) {
        this.empID = empID;
        this.empName = empName;
        this.age = age;
        this.empAdress = empAdress;
    }
}

