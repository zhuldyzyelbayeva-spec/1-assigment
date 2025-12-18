public class Main {


    public static void main(String[] args) {

        Student[] arr = {
                new Student("Aidana", "SE", 125),
                new Student("Dias", "IT", 102),
                new Student("Gulfairuz", "CS", 105),
                new Student("Nagimusha", "IT", 103),
                new Student("Miras", "SE", 126)
        };

        arr[0].updateGpa(3.9); arr[0].addCredits(40);
        arr[1].updateGpa(3.1); arr[1].addCredits(50);
        arr[2].updateGpa(2.25); arr[2].addCredits(30);
        arr[3].updateGpa(3.8); arr[3].addCredits(40);
        arr[4].updateGpa(3.7); arr[4].addCredits(20);

        Course course = new Course("OOP", "Ali", 5);
        for (int i = 0; i < arr.length; i++) {
            course.addStudent(arr[i], i);
        }

        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest credit student: " + course.highestCreditStudent());
        System.out.println("Top GPA student: " + getTopStudent(arr));
        System.out.println("Honors count: " + countHonors(arr));
        System.out.println("Total credits: " + totalCredits(arr));
    }


    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getGpa() > top.getGpa()) {
                top = arr[i];
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) count++;
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            sum += s.getCredits();
        }
        return sum;
    }
}


