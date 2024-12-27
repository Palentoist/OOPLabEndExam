class OneSessionRegistration extends Registration 
{
    private String sessionDate;
    private double sessionCharges;

    public OneSessionRegistration(String cnic, String name, String mobileNumber, String sessionDate, double sessionCharges)
    {
        super(cnic, name, mobileNumber);
        this.sessionDate = sessionDate;
        this.sessionCharges = sessionCharges;
    }

    public String getSessionDate() 
    {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) 
    {
        this.sessionDate = sessionDate;
    }

    public double getSessionCharges() 
    {
        return sessionCharges;
    }

    public void setSessionCharges(double sessionCharges) 
    {
        this.sessionCharges = sessionCharges;
    }

    @Override
    public void show() 
    {
        super.show();
        System.out.println("Session Date: " + sessionDate);
        System.out.println("Session Charges: " + sessionCharges);
    }
}
