public class Triangolo {
    private float base;
    private float altezza;

    public Triangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setBase(float base) {
        if (base>0) {
            this.base = base;
        }else{
            this.base = 1;
        }
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
