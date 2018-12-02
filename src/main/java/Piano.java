public class Piano extends Instrument implements IPlay, ISell{

    private int octaves;

    public Piano(String type, double wholesalePrice, double rrp, String materialMadeFrom, String colour){
        super(type, wholesalePrice, rrp, materialMadeFrom, colour);
        setType("Piano");
        this.octaves = 8;
        newInstrument(wholesalePrice, materialMadeFrom, colour);
    }

    public double sellingPrice(double markup){
        return markup * 1.9;
    }

    public void newInstrument(double wholesalePrice, String material, String colour){
        setWholesalePrice(wholesalePrice);
        setRrp(sellingPrice(wholesalePrice));
        setMaterialMadeFrom(material);
        setColour(colour);
    }

}
