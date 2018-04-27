package com.storagemanager.storagemanager.storageTransaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by NHima on 4/22/18.
 * POJO of the StorageTransaction Java Object
 * Currently only 4 fields, type | sku | quantity | transactionDate, with corresponding getters and setters
 *
 *
 */
@Entity
@Table(name = "TRANSACTION")
public class StorageTransaction {
    @Column(name = "TYPE")
    char type;

    @Id
    @Column(name = "SKU")
    long sku;
    @Column(name = "QUANTITY")
    int quantity;
    @Column(name = "TRANS_DATE")
    Date transactionDate;

    protected StorageTransaction() {}

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
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
}
