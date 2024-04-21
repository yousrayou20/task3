import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        float heightAnouar,weightAnouar,bmiAnouar;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("this program will calculate your BMI");

        System.out.println("Enter your height in cm : ");
        heightAnouar = Float.parseFloat(br.readLine())/100;

        System.out.println("Enter your weight : ");
        weightAnouar = Float.parseFloat(br.readLine());

        bmiAnouar = (float) (weightAnouar/(Math.pow(heightAnouar, 2)) );
        System.out.printf("Your BMI is : "+"%2.2f,\n",bmiAnouar);

        if (bmiAnouar < 16){
            System.out.println(" starvation");
        }
        else if ((bmiAnouar >=16)&&(bmiAnouar<=16.99)) {
            System.out.println(" emaciation");
        }
        else if ((bmiAnouar>=17)&&(bmiAnouar<=18.49)) {
            System.out.println("underweight");
        }
        else if ((bmiAnouar>=18.50)&&(bmiAnouar<=22.99)) {
            System.out.println("normal, low range");
        }
        else if ((bmiAnouar>=23.00)&&(bmiAnouar<=24.99)) {
            System.out.println("normal, high range");
        }
        else if ((bmiAnouar>=25.00)&&(bmiAnouar<=27.49)) {
            System.out.println(" overweight, low range");
        }
        else if ((bmiAnouar>=27.50)&&(bmiAnouar<=29.99)) {
            System.out.println("overweight, high range");
        }
        else if ((bmiAnouar>=30)&&(bmiAnouar<=34.9)) {
            System.out.println(" 1st degree obesity");
        }
        else if ((bmiAnouar>=35)&&(bmiAnouar<=39.9)) {
            System.out.println(" 2nd degree obesity");
        }
        else if ((bmiAnouar>=40)){
            System.out.println(" 3rd degree obesity");
        }



    }
}