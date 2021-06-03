package resources.pojos;

public class Pet {

    private Integer petId;
    private Integer microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private Integer ownerId;
    private String sterilized;

    public Pet(){

    }

    public Pet(Integer petId, Integer microchip, String name, String species, String race, String size, String sex, String picture, Integer ownerId) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.ownerId = ownerId;
    }

    public Pet(Integer petId, Integer microchip, String name, String species, String race, String size, String sex, String picture, Integer ownerId, String sterilized) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.ownerId = ownerId;
        this.sterilized = sterilized;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getMicrochip() {
        return microchip;
    }

    public void setMicrochip(Integer microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getSterilized() {
        return sterilized;
    }

    public void setSterilized(String sterilized) {
        this.sterilized = sterilized;
    }
}
