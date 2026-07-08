void main() {
    int x, num;
    IO.println("-----Pre-increment----");
    x = 10;
    IO.println("Before x = " + x);
    num = ++x;
    IO.println("num = " + num);
    IO.println("After = " + x);

    IO.println("-----Pre-increment----");
    x = 10;
    IO.println("Before x = " + x);
    num = x++;
    IO.println("num = " + num);
    IO.println("After = " + x);
}