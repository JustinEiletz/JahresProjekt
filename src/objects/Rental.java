package objects;

public class Rental {

    private Integer id;
    private Integer objectNr;
    private String objectTyp;
    private String objectDesc;
    private Double livingSpace;
    private Double priceSquareMeterCold;
    private Double additionalCosts;
    private String notice;

    public Rental(final Integer id, final Integer objectNr, final String objectTyp, final String objectDesc, final Double livingSpace, final Double priceSquareMeterCold, Double additionalCosts, final String notice) {
        this.id = id;
        this.objectNr = objectNr;
        this.objectTyp = objectTyp;
        this.objectDesc = objectDesc;
        this.livingSpace = livingSpace;
        this.priceSquareMeterCold = priceSquareMeterCold;
        this.additionalCosts = additionalCosts;
        this.notice = notice;
    }

    public Integer getId() {
        return id;
    }

    public Integer getObjectNr() {
        return objectNr;
    }

    public void setObjectNr(Integer objectNr) {
        this.objectNr = objectNr;
    }

    public String getObjectTyp() {
        return objectTyp;
    }

    public void setObjectTyp(String objectTyp) {
        this.objectTyp = objectTyp;
    }

    public String getObjectDesc() {
        return objectDesc;
    }

    public void setObjectDesc(String objectDesc) {
        this.objectDesc = objectDesc;
    }

    public Double getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(Double livingSpace) {
        this.livingSpace = livingSpace;
    }

    public Double getPriceSquareMeterCold() {
        return priceSquareMeterCold;
    }

    public void setPriceSquareMeterCold(Double priceSquareMeterCold) {
        this.priceSquareMeterCold = priceSquareMeterCold;
    }

    public Double getAdditionalCosts() {
        return additionalCosts;
    }

    public void setAdditionalCosts(Double additionalCosts) {
        this.additionalCosts = additionalCosts;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", objectNr=" + objectNr +
                ", objectTyp='" + objectTyp + '\'' +
                ", objectDesc='" + objectDesc + '\'' +
                ", livingSpace=" + livingSpace +
                ", priceSquareMeterCold=" + priceSquareMeterCold +
                ", additionalCosts=" + additionalCosts +
                ", notice='" + notice + '\'' +
                '}';
    }
}
