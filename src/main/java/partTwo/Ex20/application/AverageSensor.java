package partTwo.Ex20.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensorList) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s: sensorList) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s: sensorList) {
            s.off();
        }
    }

    @Override
    public int measure() {
        int average = 0;
        if(!this.isOn() || sensorList.size() == 0){
            throw new IllegalStateException();
        }else{
            int sum = 0;
            for (Sensor s: sensorList) {
                sum += s.measure();
            }
            average = sum / sensorList.size();
            readings.add(average);
            return average;
        }

    }

    public void addSensor(Sensor additional){
        sensorList.add(additional);
    }


    public List<Integer> readings(){
        return readings;
    }
}
