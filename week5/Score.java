void main() {
    IO.print("Score 1: ");
    double score1 = Double.parseDouble(IO.readln());
    IO.print("Score 2: ");
    double score2 = Double.parseDouble(IO.readln());
    IO.print("Score 3: ");
    double score3 = Double.parseDouble(IO.readln());
    IO.print("Bonus score: ");
    double bonuScore = Double.parseDouble(IO.readln());
    double totalScore = score1 + score2 + score3;
    double totalScoreWithBonus = score1 + score2 + score3 + bonuScore;
    double AvgTotalScoreWithbonus = totalScoreWithBonus / 3;
    IO.print("Total score = " + totalScore);
    IO.print("TOtal score with bonus = " + totalScoreWithBonus);
    IO.print("Average fo total score with bonus = %.2f".formatted(AvgTotalScoreWithbonus));
}