package resources.pojos;

import java.util.List;

public class TotalCases {

    private String total;
    private List<Case> cases;

    public TotalCases(String total, List<Case> cases) {
        this.total = total;
        this.cases = cases;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }
}
