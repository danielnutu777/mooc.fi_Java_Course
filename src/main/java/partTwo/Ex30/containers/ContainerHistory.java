package partTwo.Ex30.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    private List<Double> tracker;

    public ContainerHistory() {
        this.tracker = new ArrayList<Double>();
    }

    public void add(double situation) {
        tracker.add(situation);
    }

    public void reset() {
        tracker.clear();
    }

    @Override
    public String toString() {
        return tracker.toString();
    }

    public double maxValue() {
        if (tracker.size() != 0) {
            double greatest = tracker.get(0);
            for (Double d : tracker) {
                if (d > greatest) {
                    greatest = d;
                }
            }
            return greatest;
        }
        return 0;
    }

    public double minValue() {
        if (tracker.size() != 0) {
            double smallest = tracker.get(0);
            for (Double d : tracker) {
                if (d < smallest) {
                    smallest = d;
                }
            }
            return smallest;
        }
        return 0;
    }

    public double average() {
        if (tracker.size() != 0) {
            double sum = 0;
            for (Double d : tracker) {
                sum += d;
            }
            return sum / tracker.size();
        }
        return 0;
    }

    public double greatestFluctuation() {
        if (this.tracker.size() > 1) {
            double greatestFluctuation = Math.abs(this.tracker.get(0) - this.tracker.get(1));

            for (int i = 0; i < this.tracker.size() - 1; i++) {
                double comparedFluctuation = Math.abs(this.tracker.get(i) - this.tracker.get(i + 1));
                if (comparedFluctuation > greatestFluctuation) {
                    greatestFluctuation = comparedFluctuation;
                }
            }

            return greatestFluctuation;
        }

        return 0;
    }

    public double variance() {
        if (tracker.size() > 1) {
            double result = 0;
            double avg = average();
            for (double a:tracker) {
                result += (Math.pow(a - avg, 2));
            }
            return result/(tracker.size()-1);
        }
        return 0;
    }
}
