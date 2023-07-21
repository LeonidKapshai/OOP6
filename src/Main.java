import module.essence.Gender;
import module.essence.Human;
import module.families.Family;
import presenter.Presenter;
import service.Service;
import ui.View;
import ui.console.ConsoleUI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Family<Human> Romanovs = new Family<>();
        Human Nikolai_II = new Human("Nikolai_II", 18, 5, 1865, Gender.Male);
        Human Aleksandra = new Human("Aleksandra Korotkevich", 6, 6, 1881, Gender.Female);
        Human Olga = new Human("Olga", 15, 11, 1895, Gender.Female);
        Human Aleksei = new Human("Aleksei", 12, 8, 1966, Gender.Male);
        Human Maria = new Human("Maria", 26, 6, 1899, Gender.Female);
        Human Tatyana = new Human("Tatyana", 11, 5, 1897, Gender.Female);
        Human Anastasia = new Human("Anastasia", 11, 5, 1986, Gender.Female);

        Romanovs.addMember(Nikolai_II);
        Romanovs.addMember(Aleksandra);
        Romanovs.setMarriage(Nikolai_II, Aleksandra);
        Romanovs.setChildren(Nikolai_II, Olga);
        Romanovs.setChildren(Nikolai_II, Tatyana);
        Romanovs.setChildren(Nikolai_II, Anastasia);
        Romanovs.setChildren(Nikolai_II, Aleksei);
        Romanovs.setChildren(Nikolai_II, Maria);
   
        Service<Human> service = new Service<>(Romanovs);

        View view = new ConsoleUI();
        Presenter presenter = new Presenter(view, service);
        view.start();


    }
}