void main() {
    IO.print("Enter wide: ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter long: ");
    double long = Double.parseDouble(IO.readln());
    double Totel = wide * long / 360;
    IO.print("BSA = %.2f".formatted(Totel));
}