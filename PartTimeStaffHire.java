public class PartTimeStaffHire extends StaffHire
{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    public PartTimeStaffHire(int vacancyNumber,String Designation,String jobType,int workingHour,int wagesPerHour,String shifts)
    {
        super(vacancyNumber,Designation,jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    } 
    // a constructor is called to create objects.
    public int getWorkingHour()
    {
        return workingHour;
    }
    //getter method used to get the instance workingHour.
    public void setWorkingHour()
    {
        this.workingHour = workingHour;
    }    
    //setter method used to set the workingHour.
    public int getWagesPerHour()
    {
        return wagesPerHour;
    }
    //getter method used to get the instance WagesPerHour.
    public void setWagesPerHour()
    {
        this.wagesPerHour = wagesPerHour;
    }  
    //setter method used to set the wagesperhour.
    public String getStaffName()
    {
        return staffName;
    }
    //getter method used to get the instance staffname.
    public void setStaffName()
    {
        this.staffName = staffName;
    }
    //setter method used to set the staffName.
    public String getJoiningDate()
    {
        return joiningDate;
    }
    //getter method used to get the instance joiningDate.
    public void setJoiningDate()
    {
        this.joiningDate = joiningDate;
    }  
    //setter method used to set the joiningDate.
    public String getQualification()
    {
        return qualification;
    }
    //getter method used to get the instance qualification.
    public void setQualification()
    {
        this.qualification = qualification;
    }   
    //setter method used to set the qualification.
    public String getAppointedBy()
    {
        return appointedBy;
    }
    //getter method used to get the instance appointedBy.
    public void setAppointedBy()
    {
        this.appointedBy = appointedBy;
    }
    //setter method used to set the value of appoinedBy.
    public String getShifts()
    {
        return shifts;
    }
    //getter method used to get the instance value of shift.
    public void setShifts()
    {
        this.shifts = shifts;
    }
    //setter method used to set the value of shifts.
    public boolean getJoined()
    {
        return joined;
    } 
    //getter method used to get the instance value of joined.
    public void setJoined()
    {
        this.joined = joined;
    }  
    //setter method used to set the value of joined.
    public boolean getTerminated()
    {
        return terminated;
    }

    public void setTerminated()
    {
        this.terminated = terminated;
    }

    public void setShifts(String newShifts)
    {
        this.shifts = newShifts;
    }

    public void partTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy)
    {
        if(joined ==true)
        {
            System.out.println("Staff Name :" +getStaffName()+ "joined on :" +getJoiningDate());
        }
        else
        {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
            terminated = false;
        }
    }     

    public void terminate()
    {
        if(terminated == true)
        {
            System.out.println("Staff has been terminated");
        }
        else
        {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    } 

    public void display()
    {
        super.display();
        if(joined == true)
        {
            System.out.println("The new hired staff name is = " +getStaffName()+ "\nWages Per Hour =" +getWagesPerHour()+ 
                "\nJoined Date = " +getJoiningDate()+ "\nQualification of staff =" +getQualification()+ 
                "\nAppointed By = " +getAppointedBy()+ "\nsalary worth per day = " +(workingHour*wagesPerHour));
        }
    }// this is a method which displays the value to be printed.
}

