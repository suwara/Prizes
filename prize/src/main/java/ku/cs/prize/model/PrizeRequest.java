package ku.cs.prize.model;

import lombok.Data;

import java.util.Date;

@Data
public class PrizeRequest {

    private String type;
    private String sources;
    private String nameReceiver;
    private Date dayToGet;
    private String tournaments;
    private String description;
}
