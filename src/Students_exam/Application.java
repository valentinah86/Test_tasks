
package Students_exam;

import java.util.Random;


class Student {

 String Name;
 String LastName;


 public Student (String Name, String LastName){
     this.Name = Name;
     this.LastName = LastName;
  }

}


public class Application {

     public static void main(String[] args) {

        String names [] = {"Ann", "Liza", "Peter", "Ivan", "Eugene", "Iren", "Mara", "Gleb", "Helem", "Stanislav", "Nick", "Michael", "Jackline", "Monika", "Ada", "Mark", "Daniel"};
        String surnames [] = {"Kero", "Miller", "Wasserman", "Shtein", "Lipski", "Weller", "Kennedy", "Levinski", "Adams", "Grey", "Ming"};

        Student [] Students = new Student[5];


        Random St = new Random();
        int RandIndexName = 0;
        int RandIndexSurname = 0;


        int [] Results = new int[5];
        Random r = new Random();

        int Sum = 0;


        for (int i=0; i<5; i++){

            RandIndexName = St.nextInt(17);
            RandIndexSurname = St.nextInt(11);
            String rName = names[RandIndexName];
            String LName = surnames[RandIndexSurname];
            Students[i]= new Student(rName,LName);

            Results[i] = r.nextInt(5)+1;
            Sum +=Results[i];
            System.out.println(i+1 + " | " + rName +" "+ LName +"  " + "Result = " + Results[i]);
        }
        float average=(float)Sum/5;
         System.out.println("Group Average = " + average);
    }
}