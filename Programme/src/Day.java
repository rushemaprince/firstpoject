public enum Day{
    MATIN(8),MIDI(12),APRESMIDI(15),SOIR(22);
    private int Heure;
    Day(int heure){

        this.Heure=heure;

    }
    public int getHeure(){
        return Heure;
    }

}