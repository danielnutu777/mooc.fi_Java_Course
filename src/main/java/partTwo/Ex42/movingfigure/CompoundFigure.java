package partTwo.Ex42.movingfigure;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {

    private List<Figure> figuresList;

    public CompoundFigure() {
        super(0, 0);
        this.figuresList = new ArrayList<Figure>();
    }

    public void add(Figure f){
        figuresList.add(f);
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure f: figuresList) {
            f.move(dx, dy);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure f: figuresList) {
            f.draw(graphics);
        }
    }
}
