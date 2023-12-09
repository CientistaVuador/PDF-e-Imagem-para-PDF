package cientistavuador.testepdf;

/**
 *
 * @author Cien
 */
public enum Rotation {
    DO_NOT_ROTATE("Não rotacionar as imagens"),
    ROTATE_90("Rotacionar imagens em 90 Graus (Horário)"),
    ROTATE_90_CW("Rotacionar imagens em 90 Graus (Anti-Horário)");
    
    private final String name;

    private Rotation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
