package oop.theory.practice.finals;

public class CollegeStudent extends Student implements Person{
    private int collegeId;
    private double metricPercentage;

    public CollegeStudent(String name, int age, String rollNo, int collegeId, double metricPercentage) {
        super(name, age, rollNo);
        this.collegeId = collegeId;
        this.metricPercentage = metricPercentage;
    }

    public double getMetricPercentage() {
        return metricPercentage;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public void setMetricPercentage(double metricPercentage) {
        this.metricPercentage = metricPercentage;
    }
}
