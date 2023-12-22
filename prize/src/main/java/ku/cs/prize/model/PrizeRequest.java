package ku.cs.prize.model;

import lombok.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
public class PrizeRequest {

    private UUID id;
    private String type;
    private String sources;
    private String level;
    private String nameGiver;
    private String dayToGet;

    private String tournaments;
    private String description;

    public LocalDate ConvertStringToDate(String date){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date , format);

        return localDate;
    }
}
