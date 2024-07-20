package entities;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CreditOffer {
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "creditId", nullable = false)
    private Credit credit;

    private Long creditSum;
    private Long monthsOfCredit;

    @OneToMany(mappedBy = "creditOffer", fetch = FetchType.EAGER)
    private Set<PaymentGraphic> payment_graphics;
}