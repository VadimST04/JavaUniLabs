import java.util.LinkedList;

public class Lab3 {
    public static void main(String[] args) {
        Apartment ap = new Apartment(50, 100, 30);
        Office of1 = new Office(100, 100, 70);
        Office of2 = new Office(200, 100, 80);
        House house = new House(350, 400, 600);
        house.addPlaceToHouse(ap);
        house.addPlaceToHouse(of1);
        house.addPlaceToHouse(of2);
        System.out.println(house.getNumOfApartments());
        System.out.println(house.getNumOfOffices());
    }
}

class Place {
    protected double width;
    protected double height;
    protected double depth;
    Place(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getSquare() {
        return width * height;
    }

    public double getVolume() {
        return width * height * depth;
    }
}

class Apartment extends Place {
    private int numWindow = 0;
    private boolean isPlaced = false;
    Apartment(double width, double height, double depth) {
        super(width, height, depth);
    }

    public void setNumWindow(int num) {
        numWindow = num;
    }

    public int getNumWindow() {
        return numWindow;
    }

    public void toggleIsPlaced() {
        isPlaced = !isPlaced;
    }

    public boolean getIsPlaced() {
        return isPlaced;
    }
}

class Office extends Place {
    private int numWindow = 0;
    private boolean isPlaced = false;
    private boolean isRepaired = false;
    Office(double width, double height, double depth) {
        super(width, height, depth);
    }

    public void setNumWindow(int num) {
        numWindow = num;
    }

    public int getNumWindow() {
        return numWindow;
    }

    public void toggleIsPlaced() {
        isPlaced = !isPlaced;
    }

    public boolean getIsPlaced() {
        return isPlaced;
    }

    public void toggleIsRepaired() {
        isRepaired = !isRepaired;
    }

    public boolean getIsRepaired() {
        return isRepaired;
    }
}

class House extends Place {
    private final LinkedList<Place> places = new LinkedList<>();
    House(double width, double height, double depth) {
        super(width, height, depth);
    }

    public void addPlaceToHouse(Place obj) {
        places.add(obj);
    }

    public int getNumOfApartments() {
        int count = 0;
        for (Place obj:places) {
            if (obj instanceof Apartment) {
                count++;
            }
        }
        return count;
    }

    public int getNumOfOffices() {
        int count = 0;
        for (Place obj:places) {
            if (obj instanceof Office) {
                count++;
            }
        }
        return count;
    }
}

