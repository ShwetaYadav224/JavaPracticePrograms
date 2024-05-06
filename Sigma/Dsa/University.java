import java.util.ArrayList;
import java.util.List;


    public class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    private class Department {
        private String name;
        private List<String> courses;

        public Department(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }

        public void addCourse(String courseName) {
            courses.add(courseName);
            System.out.println("Course '" + courseName + "' added to department '" + name + "'.");
        }
    }

    public static void main(String[] args) {
        University myUniversity = new University("My University");
        
        myUniversity.addDepartment("Computer Science");
        myUniversity.addDepartment("Electrical Engineering");
    
        // Adding courses to the Computer Science department
        myUniversity.departments.get(0).addCourse("Introduction to Programming");
        myUniversity.departments.get(0).addCourse("Data Structures");
    
        // Adding courses to the Electrical Engineering department
        myUniversity.departments.get(1).addCourse("Circuit Analysis");
        myUniversity.departments.get(1).addCourse("Digital Signal Processing");
    }
    
    


}
