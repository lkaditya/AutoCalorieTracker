package sg.edu.iss.app.model;

import javax.persistence.Entity;
import java.util.stream.IntStream;


public class year {

    public int year;

    int[] number = IntStream.range(1960, 2021).toArray();

}