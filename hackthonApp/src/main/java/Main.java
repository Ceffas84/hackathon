import org.academiadecodigo.asciimos.bravers.hackathonapp.factories.StepFactory;
import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.Step;


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Step step = StepFactory.getStep();
            System.out.println(step.getMessage());
        }


    }
}
