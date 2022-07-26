public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber,designation,jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    //A constructor is called to create objects.
    public int getSalary(){
        return salary;
    }
    //getter method used to get the instance of salary.
    public void setSalary(int salary){
        if(joined==false){
            this.salary=salary;
        }
        else{
            System.out.print("you are already hired so your salary cann't change");;
        }
    }
    //setter method used to set the instance of salary.
    public int getWorkingHour(){
        return workingHour;
    }
    //getter method used to get the instance of workingHour.
    public void setWorkinghour(int workinghour){
        this.workingHour=workingHour;
    }
    //setter method used to set the instance of workinghour.
    public String getStaffName(){
        return staffName;
    }
    //getter method used to get the instance of staffName.
    public void setStaffName(String staffName){
        this.staffName=staffName;
    }
    //setter method used to set the instance of staffName.
    public String getJoiningDate(){
        return joiningDate;
    }
    //getter method used to get the instance of JoiningDate.
    public void setJoiningDate(String joiningDate){
        this.joiningDate=joiningDate;
    }
    //setter method used to set the instance of joiningDate.
    public String setQualification(){
        return qualification;
    }
    //setter method used to set the instance of qualification.
    public void getQualification(String qualification){
        this.qualification=qualification;
    }
    //getter method used to get the instance of qualification.
    public String getAppointedBy(){
        return appointedBy;
    }
    //getter method used to get the instance of AppointedBy.
    public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
    }
    //setter method used to set the instance of AppointedBy.
    public boolean getJoined(){
        return joined;
    }
    //getter method used to get the instance of Joined.
    public void setJoined(boolean joined){
        this.joined=joined;
    }
    //setter method used to set the instance of Joined.
    public void fullTimeStaff(String staffName, String joiningDate, String qualification,String appointedBy){
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        if(joined == true){
            System.out.print("from the "+ joiningDate + staffName +" is with our organization");
        }
        else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
    }
    //
    public void display(){
        super.display();
        if (joined=true){
            System.out.print("staffName= " + staffName + "\n");
            System.out.print("salary= "+salary + "\n");
            System.out.print("workingHour= "+workingHour + "hours" + "\n");
            System.out.print("joiningDate= "+joiningDate + "\n");
            System.out.print("qualification= "+qualification + "\n");
            System.out.print("appointedBy= "+appointedBy + "\n");
        }
    }
    //Display method which displays the values to be printed.
}   
