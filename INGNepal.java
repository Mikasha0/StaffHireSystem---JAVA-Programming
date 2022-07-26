// importing all the  necessary libraries of java
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.Color;
//Creating a class named INGNepal.
public class INGNepal{
    JFrame frame;
    JPanel panel;
    JButton clearbtnft,displaybtnft,previousbtnft,addvacancynumberft,appointvacancyft,FullTimeStaff,PartTimeStaff ;

    private JPanel panel1;
    private JLabel vacancynumlblft;
    private JLabel designationlblft;
    private JLabel jobtypelblft;
    private JLabel staffnamelblft;
    private JLabel qualificationlblft;
    private JLabel joiningdatelblft;
    private JLabel appointedbylblft;
    private JLabel workinghourlblft;
    private JLabel salarylblft;
    private JLabel appointvacancynumberft;
    private JTextField appointvacancytxtfldft;
    private JTextField vacancynumbertxtfldft;
    private JTextField designationtxtfldft;
    private JTextField jobtypetxtfldft;
    private JTextField staffnametxtfldft;
    private JTextField qualificationtxtfldft;
    private JTextField joiningdatetxtfldft;
    private JTextField appointedbytxtfldft;
    private JTextField workinghourtxtfldft;
    private JTextField salarytxtfldft;

    private JPanel panel2;
    private JLabel vacancynumlblpt;
    private JLabel designationlblpt;
    private JLabel jobtypelblpt;
    private JLabel staffnamelblpt;
    private JLabel qualificationlblpt;
    private JLabel joiningdatelblpt;
    private JLabel appointedbylblpt;
    private JLabel workinghourlblpt;
    private JLabel shiftslblpt;
    private JLabel wagesperhourlblpt;
    private JLabel appointvacancylblpt;
    private JLabel terminatevacancylblpt;
    private JTextField appointvacancytxtfldpt;
    private JTextField terminatevacancytxtfldpt;
    private JTextField vacancynumbertxtfldpt ;
    private JTextField designationtxtfldpt;
    private JTextField jobtypetxtfldpt;
    private JTextField staffnametxtfldpt;
    private JTextField qualificationtxtfldpt;
    private JTextField joiningdatetxtfldpt;
    private JTextField appointedbytxtfldpt;
    private JTextField workinghourtxtfldpt;
    private JTextField shiftstxtfldpt;
    private JTextField wagesperhourtxtfldpt;
    JButton previousbtnpt,displaybtnpt,clearbtnpt,terminatebuttonpt,appointbuttonpt,addvacancynumberpt;
    //declaring the global variables.

    ArrayList<StaffHire>list = new ArrayList<>();
    //Creating an ArrayList of StaffHire. And the name of the arraylist is list.
    public INGNepal(){
        frame = new JFrame("INGNepal");
        frame.setSize(500,700);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBounds(0,0,500,700);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setBackground(Color.white);
        frame.add(panel);

        JLabel GUI = new JLabel("WELCOME TO MY GUI");
        GUI.setBounds(180,290,180,30);
        panel.add(GUI);
        GUI.setForeground(Color.red);

        JLabel dash = new JLabel("_____________________");
        dash.setBounds(180,292,180,30);
        panel.add(dash);
        dash.setForeground(Color.blue);

        PartTimeStaff = new JButton("PART TIME STAFF");
        PartTimeStaff.setBounds(80,350,140,30);
        panel.add(PartTimeStaff);

        PartTimeStaff.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel.setVisible(false);
                    PartTimeMethod();
                    panel2.setVisible(true);
                }
            });

        FullTimeStaff = new JButton("FULL TIME STAFF");
        panel.add(FullTimeStaff);
        FullTimeStaff.setBounds(260,350,140,30);

        FullTimeStaff.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ac){
                    panel.setVisible(false);
                    FullTimeMethod();
                    panel1.setVisible(true);
                }
            });

    }
    //creating constructor of the class INGNepal and making a frame  which contains the panel, JButton, JLabel and JTextField.
    public void FullTimeMethod(){

        panel1=new JPanel();
        panel1.setBounds(0,0,500,700);
        panel1.setVisible(false);
        panel1.setLayout(null);
        frame.add(panel1);

        JLabel label1 = new JLabel("ADDING VACANCY");
        panel1.add(label1);
        label1.setBounds(15,30,140,20);
        label1.setForeground(Color.red);

        JLabel label2 = new JLabel("FULL TIME");
        panel1.add(label2);
        label2.setBounds(180,0,140,40);
        label2.setForeground(Color.red);

        JLabel dash1 = new JLabel("______________________________________________________________________");
        panel1.add(dash1);
        dash1.setBounds(15,30,500,30);
        dash1.setForeground(Color.red);

        JLabel label3 = new JLabel ("APPOINTING VACANCY");
        panel1.add(label3);
        label3.setBounds(15,295,300,20);
        label3.setForeground(Color.red);

        JLabel dash2 = new JLabel("______________________________________________________________________");
        panel1.add(dash2);
        dash2.setBounds(15,295,500,30);
        dash2.setForeground(Color.red);

        JLabel label4 = new JLabel("BUTTONS");
        panel1.add(label4);
        label4.setBounds(15,505,140,20);
        label4.setForeground(Color.blue);

        JLabel dash3 = new JLabel("______________________________________________________________________");
        panel1.add(dash3);
        dash3.setBounds(15,505,500,30);
        dash3.setForeground(Color.blue);

        vacancynumlblft = new JLabel("VACANCY NUMBER");
        vacancynumlblft.setBounds(15,60,140,20);
        panel1.add(vacancynumlblft);

        designationlblft =new JLabel("DESIGNATION");
        designationlblft.setBounds(220,60,140,20);
        panel1.add(designationlblft);

        jobtypelblft = new JLabel("JOBTYPE");
        jobtypelblft.setBounds(220,120,140,20);
        panel1.add(jobtypelblft);

        staffnamelblft = new JLabel("STAFFNAME");
        staffnamelblft.setBounds(15,330,130,20);
        panel1.add(staffnamelblft);

        qualificationlblft = new JLabel("QUALIFICATION");
        qualificationlblft.setBounds(15,390,130,20);
        panel1.add(qualificationlblft);

        joiningdatelblft = new JLabel("JOINING DATE");
        joiningdatelblft.setBounds(220,330,130,20);
        panel1.add(joiningdatelblft);

        appointedbylblft = new JLabel("APPOINTED BY");
        appointedbylblft.setBounds(220,390,130,20);
        panel1.add(appointedbylblft);

        workinghourlblft = new JLabel("WORKING HOUR");
        workinghourlblft.setBounds(15,120,140,20);
        panel1.add(workinghourlblft);

        salarylblft = new JLabel("SALARY");
        salarylblft.setBounds(15,180,140,20);
        panel1.add(salarylblft);

        appointvacancynumberft = new JLabel("APPOINTED VACANCY");
        appointvacancynumberft.setBounds(15,450,150,20);
        panel1.add(appointvacancynumberft);

        appointvacancytxtfldft = new JTextField();
        appointvacancytxtfldft.setBounds(15,475,130,20);
        panel1.add(appointvacancytxtfldft);

        appointvacancyft = new JButton("Appoint Vacancy");
        appointvacancyft.setBounds(175,540,130,20);
        panel1.add(appointvacancyft);
        appointvacancyft.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent at){
                    fullTimeAppointMethod();
                }
            });

        vacancynumbertxtfldft = new JTextField();
        vacancynumbertxtfldft.setBounds(15,85,140,20);
        panel1.add(vacancynumbertxtfldft);

        designationtxtfldft = new JTextField();
        designationtxtfldft.setBounds(220,85,140,20);
        panel1.add(designationtxtfldft);

        jobtypetxtfldft = new JTextField();
        jobtypetxtfldft.setBounds(220,145,140,20);
        panel1.add(jobtypetxtfldft);

        staffnametxtfldft = new JTextField();
        staffnametxtfldft.setBounds(15,355,130,20);
        panel1.add(staffnametxtfldft);

        qualificationtxtfldft = new JTextField();
        qualificationtxtfldft.setBounds(15,415,130,20);
        panel1.add(qualificationtxtfldft);

        joiningdatetxtfldft = new JTextField();
        joiningdatetxtfldft.setBounds(220,355,130,20);
        panel1.add(joiningdatetxtfldft);

        appointedbytxtfldft = new JTextField();
        appointedbytxtfldft.setBounds(220,415,130,20);
        panel1.add(appointedbytxtfldft);

        workinghourtxtfldft = new JTextField();
        workinghourtxtfldft.setBounds(15,145,140,20);
        panel1.add(workinghourtxtfldft);

        salarytxtfldft = new JTextField();
        salarytxtfldft.setBounds(15,205,140,20);
        panel1.add(salarytxtfldft);

        clearbtnft = new JButton("CLEAR");
        clearbtnft.setBounds(290,600,100,40);
        panel1.add(clearbtnft);
        clearbtnft.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae){
                    fullTimeClearMethod();
                }
            });
        displaybtnft = new JButton("DISPLAY");
        displaybtnft.setBounds(90,600,100,40);
        panel1.add(displaybtnft);
        displaybtnft.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ah){
                    fullTimeDisplayMethod();
                }
            });

        previousbtnft = new JButton("BACK");
        previousbtnft.setBounds(190,600,100,40);
        panel1.add(previousbtnft);
        previousbtnft.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent au){
                    fullTimeBackMethod();
                }
            });

        addvacancynumberft = new JButton("Add Vacancy");
        addvacancynumberft.setBounds(15,540,130,20);
        panel1.add(addvacancynumberft);
        addvacancynumberft.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent aa){
                    fullTimeAddVacancyMethod();
                }
            });

    }
    //Creating a fullTimeMethod. This method contains all the neccary JLabel,JTextField, JButton along with decentralized method for actionListener method for full time panel.

    public void fullTimeAddVacancyMethod(){
        int vn,wh,sy;
        String vacancynumber = vacancynumbertxtfldft.getText();
        String designation = designationtxtfldft.getText();
        String jobtype = jobtypetxtfldft.getText();
        String workinghourft = workinghourtxtfldft.getText();
        String salary = salarytxtfldft.getText();

        if(vacancynumber.trim().equals("")||designation.trim().equals("")||jobtype.trim().equals("")||workinghourft.trim().equals("")||salary.trim().equals(""))
        { JOptionPane.showMessageDialog(frame,"Please fill the field","Error",0);
        }
        else{
            try{
                vn = Integer.parseInt(vacancynumber);
                wh = Integer.parseInt(workinghourft);
                sy = Integer.parseInt(salary);
                if(list.size()==0){
                    FullTimeStaffHire fu = new FullTimeStaffHire(vn,designation,jobtype,sy,wh);
                    list.add(fu);
                    JOptionPane.showMessageDialog(frame,"successfully added staff","Result",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    for(StaffHire s : list){
                        if(s instanceof FullTimeStaffHire){
                            FullTimeStaffHire ft = (FullTimeStaffHire)s;
                            if(ft.getVacancyNumber()==vn){
                                JOptionPane.showMessageDialog(frame,"vacancy already exists","Error",JOptionPane.ERROR_MESSAGE);

                            }else{
                                FullTimeStaffHire fu = new FullTimeStaffHire(vn,designation,jobtype,sy,wh);
                                list.add(fu);
                                JOptionPane.showMessageDialog(frame,"successfully added staff","Result",JOptionPane.INFORMATION_MESSAGE);

                            }
                        }
                    }
                }
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(frame,"Please enter in correct format","ERROR",0);
                return;
            }
        }
    }
    //Creating a method that adds the vacancy for FullTimeStaffHire.
    public void fullTimeAppointMethod(){
        int vacnom;
        String vacnumber = appointvacancytxtfldft.getText();
        String stfname =  staffnametxtfldft.getText();
        String qual =  qualificationtxtfldft.getText();
        String joindt =  joiningdatetxtfldft.getText();
        String appby =  appointedbytxtfldft.getText();
        if(vacnumber.trim().equals("")||stfname.trim().equals("")||qual.trim().equals("")||joindt.trim().equals("")||appby.trim().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Please fill in all the required boxes","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                vacnom = Integer.parseInt(vacnumber);
                boolean condition=false;
                for (int i = 0;i < list.size();i++){
                    StaffHire sh = list.get(i);
                    if(sh instanceof FullTimeStaffHire){ 
                        FullTimeStaffHire fth = (FullTimeStaffHire)sh;
                        if(fth.getVacancyNumber() == vacnom)
                        {
                            fth.fullTimeStaff(stfname,joindt,qual,appby);
                            JOptionPane.showMessageDialog(frame,"Staff appointed successfully","Result",JOptionPane.INFORMATION_MESSAGE);
                            condition=true;
                            break;
                        }
                    }
                }
                if(!condition){
                    JOptionPane.showMessageDialog(frame,"Vacancy number not found","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(frame,"Please fill correct values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Creating a method that appoints the vacancy for FullTimeStaffHire.
    public void fullTimeDisplayMethod(){
        for (StaffHire s :list)
        {
            if (s instanceof FullTimeStaffHire){
                FullTimeStaffHire fu = ( FullTimeStaffHire)s;
                fu.display();
            }
        }
    }
    //Creating a method that displays the arguements of FullTimeStaffHire in the terminal.
    public void fullTimeClearMethod(){
        vacancynumbertxtfldft.setText("");
        designationtxtfldft.setText("");
        jobtypetxtfldft.setText("");
        staffnametxtfldft.setText("");
        qualificationtxtfldft.setText("");
        joiningdatetxtfldft.setText("");
        appointedbytxtfldft.setText("");
        workinghourtxtfldft.setText("");
        salarytxtfldft.setText("");
        appointvacancytxtfldft.setText("");
        JOptionPane.showMessageDialog(frame,"textfields have been cleared","Result",JOptionPane.INFORMATION_MESSAGE);
    }
    //Creating a method that clears all the arguements in the JTextFields of the FULL TIME panel.
    public void fullTimeBackMethod(){
        panel1.setVisible(false);
        panel.setVisible(true);
    }
    //Creating a method that closes the panel of FULL TIME.
    public void PartTimeMethod(){
        panel2=new JPanel();
        panel2.setBounds(0,0,500,900);
        panel2.setVisible(false);
        panel2.setLayout(null);
        frame.add(panel2);

        JLabel label5 = new JLabel("ADDING VACANCY");
        panel2.add(label5);
        label5.setBounds(15,30,140,20);
        label5.setForeground(Color.red);

        JLabel label6 = new JLabel("PART TIME");
        panel2.add(label6);
        label6.setBounds(180,0,140,40);
        label6.setForeground(Color.red);

        JLabel dash4 = new JLabel("______________________________________________________________________");
        panel2.add(dash4);
        dash4.setBounds(15,30,500,30);
        dash4.setForeground(Color.red);

        JLabel label7 = new JLabel ("APPOINTING VACANCY & TERMINATING");
        panel2.add(label7);
        label7.setBounds(15,295,300,20);
        label7.setForeground(Color.red);

        JLabel dash5 = new JLabel("______________________________________________________________________");
        panel2.add(dash5);
        dash5.setBounds(15,295,500,30);
        dash5.setForeground(Color.red);

        JLabel label8 = new JLabel("BUTTONS");
        panel2.add(label8);
        label8.setBounds(15,505,140,20);
        label8.setForeground(Color.blue);

        JLabel dash6 = new JLabel("______________________________________________________________________");
        panel2.add(dash6);
        dash6.setBounds(15,505,500,30);
        dash6.setForeground(Color.blue);

        vacancynumlblpt = new JLabel("VACANCY NUMBER");
        vacancynumlblpt.setBounds(15,60,140,20);
        panel2.add(vacancynumlblpt);

        designationlblpt =new JLabel("DESIGNATION");
        designationlblpt.setBounds(220,60,140,20);
        panel2.add(designationlblpt);

        jobtypelblpt = new JLabel("JOB TYPE");
        jobtypelblpt.setBounds(220,120,140,20);
        panel2.add(jobtypelblpt);

        staffnamelblpt = new JLabel("Staff Name");
        staffnamelblpt.setBounds(15,330,130,20);
        panel2.add(staffnamelblpt);

        qualificationlblpt = new JLabel("Qualification:");
        qualificationlblpt.setBounds(15,390,130,20);
        panel2.add(qualificationlblpt);

        joiningdatelblpt = new JLabel("Joining Date");
        joiningdatelblpt.setBounds(220,330,130,20);
        panel2.add(joiningdatelblpt);

        appointedbylblpt = new JLabel("Appointed By");
        appointedbylblpt.setBounds(220,390,130,20);
        panel2.add(appointedbylblpt);

        workinghourlblpt = new JLabel("WORKING HOUR");
        workinghourlblpt.setBounds(15,120,140,20);
        panel2.add(workinghourlblpt);

        shiftslblpt = new JLabel("SHIFTS");
        shiftslblpt.setBounds(15,180,140,20);
        panel2.add(shiftslblpt);

        wagesperhourlblpt=new JLabel("WAGES PER HOUR");
        wagesperhourlblpt.setBounds(15,240,140,20);
        panel2.add(wagesperhourlblpt);

        addvacancynumberpt = new JButton("Add Vacancy");
        addvacancynumberpt.setBounds(15,540,130,20);
        panel2.add(addvacancynumberpt);
        addvacancynumberpt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ar){
                    partTimeAddVacancyMethod();
                }
            });

        appointvacancylblpt = new JLabel("Appointed Vacancy:");
        appointvacancylblpt.setBounds(15,450,130,20);
        panel2.add(appointvacancylblpt);

        appointvacancytxtfldpt = new JTextField();
        appointvacancytxtfldpt.setBounds(15,475,130,20);
        panel2.add(appointvacancytxtfldpt);

        appointbuttonpt = new JButton("Appoint Vacancy");
        appointbuttonpt.setBounds(175,540,130,20);
        panel2.add(appointbuttonpt);
        appointbuttonpt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent aji){
                    partTimeAppointVacancyMethod();
                }
            });

        terminatevacancylblpt = new JLabel("Terminate Vacancy(for termination)");
        terminatevacancylblpt.setBounds(220,450,220,20);
        panel2.add(terminatevacancylblpt);

        terminatevacancytxtfldpt = new JTextField();
        terminatevacancytxtfldpt.setBounds(220,475,130,20);
        panel2.add(terminatevacancytxtfldpt);

        terminatebuttonpt = new JButton("TERMINATE");
        terminatebuttonpt.setBounds(335,540,130,20);
        panel2.add(terminatebuttonpt);
        terminatebuttonpt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent add){
                    partTimeTerminateMethod();
                }
            });

        vacancynumbertxtfldpt = new JTextField();
        vacancynumbertxtfldpt.setBounds(15,85,140,20);
        panel2.add(vacancynumbertxtfldpt);

        designationtxtfldpt = new JTextField();
        designationtxtfldpt.setBounds(220,85,140,20);
        panel2.add(designationtxtfldpt);

        jobtypetxtfldpt = new JTextField();
        jobtypetxtfldpt.setBounds(220,145,140,20);
        panel2.add(jobtypetxtfldpt);

        staffnametxtfldpt = new JTextField();
        staffnametxtfldpt.setBounds(15,355,130,20);
        panel2.add(staffnametxtfldpt);

        qualificationtxtfldpt = new JTextField();
        qualificationtxtfldpt.setBounds(15,415,130,20);
        panel2.add(qualificationtxtfldpt);

        joiningdatetxtfldpt = new JTextField();
        joiningdatetxtfldpt.setBounds(220,355,130,20);
        panel2.add(joiningdatetxtfldpt);

        appointedbytxtfldpt = new JTextField();
        appointedbytxtfldpt.setBounds(220,415,130,20);
        panel2.add(appointedbytxtfldpt);

        workinghourtxtfldpt = new JTextField();
        workinghourtxtfldpt.setBounds(15,145,140,20);
        panel2.add(workinghourtxtfldpt);

        shiftstxtfldpt = new JTextField();
        shiftstxtfldpt.setBounds(15,205,140,20);
        panel2.add(shiftstxtfldpt);

        wagesperhourtxtfldpt = new JTextField();
        wagesperhourtxtfldpt.setBounds(15,265,140,20);
        panel2.add(wagesperhourtxtfldpt);

        clearbtnpt = new JButton("CLEAR");
        clearbtnpt.setBounds(290,600,100,40);
        panel2.add(clearbtnpt);
        clearbtnpt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ad){
                    partTimeClearMethod();

                }
            });

        displaybtnpt = new JButton("DISPLAY");
        displaybtnpt.setBounds(90,600,100,40);
        panel2.add(displaybtnpt);
        displaybtnpt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent aj){
                    displayMethodPT();
                }
            });

        previousbtnpt = new JButton("BACK");
        previousbtnpt.setBounds(190,600,100,40);
        panel2.add(previousbtnpt);
        previousbtnpt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent aer){
                    partTimeBackMethod();
                }
            });

    }
    //Creating a partTimeMethod. This method contains all the neccary JLabel,JTextField, JButton along with decentralized method of actionListener method for PART TIME panel.
    public void partTimeAddVacancyMethod(){
        int vacancynumber,wages, workinghour;

        String vacancynum = vacancynumbertxtfldpt.getText();
        String designation = designationtxtfldpt.getText();
        String jobtype = jobtypetxtfldpt.getText();
        String workinghr =  workinghourtxtfldpt.getText();
        String shifts = shiftstxtfldpt.getText();
        String wagesperhour = wagesperhourtxtfldpt.getText();
        if(vacancynum.trim().equals("")||designation.trim().equals("")||jobtype.trim().equals("")||workinghr.trim().equals("")||shifts.trim().equals("")|wagesperhour.trim().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Please fill all the fields","ERROR",0);
        }
        else{
            try{
                vacancynumber=Integer.parseInt(vacancynum);
                wages = Integer.parseInt(wagesperhour);
                workinghour = Integer.parseInt(workinghr);
                if(list.size()==0){
                    PartTimeStaffHire pu = new PartTimeStaffHire(vacancynumber,designation,jobtype,workinghour,wages,shifts);
                    list.add(pu);
                    JOptionPane.showMessageDialog(frame,"Successfully added staff","Result", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    for (StaffHire s : list){
                        if (s instanceof PartTimeStaffHire){
                            PartTimeStaffHire pt = (PartTimeStaffHire)s;
                            if(pt.getVacancyNumber()==vacancynumber){
                                JOptionPane.showMessageDialog(frame,"vacancy already exists","Error",0);
                            }else{
                                PartTimeStaffHire pu = new PartTimeStaffHire(vacancynumber,designation,jobtype,workinghour,wages,shifts);
                                list.add(pu);
                                JOptionPane.showMessageDialog(frame,"Staff has been successfully added.","Result", JOptionPane.INFORMATION_MESSAGE);

                            }
                        }
                    }
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(frame,"Please enter in correct format","ERROR",0);
                return;
            }
        }
    }
    //Creating a method that adds the vacancy for partTimeStaffHire.
    public void partTimeAppointVacancyMethod(){
        int appointvacancynumber;
        String appvacancynum = appointvacancytxtfldpt.getText();
        String stfname = staffnametxtfldpt.getText();
        String qlfi= qualificationtxtfldpt.getText();
        String jnda = joiningdatetxtfldpt.getText();
        String appby = appointedbytxtfldpt.getText();
        if(appvacancynum.trim().equals("")||stfname.trim().equals("")||qlfi.trim().equals("")||jnda.trim().equals("")||appby.trim().equals(""))
        {
            JOptionPane.showMessageDialog(frame,"Please fill the field","Error",0);
        }
        else{
            try{
                appointvacancynumber = Integer.parseInt(appvacancynum);
                boolean condition=false;
                for(int i = 0;i < list.size(); i++){
                    StaffHire s = list.get(i);
                    if(s instanceof PartTimeStaffHire){
                        PartTimeStaffHire pt = (PartTimeStaffHire)s;
                        if(pt.getVacancyNumber()==appointvacancynumber){
                            pt.partTimeStaff(stfname,jnda,qlfi,appby);
                            JOptionPane.showMessageDialog(frame,"Staff has been hired successfully","Result",JOptionPane.INFORMATION_MESSAGE);
                            condition=true;
                            break;
                        }
                    }
                }
                if(!condition){
                    JOptionPane.showMessageDialog(frame,"Vacancy number not found","Error",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(frame,"Please enter in correct format","Error",0);
                return;
            }
        }
    }
    //Creating a method that appoints the vacancy for partTimeStaffHire.
    public void partTimeClearMethod(){

        vacancynumbertxtfldpt.setText("");
        designationtxtfldpt.setText("");
        jobtypetxtfldpt.setText("");
        staffnametxtfldpt.setText("");
        qualificationtxtfldpt.setText("");
        joiningdatetxtfldpt.setText("");
        appointedbytxtfldpt.setText("");
        workinghourtxtfldpt.setText("");
        shiftstxtfldpt.setText("");
        wagesperhourtxtfldpt.setText("");
        appointvacancytxtfldpt.setText("");
        terminatevacancytxtfldpt.setText("");

        JOptionPane.showMessageDialog(frame,"All the textfields have been cleared.","Result",JOptionPane.INFORMATION_MESSAGE);
    }
    //Creating a method that clears all the arguements in the JTextField of PART TIME panel 
    public void partTimeTerminateMethod(){
        
        String vacancyNum = terminatevacancytxtfldpt.getText().trim();
        int termNum;
        if(vacancyNum.equals("")){
            JOptionPane.showMessageDialog(frame, "Please fill the Field", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                termNum = Integer.parseInt(vacancyNum);
            }catch(NumberFormatException abc){                    
                JOptionPane.showMessageDialog(frame, "Please fill all the fields in correct format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean joined = false;
            for(StaffHire s: list){
                if(s instanceof PartTimeStaffHire){
                    PartTimeStaffHire p = (PartTimeStaffHire)s;
                    if(s.getVacancyNumber()==termNum){
                        joined= true;                           
                        p.terminate();
                        list.remove(s);
                        JOptionPane.showMessageDialog(frame,"Staff has been successfully terminated.","Terminated",1);
                        break;              
                    }
                }
            }                
            if(joined == false){
                JOptionPane.showMessageDialog(frame, "The staff is not joined yet.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    //Creating a method that terminates the appointed vacancy in the PartTimeStaffHire.
    public void displayMethodPT(){
        for(StaffHire s: list){
            if (s instanceof PartTimeStaffHire){
                PartTimeStaffHire p = (PartTimeStaffHire)s;
                p.display();
            }
        }
    }
    //Creating a method that displays all the arguments of the PART TIME in the terminal.
    public void partTimeBackMethod(){
        panel2.setVisible(false);
        panel.setVisible(true);
    }
    //Cerating a method that closes the panel of PART TIME.
    public static void main(String[]args){
        new INGNepal().frame.setVisible(true);
    }
    //main method of the class INGNepal.The main function where the compiler starts the execution.
}