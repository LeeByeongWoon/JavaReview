package Gen;

public class Generic<T extends Material> {
    private T material;

    Generic(){

    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.doPrinting();
    }
}
