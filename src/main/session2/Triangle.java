package main.session2;

public class Triangle {
    float x;
    float y;
    float z;


    public Triangle() {

    }

    public Triangle(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float chuVi() {
        return this.x + this.y + this.z;
    }

    public float dienTich() {
        float p = (this.x + this.y + this.z) / 2;
        return (float) Math.sqrt(p * (p - this.z) * (p - this.y) * (p - this.x));
    }
}
