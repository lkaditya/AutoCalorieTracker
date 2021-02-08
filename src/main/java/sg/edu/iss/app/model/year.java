package sg.edu.iss.app.model;

import lombok.Data;
import javax.persistence.Entity;
import java.util.stream.IntStream;

@Entity
@Data
public class year {

    public int year;

    int[] number = IntStream.range(1960, 2021).toArray();

}