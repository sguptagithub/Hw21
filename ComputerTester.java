package Class21HwComputer;

public class ComputerTester {

        public static void main(String[] args) {
            Computer[] computers = new Computer[4];

            computers[0] = new Apple("Apple", "MacBook Pro", 2021, 1999.99);
            computers[1] = new Lenovo("Lenovo", "ThinkPad X1 Carbon", 2021, 1499.99, "black");
            computers[2] = new HP("HP", "Spectre x360", 2021, 1299.99, "Intel Core i7");
            computers[3] = new Dell("Dell", "XPS 13", 2021, 1299.99, "3 years");

            for (Computer computer : computers) {
                computer.printInfo();
                computer.turnOn();
                computer.useKeyboard();
                computer.turnOff();

                if (computer instanceof Lenovo) {
                    Lenovo lenovo = (Lenovo) computer;
                    lenovo.useTrackPoint();
                } else if (computer instanceof HP) {
                    HP hp = (HP) computer;
                    hp.useTouchscreen();
                } else if (computer instanceof Dell) {
                    Dell dell = (Dell) computer;
                    dell.useStylus();
                }
                System.out.println();
            }
        }


    }

