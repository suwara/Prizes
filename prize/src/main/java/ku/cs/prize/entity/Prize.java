package ku.cs.prize.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Prize {
    @Id
    @GeneratedValue
    private UUID id;

    private String type;
    private String sources;
    private String nameReceiver;
    private Date dayToGet;
    private String tournaments;
    private String description;
//    private Image imgPrize;
    @ManyToOne
    private Member member;

}
