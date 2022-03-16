import java.util.Random;
import java.util.Scanner;
import java.lang.String;


public class Main {
    public static void main(String[] args0){

        Scanner scanner=new Scanner(System.in);

        System.out.println("********Dobro došli u e Dnevenik********");
        for (int j = 0; j<30;j++){
            Student[] S = new Student[30];
            S[j]=new Student();

            System.out.println("Unesite svoje ime: ");
            Scanner input = new Scanner(System.in);
            String ime = input.nextLine();
            S[j].setFirstName(ime);

            System.out.println("Unesite ime jednog roditelja: ");
            String prez = input.nextLine();
            S[j].setParentName(prez);


            System.out.println("Unesite svoje prezime: ");
            String prezime = input.nextLine();
            S[j].setLastName(prezime);

            System.out.println("Unesi svoj razred (1,2,3,4): ");
            int razred = input.nextInt();

            Random mark = new Random();
            int[] marks = new int[4];
            for (int i = 0; i < 4; i++) {
                marks[i] = mark.nextInt(5) + 1;
            }
            Subjects pred1 =new Subjects ("Filozofija", "Avdija Vršajević", marks);
            Subjects pred2 =new Subjects ("Logika", "Miralem Pjanić", marks);
            Subjects pred3 =new Subjects ("Psihologija", "Sabahudin Topalbećirević", marks);
            Subjects pred4 =new Subjects ("Demokratija", "Sergej Milinković-Savić", marks);
            Subjects pred5 =new Subjects ("Pedagogija", "Mensur Mujdža", marks);
            Subjects pred6 =new Subjects ("Vjeronauka", "Džemaludin Hodzić", marks);
            Subjects pred7 =new Subjects ("Sociologija", "Mario Mandžukić", marks);
            Subjects pred8 =new Subjects ("Biologija", "Kasim Begić", marks);
            Subjects pred9 =new Subjects ("Hemija", "Kasim Begić", marks);
            Subjects pred10 =new Subjects ("Fizika", "Amir Sadić", marks);
            Subjects pred11 =new Subjects ("Geografija", "Mirela Nuhan", marks);
            Subjects pred12 =new Subjects ("Historija", "Mirela Nuhan", marks);
            Subjects pred13 =new Subjects ("Likovna kultura","Ibrahim Kara", marks);
            Subjects pred14 =new Subjects ("Bosanski jezik", "Mehmed Hodzić", marks);
            Subjects pred15 =new Subjects ("Engleski jezik", "Mirsad Kovacević", marks);
            Subjects pred16 =new Subjects ("Njemacki jezik", "Samir Delić", marks);
            Subjects pred17 =new Subjects ("Matematika", "Amir Sadić", marks);
            Subjects pred18 =new Subjects ("Informatika", "Emina Savić", marks);
            Subjects pred19 =new Subjects ("Muzicka kultura", "Jasna Ilić", marks);
            Subjects pred20 =new Subjects ("Tjelesni i zdravstveni odgoj", "Samra Jović", marks);

            Subjects FirstC[]= {pred14,pred15,pred16,pred17,pred18,pred19,pred20,pred6,pred8,pred13,pred12};
            Subjects SecondC[]= {pred14,pred15,pred16,pred17,pred18,pred19,pred20,pred10,pred13,pred12,pred4};
            Subjects ThirdC[]={pred14,pred15,pred16,pred17,pred18,pred19,pred20,pred9,pred11,pred3,pred7};
            Subjects ForthC[]={pred14,pred15,pred16,pred17,pred18,pred20,pred1,pred2,pred5,pred9,pred10};

            Year year1 = new Year();
            Year year2 = new Year();
            Year year3 = new Year();
            Year year4 = new Year();

            year1.setClass(FirstC);
            year2.setClass(SecondC);
            year3.setClass(ThirdC);
            year4.setClass(ForthC);

            if(razred==1){
                S[j].setGodina(year1);
                System.out.println(year1.toString());
            }else if(razred==2){
                S[j].setGodina(year2);
                System.out.println(year2.toString());
            }else if(razred==3){
                S[j].setGodina(year3);
                System.out.println(year3.toString());
            }else if(razred==4){
                S[j].setGodina(year4);
                System.out.println(year4.toString());
            }
            System.out.println("Unesite ime predmte iz kojeg želite da vidite ocjene: ");
            Scanner sca=new Scanner(System.in);
            String predName=sca.nextLine();
            System.out.println(S[j].IspisOcjenaizPredmeta(predName). doString());
            System.out.println("Unesite ime predmeta da saznate koji profesor predaje: ");
            Scanner scr=new Scanner(System.in);
            String predmet=scr.nextLine();
            System.out.println(S[j].IspisProf(predmet).Prof());
        }
    }
}
