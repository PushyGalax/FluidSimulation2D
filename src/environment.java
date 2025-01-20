public class environment {
    private int width;
    private int height;
    private int nbParticules;
    private particule[] particules;
    private renderingFluid renderingFluid;

    public environment(int width, int height, int nbParticules) {
        this.width = width;
        this.height = height;
        this.nbParticules = nbParticules;
        this.particules = new particule[nbParticules];
        this.renderingFluid = new renderingFluid(this);
        for (int i = 0; i < nbParticules; i++) {
            this.particules[i] = new particule(10, 1, (int)(Math.random() * width), (int)(Math.random() * height), (int)(Math.random() * 10), (int)(Math.random() * 10));
        }
    }

    public particule[] getParticules() {
        return particules;
    }

    // call a renderingFluid class
    public void render() {
        renderingFluid.render();
    }
}
