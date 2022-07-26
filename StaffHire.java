public class StaffHire 
{
   private int vacancyNumber;
   private String designation;
   private String jobType;
    
   public StaffHire (int vacancyNumber, String designation, String jobType)
   {
       this.vacancyNumber=vacancyNumber;
       this.designation=designation;
       this.jobType=jobType;
   }
   //A method which  initializes the object of the attribute. Like in StaffHire we have vacancyNumber, designation, joiningDate 
   //which are set on the class StaffHire and allocates the memory for that following object.
   public int getVacancyNumber()
   {
       return vacancyNumber;
   } 
   //This method reads the integer value of the variable vacancyNumber and this value can also be accessed by other class when called.
   public String getDesignation()
   {
       return designation;
   } 
   //This method reads the integer value of the variable vacancyNumber and this value can also be accessed by other class when called.
   public String getJobType()
   {
        return jobType;
   }
   //This method reads the integer value of the variable jobtype which can also be accessed by other classes when called.
   public void setVacancyNumber(int vacancyNumber)
   {
       this.vacancyNumber=vacancyNumber;
   }
   //this method is used to set the value of valancyNumber.
   public void setDesignation(String designation)
   {
        this.designation=designation;
   }
   //this method is used to set the value of designation.
   public void setJobType(String jobType)
   {
        this.jobType=jobType;
   }
   //this method is used to set the value of jobtype.
   public void display(){
        System.out.println("VacancyNumber =  "+vacancyNumber );
        System.out.println("Designation = " +designation );
        System.out.println("Type of job = "+jobType);
    } 
    //this method is used to display suitable message with their respective attribute.
  
}
