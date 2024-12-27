class Registration 
{
    private String cnic;
    private String name;
    private String mobileNumber;

    public Registration(String cnic, String name, String mobileNumber) 
    {
        this.cnic = cnic;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getCnic()
    {
        return cnic;
    }

    public void setCnic(String cnic) 
    {
        this.cnic = cnic;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getMobileNumber() 
    {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) 
    {
        this.mobileNumber = mobileNumber;
    }

    public void show() 
    {
        System.out.println("CNIC: " + cnic);
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}
