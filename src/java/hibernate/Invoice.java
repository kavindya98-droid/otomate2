package hibernate;
// Generated May 25, 2020 11:55:22 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Invoice generated by hbm2java
 */
public class Invoice  implements java.io.Serializable {


     private Integer id;
     private Customer customer;
     private String invoiceId;
     private Date dateTime;
     private Double total;
     private Double discount;
     private Set invoiceItems = new HashSet(0);
     private Set deliveryNotes = new HashSet(0);

    public Invoice() {
    }

	
    public Invoice(Customer customer) {
        this.customer = customer;
    }
    public Invoice(Customer customer, String invoiceId, Date dateTime, Double total, Double discount, Set invoiceItems, Set deliveryNotes) {
       this.customer = customer;
       this.invoiceId = invoiceId;
       this.dateTime = dateTime;
       this.total = total;
       this.discount = discount;
       this.invoiceItems = invoiceItems;
       this.deliveryNotes = deliveryNotes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getInvoiceId() {
        return this.invoiceId;
    }
    
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    public Date getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Set getInvoiceItems() {
        return this.invoiceItems;
    }
    
    public void setInvoiceItems(Set invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
    public Set getDeliveryNotes() {
        return this.deliveryNotes;
    }
    
    public void setDeliveryNotes(Set deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }




}


