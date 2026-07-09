void main() {
    IO.print("Enter Hours: ");
    int hours = Integer.parseInt(IO.readln());
    IO.print("Enter Mintes: ");
    int mintes = Integer.parseInt(IO.readln());
    int totlaMintes = (hours * 60) + mintes;
    IO.print("Total mintes = " + totlaMintes);
}