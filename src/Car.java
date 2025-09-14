
public class Car {
    private final int seats;
    private final String engineType;
    private final String color;

    private Car(Builder builder) {
        this.seats = builder.seats;
        this.engineType = builder.engineType;
        this.color = builder.color;
    }

    public int getSeats() { return seats; }
    public String getEngineType() { return engineType; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Car [seats=" + seats + ", engine=" + engineType + ", color=" + color + "]";
    }

    public static class Builder {
        private final int seats;
        private final String engineType;
        private String color = "White";

        public Builder(int seats, String engineType) {
            this.seats = seats;
            this.engineType = engineType;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}