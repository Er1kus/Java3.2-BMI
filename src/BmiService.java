public class BmiService {

    public float calculate(float height, float weight) {

        float index = weight / (height * height);

        return index;


    }
}
