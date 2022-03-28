public class Prac11Q2 {
    float weight, piece;

    void assignReading(String measure, float reading) {
        if (measure.equalsIgnoreCase("weight")) {
            weight = reading;
        } else {
            piece = reading;
        }
    }
}
