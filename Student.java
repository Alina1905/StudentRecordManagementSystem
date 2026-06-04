public class Student {
    // Instance variables
    private String studentId;
    private String studentName;
    private double cgpa;
    private String department;
    
    // Constructor
    public Student(String studentId, String studentName, double cgpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.cgpa = cgpa;
    }
    
    // Getter methods
    public String getStudentId() {
        return studentId;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public double getCgpa() {
        return cgpa;
    }
    
    // Setter methods
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
        }
    }
    
    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("===========================");
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student("S001", "John Doe", 3.75);
        
        // Display student information
        student1.displayStudentInfo();
        
        // Test with another student
        Student student2 = new Student("S002", "Jane Smith", 3.92);
        student2.displayStudentInfo();
        
        // Test setter methods
        System.out.println("\nUpdating student information...");
        student1.setStudentName("John Updated");
        student1.setCgpa(3.85);
        student1.displayStudentInfo();
    }
}