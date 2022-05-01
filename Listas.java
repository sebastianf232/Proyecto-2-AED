import java.util.ArrayList;
import java.util.Random;

public class Listas {
    
    public String ficcion() {
        ArrayList<String> ficcion = new ArrayList<String>();
        ficcion.add("Island");
        ficcion.add("Endless Night");
        ficcion.add("The secret sister");
        ficcion.add("Whirlpool");
        ficcion.add("Lucy Sullivan");

        Listas obj = new Listas();
        String rec1 = obj.getRandomElement(ficcion);
        return rec1;
    }
    
    public String drama () {
        ArrayList<String> drama = new ArrayList<String>();
        drama.add("Faust");
        drama.add("Hamlet");
        drama.add("Clouds");
        drama.add("Four plays");
        drama.add("Life is a dream");
        Listas obj = new Listas();
        String rec1 = obj.getRandomElement(drama);
        return rec1;
    }

    public String cocina () {
        ArrayList<String> cocina = new ArrayList<String>();
        cocina.add("Glada's Family Dinners");
        cocina.add("Small Bites");
        cocina.add("Every night italian");
        cocina.add("Pies and tarts");
        cocina.add("Healthy cooking");

        Listas obj = new Listas();
        String rec1 = obj.getRandomElement(cocina);
        return rec1;
    }

    public String historia() {
        ArrayList<String> historia = new ArrayList<String>();
        historia.add("Europe");
        historia.add("World War II");
        historia.add("Spandau");
        historia.add("The origins of the Civil War");
        historia.add("The Anglo-Saxons");

        Listas obj = new Listas();
        String rec1 = obj.getRandomElement(historia);
        return rec1;
    }
    public String getRandomElement(ArrayList<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
