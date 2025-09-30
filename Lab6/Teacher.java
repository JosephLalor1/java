public class Teacher extends Person
{
    private String courses[];
    private int numCourses;

    public Teacher(String name, String address)
        {
            super(name, address);
            courses = new String[5];
            numCourses = 0;
        }
    
    public Boolean addCourse(String course)
        {
            
            if (numCourses < 5)
                {
                    courses[numCourses] = course;
                    numCourses++;
                    return true;
                }
            else
                {
                    return false;
                }
        }
    
    public Boolean removeCourse(String course)
        {
            int indexOf = -1;
            for (int i = 0; i < numCourses; i++)
                {
                    if (course == courses[i])
                        {
                            indexOf = i;
                        }
                }
            if (indexOf >= 0)
                {
                    courses[indexOf] = "";
                    for (int i = indexOf; i < numCourses; i++)
                        {
                            courses[i] = courses[i + 1];
                        }
                    return true;
                }
            else    
                {
                    return false;
                }

        }
    public String toString()
        {
            String summary = "";
            summary = super.toString();
            for(int i = 0; i < numCourses; i++)
                {
                    summary = summary + "\n" + courses[i];
                }
            return summary;
        }
}
