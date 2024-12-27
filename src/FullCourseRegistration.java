class FullCourseRegistration extends Registration
{
    private int numberOfClasses;
    private double courseFee;

    public FullCourseRegistration(String cnic, String name, String mobileNumber, int numberOfClasses, double courseFee) 
    {
        super(cnic, name, mobileNumber);
        this.numberOfClasses = numberOfClasses;
        this.courseFee = courseFee;
    }

    public int getNumberOfClasses()
    {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses)
    {
        this.numberOfClasses = numberOfClasses;
    }

    public double getCourseFee() 
    {
        return courseFee;
    }

    public void setCourseFee(double courseFee) 
    {
        this.courseFee = courseFee;
    }

    @Override
    public void show() 
    {
        super.show();
        System.out.println("Number of Classes: " + numberOfClasses);
        System.out.println("Course Fee: " + courseFee);
    }
}