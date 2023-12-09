package cientistavuador.testepdf;

/**
 *
 * @author Cien
 */
public enum Upscale {
    UPSCALE("Ajustar proporcionalmente as imagens para a página"),
    DOWNSCALE_IF_NEEDED("Manter o tamanho original das imagens se possível");
    
    private final String name;

    private Upscale(String name) {
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
