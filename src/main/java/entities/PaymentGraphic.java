package entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PaymentGraphic {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "creditOffer_id", nullable = false)
    private CreditOffer creditOffer;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date date;
    private Long paymentSum;
    private Long creditBody;
    private Long creditPercents;
    private Long remains;


}



