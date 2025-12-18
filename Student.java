
public class Student {

    private String name;
    private String major;
    private int id;
    private int credits;
    private double gpa;

    public Student(String name, String major, int id) {
        this.name = name;
        this.major = major;
        this.id = id;
        this.credits = 0;
        this.gpa = 0.0;

    }

    public String getName(){
        return name;}
    public String getMajor(){
        return major;}
    public int getId(){
        return id;}
    public int getCredits(){
        return credits;}
    public double getGpa(){
        return gpa;}


    public void updateGpa(double newGpa){
        if (newGpa>=0.0 && newGpa<=4.0){
            this.gpa = newGpa;}}
    public void addCredits(int c){
        if (c > 0) {
            this.credits += c;
            this.credits += c;
        }
    }
    public boolean isHonors(){
        return gpa >= 3.5;

    }
    public String toString() {
        return "Student{name='" + name +
                "', id=" + id +
                ", major='" + major +
                "', gpa=" + gpa +
                ", credits=" + credits +
                "}";
    }


}