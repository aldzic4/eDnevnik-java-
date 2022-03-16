public class Student extends Year{

    private String FirstName;
    private String LastName;
    private String ParentName;
    private Year Razred;

    Student(Subjects[] FClass) {
        super();
    }
    public Student() {
        super();
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName){
        LastName=lastName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public void setGodina(Year year){
        Razred=year;
    }

    public String toString(){
        return "Student " + FirstName + " " + LastName + " sluša predmete " ;
    }
    public Subjects IspisOcjenaizPredmeta(String pred){//Ispisuje ocjene iz predmeta kojeg upiše student
        for(int i = 0; i<Razred.Class.length;i++){
            if(Razred.Class[i].SubjectName.equals(pred)) {
                return Razred.Class[i];
            }
        }return null;
    }
    public Subjects IspisProf(String pred){//Ispisuje ime profesora iz predmeta kojeg upiše student
        for(int i = 0; i<Razred.Class.length;i++){
            if(Razred.Class[i].SubjectName.equals(pred)) {
                return Razred.Class[i];
            }
        }return null;
    }
}
