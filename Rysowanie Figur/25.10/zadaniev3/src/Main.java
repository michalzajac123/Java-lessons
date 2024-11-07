import javax.swing.*;

public class Main {
    static class PaintingCompany {
        private int numberOfRooms;
        private double pricePerLiter;
        private int roomArea;

        public PaintingCompany() {
            numberOfRooms = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rooms:"));
            pricePerLiter = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of paint per liter:"));
            roomArea = Integer.parseInt(JOptionPane.showInputDialog("Enter the area of one room in m²:"));
        }

        /**
         * Calculate paint liters
         * @return  paint liters
         */
        public double calculatePaintLiters() {
            return (roomArea / 10.0) * 1.5 * numberOfRooms;
        }

        /**
         * Calculate hours of work
         * @return hours of work
         */
        public double calculateHoursOfWork() {
            return (roomArea / 10.0) * 8 * numberOfRooms;
        }

        /**
         * Calculate cost of paint
         * @return cost of paint
         */
        public double paintCost() {
            return calculatePaintLiters() * pricePerLiter;
        }
        /**
         * Calculate cost of work
         * @return cost of work
         */
        public double workCost() {
            return calculateHoursOfWork() * 18;
        }
        /**
         * Calculate total cost of painting
         * @return total cost of painting
         */
        public double calculateTotalCost() {
            return paintCost() + workCost();
        }
    }

    public static void main(String[] args) {
        PaintingCompany paintingCompany = new PaintingCompany();
        double totalCost = paintingCompany.calculateTotalCost();
        JOptionPane.showMessageDialog(null, String.format("Total Cost: %.2f zł", totalCost));
    }
}
