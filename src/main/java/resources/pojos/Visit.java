package resources.pojos;

public class Visit {

    private Integer visitId;
    private String createdAd;
    private String type;
    private String description;
    private Integer vetId;
    private Integer petId;

    public Visit(){

    }

    public Visit(Integer visitId, String createdAd, String type, String description, Integer vetId, Integer petId) {
        this.visitId = visitId;
        this.createdAd = createdAd;
        this.type = type;
        this.description = description;
        this.vetId = vetId;
        this.petId = petId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getCreatedAd() {
        return createdAd;
    }

    public void setCreatedAd(String createdAd) {
        this.createdAd = createdAd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVetId() {
        return vetId;
    }

    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}
