public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int DOB;
    private String classification;
    private String major = null;
    private String minor = null;

    Student(int id, String firstName, String lastName, int DOB, String classification){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.classification = classification;

    }

    Student(int id, String firstName, String lastName, int DOB, String classification, String major){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.classification = classification;
        this.major = major;

    }

    Student(int id, String firstName, String lastName, int DOB, String classification, String major, String minor){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.classification = classification;
        this.major = major;
        this.minor = minor;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDOB() {
        return DOB;
    }

    public String getClassification() {
        return classification;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public String toString(){
        String output = "\t";
        output += getId()+"\t";
        output += getFirstName()+"\t";
        output += getLastName()+"\t";
        output += getDOB()+"\t";
        output += getClassification()+"\t";
        if(getMajor() == null){
            output += "null"+"\t";
        }else{
            output += getMajor()+"\t";
        }
        if(getMinor() == null){
            output += "null"+"\t";
        }else{
            output += getMinor()+"\t";
        }
        return output;
    }
}
