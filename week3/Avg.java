void main() {
    IO.println("Enter Num1");
    int num1 = Integer.parseInt(IO.readln());
     IO.println("Enter Num2");
    int num2 = Integer.parseInt(IO.readln());
     IO.println("Enter Num3");
    int num3 = Integer.parseInt(IO.readln());
     IO.println("Enter Num4");
    int num4 = Integer.parseInt(IO.readln());
     IO.println("Enter Num5");
    int num5 = Integer.parseInt(IO.readln());
    int sum = num1 + num2 + num3 + num4 + num5;
    float avg = sum / 5;
    IO.println("ผลรวมคือ" + sum + "และค่าเฉลี่ยคือ" + avg);
}