public class Guitar extends Instrument implements IPlay, ISell{

    private int strings;

    public Guitar(String type, double wholesalePrice, double rrp, String materialMadeFrom, String colour){
        super(type, wholesalePrice, rrp, materialMadeFrom, colour);
        this.strings = 6;
        newInstrument(wholesalePrice, materialMadeFrom, colour);
    }

    public double sellingPrice(double markup){
        return markup * 2.0;
    }

    public void newInstrument(double wholesalePrice, String material, String colour){
        setWholesalePrice(wholesalePrice);
        setRrp(sellingPrice(wholesalePrice));
        setMaterialMadeFrom(material);
        setColour(colour);
    }
}
