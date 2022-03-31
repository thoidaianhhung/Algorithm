package models;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> ans = new ArrayList<>();
        for(int marks:grades){
            if(marks < 38 || marks % 5 <= 2){
                ans.add(marks);
            }else {
                int add = 5 -(marks % 5);
                ans.add(marks + add);
            }
        }
        return ans;
    }
}
