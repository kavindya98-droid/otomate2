package hibernate;
// Generated May 25, 2020 11:55:22 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Wishlist generated by hbm2java
 */
public class Wishlist  implements java.io.Serializable {


     private Integer id;
     private Customer customer;
     private ShopHasProduct shopHasProduct;
     private Date datetime;

    public Wishlist() {
    }

	
    public Wishlist(Customer customer, ShopHasProduct shopHasProduct) {
        this.customer = customer;
        this.shopHasProduct = shopHasProduct;
    }
    public Wishlist(Customer customer, ShopHasProduct shopHasProduct, Date datetime) {
       this.customer = customer;
       this.shopHasProduct = shopHasProduct;
       this.datetime = datetime;
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
    public ShopHasProduct getShopHasProduct() {
        return this.shopHasProduct;
    }
    
    public void setShopHasProduct(ShopHasProduct shopHasProduct) {
        this.shopHasProduct = shopHasProduct;
    }
    public Date getDatetime() {
        return this.datetime;
    }
    
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }




}


