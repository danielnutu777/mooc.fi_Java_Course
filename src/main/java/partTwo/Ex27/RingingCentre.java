import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!observations.containsKey(bird)) {
            observations.put(bird, new ArrayList<String>());
        }
            observations.get(bird).add(place);

    }

    public void observations(Bird bird) {
        if(observations.containsKey(bird)){
            for (Bird b : observations.keySet()) {
                if (b.equals(bird)) {
                    System.out.println(b + " observations: " + observations.get(b).size());
                    for (String s : observations.get(b)) {
                        System.out.println(s);
                    }
                }
            }
        }else{
            System.out.println(bird + " observations: 0");
        }

    }
}
