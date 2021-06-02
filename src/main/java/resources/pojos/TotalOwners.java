package resources.pojos;

import java.util.List;

public class TotalOwners {

    private String total;
    private List<Owner> owners;

    public TotalOwners(String total, List<Owner> owners) {
        this.total = total;
        this.owners = owners;

    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }
}
