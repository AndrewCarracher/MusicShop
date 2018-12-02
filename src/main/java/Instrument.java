public abstract class Instrument implements IPlay{

    private String type;
    private double wholesalePrice;
    private double rrp;
    private String materialMadeFrom;
    private String colour;

    public Instrument(String type, double wholesalePrice, double rrp, String materialMadeFrom, String colour){
        this.type = type;
        this.wholesalePrice = wholesalePrice;
        this.rrp = rrp;
        this.materialMadeFrom = materialMadeFrom;
        this.colour = colour;
    }


    public String getMaterialMadeFrom() {
        return materialMadeFrom;
    }

    public void setMaterialMadeFrom(String materialMadeFrom) {
        this.materialMadeFrom = materialMadeFrom;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType(){
        return this.type;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRrp() {
        return rrp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public void setRrp(double rrp) {
        this.rrp = rrp;
    }

    public String play(Instrument instrument) {
        return instrument.getType();
    }

}
