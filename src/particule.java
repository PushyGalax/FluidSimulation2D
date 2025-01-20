public class particule {
    private int radius;
    private float mass;
    private int x;
    private int y;
    private int vx;
    private int vy;
    private int color;  // try color in HSV format

    //getter and setter
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getMass() {
        return mass;
    }
    public void setMass(float mass) {
        this.mass = mass;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }
    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }
    public void setVy(int vy) {
        this.vy = vy;
    }

    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }


    public particule(int radius, float mass, int x, int y, int vx, int vy) {
        this.setRadius(radius);
        this.setMass(mass);
        this.setX(x);
        this.setY(y);
        this.setVx(vx);
        this.setVy(vy);
        this.setColor(0);
    }

    public void move() {
        this.x += this.vx;
        this.y += this.vy;
    }

    public void bounce(int width, int height) {
        if (this.x - this.radius < 0 || this.x + this.radius > width) {
            this.vx = -this.vx;
        }
        if (this.y - this.radius < 0 || this.y + this.radius > height) {
            this.vy = -this.vy;
        }
    }


}
