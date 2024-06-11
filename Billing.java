class User {
    long id;
    String firstName;
    String lastName;
    String gender;
    String email;

    public User(String fn, String ln, String g, String e) {
        firstName = fn;
        lastName = ln;
        gender = g;
        email = e;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String g) {
        gender = g;
    }

    public String getGender() {
        return gender;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getEmail() {
        return email;
    }
}

class Patient extends User {
    long patientId;
    boolean insured;
    HealthInsurence insurancePlan = null;

    public Patient(String fn, String ln, String g, String e, long id, boolean isI, HealthInsurence pln) {
        super(fn, ln, g, e);
        insurancePlan = pln;
        patientId = id;
        insured = isI;
    }

    public void setInsurencePlan(HealthInsurence plan) {
        insurancePlan = plan;
    }

    public HealthInsurence getInsurencePlan() {
        return insurancePlan;
    }

    public void setPatientId(long id) {
        patientId = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setIsInsured(boolean isI) {
        insured = isI;
    }

    public boolean getIsInsured() {
        return insured;
    }

    public String toString() {
        return "\nFirst Name of the Patient - " + firstName + "\nLast Name of the Patient - " + lastName +
                "\nThis Patient is a - " + gender + "\nMailId is - " + email + "\nID is - " + patientId +
                "\nInsured - " + insured + "\nInsurence Plan is - " + insurancePlan.getPlanName() + "\nIt Covers "
                + insurancePlan.getCoverage() + " of Bill";
    }
}

class Staff extends User {
    long staffId;
    int yearOfExperience;
    String description;
    double salary;

    public Staff(String fn, String ln, String g, String e, long stfId, int yOfEx, String des, double sal) {
        super(fn, ln, g, e);
        staffId = stfId;
        yearOfExperience = yOfEx;
        description = des;
        salary = sal;
    }

    public void setStaffId(long sid) {
        staffId = sid;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setYearOfEx(int yoe) {
        yearOfExperience = yoe;
    }

    public int getYearOfEx() {
        return yearOfExperience;
    }

    public void setDesc(String desc) {
        description = desc;
    }

    public String getDesc() {
        return description;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}

class Doctor extends Staff {
    long doctorId;
    String specialization;

    public Doctor(String fn, String ln, String g, String e, long stfId, int yOfEx, String des, double sal, long did,
            String spec) {
        super("Dr. " + fn, ln, g, e, stfId, yOfEx, des, sal);
        doctorId = did;
        specialization = spec;
    }

    public void setDoctorId(long dId) {
        doctorId = dId;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setSpecialization(String spc) {
        specialization = spc;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toString() {
        return "\nFirst Name of the Doctor - " + firstName + "\nLast Name of the Doctor - " + lastName +
                "\nThis Doctor is a - " + gender + "\nMailId is - " + email + "\nStaffId is - " + staffId +
                "\nDoctor\'s Id is - " + doctorId + "\nYears of Experience - " + yearOfExperience +
                " Specialization in - " + specialization + "\nSalary - " + salary + "\nDesc about " + firstName
                + " is -" + description;
    }
}

class Nurse extends Staff {
    long nurseId;

    public Nurse(String fn, String ln, String g, String e, long stfId, int yOfEx, String des, double sal, long nid) {
        super("Sister." + fn, ln, g, e, stfId, yOfEx, des, sal);
        nurseId = nid;
    }

    public void setNurseId(long nid) {
        nurseId = nid;
    }

    public long getNurseId() {
        return nurseId;
    }

    public String toString() {
        return "\nFirst Name of the Nurse - " + firstName + "\nLast Name of the Nurse - " + lastName +
                "\nThis Nurse is a - " + gender + "\nMailId is - " + email + "\nStaffId is - " + staffId +
                "\nYears of Experience - " + yearOfExperience + "\nSalary - " + salary +
                "\nDesc about " + firstName + " is -" + description;
    }
}

class HealthInsurence {
    String planName;
    double coverage;

    public HealthInsurence(String nam, int c) {
        planName = nam;
        coverage = c;
    }

    public double getCoverage() {
        return coverage;
    }

    public String getPlanName() {
        return planName;
    }
}

class Platinum extends HealthInsurence {
    public Platinum() {
        super("Platinum", 90);
    }
}

class Gold extends HealthInsurence {
    public Gold() {
        super("Gold", 80);
    }
}

class Silver extends HealthInsurence {
    public Silver() {
        super("Silver", 70);
    }
}

class Bronze extends HealthInsurence {
    public Bronze() {
        super("Bronze", 60);
    }
}

class HospitalManagement {
    public static void main(String[] args) {
        Doctor D1 = new Doctor("Abc", " Kumar", "Male", "abc@gmail.com", 1234L, 12,
                "Good Doc in the city with bad record.", 12000, 123456, "Heart");
        System.out.println(D1);

        Nurse N1 = new Nurse(" D\'Costa", "Maria", "Female", "mariaDcosta@hotmail.com", 112233, 31, "Good at word",
                12000, 334455);
        System.out.println(N1);

        Patient P1 = new Patient("Channu Bhai", " Patel", "Male", "channu@yahoomail.com", 000001, true, new Platinum());
        System.out.println(P1);
    }
}