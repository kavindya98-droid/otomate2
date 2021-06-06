package hibernate;
// Generated May 25, 2020 11:55:22 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UserType generated by hbm2java
 */
public class UserType  implements java.io.Serializable {


     private Integer id;
     private String type;
     private Set users = new HashSet(0);

    public UserType() {
    }

    public UserType(String type, Set users) {
       this.type = type;
       this.users = users;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }




}

