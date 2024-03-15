package chapter12_collections;

import java.util.Map;

public class Grades {

    public static void main(String[] args) {

        Map <String,Integer> test1 = TestResults.getOriginalGrades();
        Map <String,Integer> test2 = TestResults.getMakeUpGrades();


        for (var student: test2.entrySet()){
            Integer firstGrade = test1.get(student.getKey());
            Integer secondGrade = test2.get((student.getKey()));

            if (secondGrade > firstGrade){
                test1.put(student.getKey(),secondGrade);
            }
        }

        System.out.println("Final Grades:");
        test1.forEach(
                (key,value) -> System.out.println("Student: " + key + ", Grade: "+ value)
        );
    }
}
