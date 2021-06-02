package resources.pojos;

import java.util.List;

public class Owner {
    private String username;
    private Integer personId;
    private String name;
    private String address;
    private String neighborhood;
    private List<Pet> pets;


    public Owner(){

    }

    public Owner(String username, Integer personId, String name, String address, String neighborhood, List<Pet> pets) {
        this.username = username;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.pets = pets;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
