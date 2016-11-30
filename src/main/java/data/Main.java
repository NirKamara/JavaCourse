import com.sun.scenario.effect.impl.prism.ps.PPSBlend_SRC_OUTPeer;
import data.Person;

/**
 * Created by student14 on 30/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(19);
        person.setName("Nir");

        System.out.print("Name: " + person.getName() + "\n");
        if (person.isAdult()==true)
            System.out.print("Adult");
                    else
            System.out.print("Not Adult");






    }
}
