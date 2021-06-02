package resources.pojos;

import java.util.List;

public class TotalVisits {

    private String total;
    private List<Visit> visits;

    public TotalVisits(String total, List<Visit> visits) {
        this.total = total;
        this.visits = visits;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}
