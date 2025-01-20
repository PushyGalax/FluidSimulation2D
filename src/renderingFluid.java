import java.awt.*;

public class renderingFluid {
    private Graphics g;
    private environment environment;
    private particule[] particules;


    public renderingFluid(environment environment) {
        this.environment = environment;
        this.particules = environment.getParticules();

    }



    public void renderParticule(Graphics g, particule particule) {
        g.setColor(new Color(particule.getColor()));
        g.fillOval(particule.getX(), particule.getY(), particule.getRadius(), particule.getRadius());
    }

    public void update() {

    }

    public void render() {
        while (true) {
            // render all particules
            this.update();
            for (int i = 0; i < 100; i++) {
                // render particule
                this.renderParticule(g, particules[i]);
            }
        }
    }
}
