package partTwo.Ex47.reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {
    @Override
    public boolean complies(String line) {
        if(line.length() > 0){
            char c = line.charAt(line.length()-1);
            if(c == '!'){
                return true;
            }
            if(c == '?'){
                return true;
            }
        }
        return false;
    }
}
