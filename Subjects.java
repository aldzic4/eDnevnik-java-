public class Subjects  {

    public String SubjectName;
    public String ProfName;
    public int[] Marks = new int[4];

    Subjects(String Name, String profName, int[] Ocj){
        this.SubjectName=Name;
        this.ProfName=profName;
        this.Marks=Ocj;
    }
    public Subjects() {
    }
    public String doString(){
        return  String.valueOf(Marks[1]) +" "+ String.valueOf(Marks[2]) +" "+String.valueOf(Marks[0])+" "+String.valueOf(Marks[3]);
    }
    public String Prof(){ //vraca ime profesora
        return ProfName;
    }
}