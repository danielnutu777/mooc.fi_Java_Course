package partTwo.Ex47.reader.criteria;

import java.util.List;

public class AtLeastOne implements Criterion {

    private Criterion[] criterion;

    public AtLeastOne(Criterion... criteria) {
        this.criterion = criteria;
    }

    @Override
    public boolean complies(String line) {
        for (int i = 0; i < criterion.length; i++) {
            if(criterion[i].complies(line)){
                return true;
            }
        }
        return false;
    }
}
