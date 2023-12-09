package cientistavuador.testepdf;

/**
 *
 * @author Cien
 */
public enum Margin {
    DEFAULT("Margem Padrão (2cm x 2cm; 2cm x 2cm)", 2f, 2f, 2f, 2f),
    NFE("Margem NF-e (0,75cm x 0,75cm; 0,75cm x 0,75cm)", 0.75f, 0.75f, 0.75f, 0.75f),
    ABNT("Margem ABNT (3cm x 2cm; 3cm x 2cm)", 3f, 2f, 3f, 2f),
    WORD("Margem Word (2,5cm x 2,5cm; 3cm x 3cm)", 2.5f, 2.5f, 3f, 3f),
    SHORT("Margem Curta (1cm x 1cm; 1cm x 1cm)", 1f, 1f, 1f, 1f),
    MEDIUM("Margem Média (1,5cm x 1,5cm; 1,5cm x 1,5cm)", 1.5f, 1.5f, 1.5f, 1.5f),
    BIG("Margem Grande (3cm x 3cm; 3cm x 3cm)", 3f, 3f, 3f, 3f),
    LARGE_VERTICAL("Margem Larga (Vertical) (5cm x 5cm; 2cm x 2cm)", 5f, 5f, 2f, 2f),
    LARGE_HORIZONTAL("Margem Larga (Horizontal) (2cm x 2cm; 5cm x 5cm)", 2f, 2f, 5f, 5f),
    NONE("Nenhuma margem", 0f, 0f, 0f, 0f)
    ;
    
    private final String name;
    private final float top;
    private final float bottom;
    private final float left;
    private final float right;

    private Margin(String name, float top, float bottom, float left, float right) {
        this.name = name;
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public String getName() {
        return name;
    }

    public float getTop() {
        return top;
    }

    public float getBottom() {
        return bottom;
    }

    public float getLeft() {
        return left;
    }

    public float getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "[Imagens] "+getName();
    }
    
}
