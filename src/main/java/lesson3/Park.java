package lesson3;

public class Park {
    private Attraktsiony attraktsiony;
    private String parkName;
    public Park(String parkName) {
        this.parkName = parkName;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkName=" + parkName +
                '}';
    }

    public class Attraktsiony {
        private String name;
        private String workingHours;
        private double prise;
        public Attraktsiony(String name, String workingHours, double prise) {
            this.name = name;
            this.workingHours = workingHours;
            this.prise = prise;
        }

        @Override
        public String toString() {
            return "Attraktsiony{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", prise=" + prise +
                    '}';
        }
        public void print() {
            System.out.println(this);
        }
    }
    public void printPark() {
        System.out.println(this);
    }
}