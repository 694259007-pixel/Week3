void main() {
    IO.print("Enter Initial Saving: ");
    double InitialSaving = Double.parseDouble(IO.readln());
    IO.print("Enter MonthlySaving: ");
    double MonthlySaving = Double.parseDouble(IO.readln());
    IO.print("Enter Months: ");
    double Months = Double.parseDouble(IO.readln());
    IO.print("Enter Interest percent: ");
    double InterestPercent = Double.parseDouble(IO.readln());
    double TotalSaving = InitialSaving + MonthlySaving * Months;
    double Interest = TotalSaving * InterestPercent / 100.0;
    double FinalSaving = TotalSaving + Interest;
    IO.println("TotalSaving = %.2f ".formatted(TotalSaving));
    IO.println("Interest = %.2f ".formatted(Interest));
    IO.println("FinalSaving = %.2f ".formatted(FinalSaving));
}