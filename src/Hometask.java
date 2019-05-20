import java.awt.*;
import java.util.*;
import java.util.List;

public class Hometask<Animal> {

    Map<String, List<Animal>> hometask;

public Hometask(){
    this.hometask = new HashMap<>();
}
public void addPerson(String name, List animals){
    if(hometask.containsKey(name)){
        System.out.println(String.format("%s is already added", name));
    }else if (hometask.containsKey(animals)){
        System.out.println(String.format("%s  already added", animals));
    } else {
        hometask.put(name,animals);
        System.out.println(String.format(("%s and %s yo added"), name,animals));
    }

}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hometask task = new Hometask();
        do {
            String info = scan.nextLine();
            String[] spliting = info.split(" ");
            String mainCom = spliting[0];
            switch(mainCom.toLowerCase()){
                case "add":
                    ArrayList<String> animals = new ArrayList<String>();
                    animals.add(spliting[2]);
                    animals.add(spliting[3]);
                    System.out.println("How many animals do you have?: ");
                    task.addPerson(spliting[1], (List) animals);
            }
        }while(true);
    }

}
