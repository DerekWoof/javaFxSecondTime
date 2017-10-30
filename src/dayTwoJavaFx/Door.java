package dayTwoJavaFx;

public class Door {
    private boolean wooden;
    private int height;

    public Door(boolean wooden, int height) {
        this.wooden = wooden;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Door{" +
                "wooden=" + wooden +
                ", height=" + height +
                '}';
    }
}
