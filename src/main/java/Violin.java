public class Violin extends Instrument implements IPlay, ISell{

    private int strings;

    public Violin(String type, double wholesalePrice, double rrp, String materialMadeFrom, String colour){
        super(type, wholesalePrice, rrp, materialMadeFrom, colour);
        setType("Violin");
        this.strings = 4;
        newInstrument(wholesalePrice, materialMadeFrom, colour);
    }

    public double sellingPrice(double markup){
        return markup * 1.7;
    }

    public void newInstrument(double wholesalePrice, String material, String colour){
        setWholesalePrice(wholesalePrice);
        setRrp(sellingPrice(wholesalePrice));
        setMaterialMadeFrom(material);
        setColour(colour);
    }
}
