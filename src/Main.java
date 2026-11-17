//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<String> titles = new ArrayList<>();
    titles.add("Кобзар");
    titles.add("Заповіт");
    titles.add("Сон");
    titles.add("Катерина");
    titles.add("Гайдамаки");

    List<String> result = new ArrayList<>(titles);
    result.sort(Comparator.comparingInt(s ->s.length()));
    System.out.println(result);


}
