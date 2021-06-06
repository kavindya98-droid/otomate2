package hibernate;
// Generated May 25, 2020 11:55:22 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ShopCategory generated by hbm2java
 */
public class ShopCategory  implements java.io.Serializable {


     private Integer id;
     private String shopCategoryId;
     private String category;
     private String description;
     private Set shops = new HashSet(0);
     private Set categories = new HashSet(0);

    public ShopCategory() {
    }

    public ShopCategory(String shopCategoryId, String category, String description, Set shops, Set categories) {
       this.shopCategoryId = shopCategoryId;
       this.category = category;
       this.description = description;
       this.shops = shops;
       this.categories = categories;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getShopCategoryId() {
        return this.shopCategoryId;
    }
    
    public void setShopCategoryId(String shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getShops() {
        return this.shops;
    }
    
    public void setShops(Set shops) {
        this.shops = shops;
    }
    public Set getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set categories) {
        this.categories = categories;
    }




}


