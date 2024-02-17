package management;

public class Salary {
    //old salary
    double[] oldSalary =new double[5];

// set default salary
public Salary(){
    oldSalary[0]=15000;
    oldSalary[1]=25000;
    oldSalary[2]=10000;
    oldSalary[3]=35000;
    oldSalary[4]=30000;
}
    //new salary
    double[] newSalary = new double[5];

    public void increaseSalary(double[] x) {
        if (x == newSalary) {
            for (int i = 0; i < x.length; i++) {
               newSalary[i]=oldSalary[i] += 25000;
               System.out.println("New salary: " + newSalary[i]);
            }
        } else {
                for(double i:x){
                    System.out.println(i);
                }
            }
        }
    }

