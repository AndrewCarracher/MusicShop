import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(){
        this.stock = new ArrayList<>();
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addInstrumentToStock(ISell instrument){
        this.stock.add(instrument);
    }

    public ISell removeInstrumentFromStock(String type){

        for(int i = 0; i< stockCount(); i++){
            ISell instrument = this.stock.get(i);

            if(instrument instanceof Guitar){
                Guitar guitar = (Guitar)instrument;
                if(guitar.getType().equals(type)){
                    return this.stock.remove(i);
                }
            }
            else if(instrument instanceof Piano){
                Piano piano = (Piano)instrument;
                if(piano.getType().equals(type)){
                    return this.stock.remove(i);
                }
            }
            else if(instrument instanceof Violin){
                Violin violin = (Violin)instrument;
                if(violin.getType().equals(type)){
                    return this.stock.remove(i);
                }
            }
        }
        return null;
    }


}
