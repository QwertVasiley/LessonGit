package MnogopotokHome;

public class Main {
    public static void main(String[] args) {
        //Написть два потока. Одни - ищет самую длиную строку в массиве.
        // Второй - ищет строку, которая начинается с буквы,
        // которая ближе всех к началу алфавита

        String[] poem = new String[]{"Однажды, в студеную зимнюю пору",
                "Я из лесу вышел; был сильный мороз.",
                "Гляжу, поднимается медленно в гору",
                "Лошадка, везущая хворосту воз.",
                "И шествуя важно, в спокойствии чинном,",
                "Лошадку ведет под уздцы мужичок",
                "В больших сапогах, в полушубке овчинном,",
                "В больших рукавицах… а сам с ноготок!"};

        SearchLine searchLine = new SearchLine();
        searchLine.array = poem;

        SearchLetter searchLetter = new SearchLetter();
        searchLetter.array = poem;

        searchLine.run();
        searchLetter.run();

    }
}
