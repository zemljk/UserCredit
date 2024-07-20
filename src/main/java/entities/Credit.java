package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
    public class Credit {
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name ="uuid", strategy = "uuid")
        private String id;

        private String creditName;

        private long creditLimit;
        private Integer percent;

        @OneToMany(mappedBy = "credit", fetch = FetchType.EAGER)
        private Set<CreditOffer> creditOffers;


}
