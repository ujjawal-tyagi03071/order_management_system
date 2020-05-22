package io.dbms.orderms;



public class Orders {

    private String id;
    private String customerName;
    private String description;


    public Orders(String id, String name, String description) {
        super();
        this.id = id;
        this.customerName = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}