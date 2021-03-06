package salon.salonapi.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SalonServiceDetail {
    @Id
    private Long id;

    @Value("${salon.name}")
    private String Name;

    @Value("${salon.address}")
    private String Address;

    @Value("${salon.city}")
    private String City;

    @Value("${salon.zipcode")
    private String ZipCode;

    @Value("${salon.phone}")
    private String Phone;
}
