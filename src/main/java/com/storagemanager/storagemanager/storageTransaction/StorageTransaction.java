package com.storagemanager.storagemanager.storageTransaction;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by NHima on 4/22/18.
 * POJO of the StorageTransaction Java Object
 * Currently only 4 fields, type | sku | quantity | transactionDate, with corresponding getters and setters
 *
 *
 */
@Entity
@Table(name = "transaction")
public class StorageTransaction {
    @Id @GeneratedValue
    Long transactionID;
    @Column(name = "TYPE")
    boolean type = true;
    @Column(name = "SKU")
    Long sku;
    @Column(name = "QUANTITY")
    int quantity;
    @Column(name = "TRANS_DATE")
    Date transactionDate;
    @Column(name = "TRANS_TYPE_RESULT")
    String typeResult;

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public boolean isType() {
        return type;
    }

    public String getTypeResult() {
        return typeResult;
    }

    public void setTypeResult(String typeResult) {
        this.typeResult = typeResult;
    }

    protected StorageTransaction() {}

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "StorageTransaction{" +
                "transactionID=" + transactionID +
                ", type=" + type +
                ", sku=" + sku +
                ", quantity=" + quantity +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
