void main() {
    IO.print("Enter Prince of dresses: ");
    double princeofdresses = Double.parseDouble(IO.readln());
    IO.print("Enter number of Dresses to buy: ");
    double numDresses = Double.parseDouble(IO.readln());
    IO.print("Enter discount rate: ");
    double discount = Double.parseDouble(IO.readln());
    double totalCost = princeofdresses * numDresses;
    double discountAmount = discount / 100.0 * totalCost;
    double netpay = totalCost - discountAmount;
    IO.println("Total Cost = " + totalCost);
    IO.println("discountAmount = %.1f".formatted(discountAmount));
    IO.println("Net Pay = " + netpay);
}