public class Student extends Person 
{
    private int numCourses = 0;
    private String courses[];
    private int grades[];
    private int count;

    public Student(String name, String address)
        {
            super(name, address);
            courses = new String[5];
            grades = new int[5];
            count = 0;
        }
    
    public void addCourseGrade(String course, int grade)
        {
            courses[count] = course;
            grades[count] = grade
            count++;
        }
    public void printGrades()
        {
            for(int i = 0; i < count; i++)
                {
                    System.out.print("\n" + courses[i] + ": " + grades[i]);
                }
        }
    public double getAverageGrade()
        {
            private double sum = 0;
            private double temp;                //for conversion to double
            for (int i = 0; i < count; i++)
                {
                    temp = grades[i];
                    sum = sum + temp;
                }
            temp = count;
            return sum/temp
        }
    public String toString()
        {
            private String summary = "";
            summary = super.toString();
            for(int i = 0; i < count; i++)
                {
                    summary = summary + "\n" + courses[i] + ": " + grades[i];
                }
            return summary
        }
}
