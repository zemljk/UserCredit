package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Client {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    private String name;
    private String secname;
    private String patronymic;
    private String phoneNumber;
    private String email;
    private String pasportNumber;
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<CreditOffer> creditOffers;


}
