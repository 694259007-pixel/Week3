void main() {
    IO.print("Enter Salary: ");
    double salary = Double.parseDouble(IO.readln());
    IO.print("Enter Debuction percent: ");
    double debuctionpercent = Double.parseDouble(IO.readln());
    double deduction = salary * debuctionpercent / 100.0;
    double netSalary = salary - deduction;
    IO.println("Deduction = %.1f ".formatted(deduction));
    IO.println("Net salary = %.1f ".formatted(netSalary));
}
