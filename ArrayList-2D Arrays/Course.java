public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) 
    {
        this.courseName = courseName;
        students = new String[10]; 
        numberOfStudents = 0;
    }

    // Method to add a student
    public void addStudent(String student) 
    {
        if (numberOfStudents >= students.length) 
        {
            increaseArraySize(); 
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Method to drop a student
    public void dropStudent(String student) 
    {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }
        
        if (index != -1) 
        {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear() {
        students = new String[10]; // Reset to initial size
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        String[] activeStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, activeStudents, 0, numberOfStudents);
        return activeStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    private void increaseArraySize() {
        String[] newStudents = new String[students.length * 2];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }
}

