public class Year extends Subjects {
    public Subjects Class[];

    Year() {
        super();
        Subjects[] FClass = new Subjects[10];
        this.Class = FClass;
    }
    public void setClass(Subjects aClass[]) {//postavljanje predmeta u godini
        this.Class = aClass;
    }
    public String toString(){//ispis predmeta iz godine koja se izabere
        String predmet="";
        for (int i = 0; i<11; i++){
            predmet= predmet.concat(Class[i].SubjectName) + ", ";
        }return predmet;
    }
}