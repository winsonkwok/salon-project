package salon.salonapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Slot {
    @Id
    private Long Id;

    private Date ConfirmedAt;

    private Date LockedAt;

    private Date SlotFor;

    private int Status;

    private String StylistName;
}
