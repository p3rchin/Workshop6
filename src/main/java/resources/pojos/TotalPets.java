package resources.pojos;

import java.util.List;

public class TotalPets {
    private String total;
    private List<Pet> pets;

    public TotalPets(String total, List<Pet> pets) {
        this.total = total;
        this.pets = pets;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
