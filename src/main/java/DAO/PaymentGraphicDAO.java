package DAO;



import entities.CreditOffer;
import entities.PaymentGraphic;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface PaymentGraphicDAO {
    public void addPaymentGraphic (PaymentGraphic paymentGraphic) throws SQLException;
    public void updatePaymentGraphic (PaymentGraphic paymentGraphic) throws SQLException;
    public List getAllPaymentGraphic () throws SQLException;
    public PaymentGraphic getPaymentGraphicById(String id) throws SQLException;
    public void deletePaymentGraphic (PaymentGraphic paymentGraphic) throws SQLException;
    public List getPaymentGraphicsByCreditOffer(CreditOffer creditOffer) throws SQLException;
}
