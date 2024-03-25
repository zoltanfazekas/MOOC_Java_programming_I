
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> addedGrade;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.addedGrade = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.addedGrade.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        } else {
            double ossz = grades.size();
            double sum = 0;
            for (int i = 0; i < grades.size(); i++) {
                sum = sum + grades.get(i);
            }
            return sum / ossz;
        }

    }

    public double averageOfPoints() {
        double ossz = 0;
        if (addedGrade.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < addedGrade.size(); i++) {
//                System.out.println("addedgrade: " + addedGrade.get(i));
                ossz = ossz + addedGrade.get(i);
            }
//            System.out.println("ossz: " + ossz);
//            System.out.println("grades size: " + grades.size());
            return ossz / addedGrade.size();
        }

    }
}
