public class Student extends Person 
{
    private String courses[];
    private int grades[];
    private int numCourses;

    public Student(String name, String address)
        {
            super(name, address);
            courses = new String[5];
            grades = new int[5];
            numCourses = 0;
        }
    
    public void addCourseGrade(String course, int grade)
        {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    public void printGrades()
        {
            for(int i = 0; i < numCourses; i++)
                {
                    System.out.print("\n" + courses[i] + ": " + grades[i]);
                }
        }
    public double getAverageGrade()
        {
            double sum = 0;
            double temp;                //for conversion to double
            for (int i = 0; i < numCourses; i++)
                {
                    temp = grades[i];
                    sum = sum + temp;
                }
            temp = numCourses;
            return sum/temp;
        }
    public String toString()
        {
            String summary = "";
            summary = super.toString();
            for(int i = 0; i < numCourses; i++)
                {
                    summary = summary + "\n" + courses[i] + ": " + grades[i];
                }
            return summary;
        }
}
