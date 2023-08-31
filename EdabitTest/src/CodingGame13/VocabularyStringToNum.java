package CodingGame13;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * English: one, two, three, four, five, six, seven, eight, nine, ten
 * German: eins, zwei, drei, vier, fünf, sechs, sieben, acht, neun, zehn
 * Swedish: ett, två, tre, fyra, fem, sex, sju, åtta, nio, tio
 * Norwegian: en, to, tre, fire, fem, seks, syv, åtte, ni, ti
 * French: un, deux, trois, quatre, cinq, six, sept, huit, neuf, dix
 * Italian: uno, due, tre, quattro, cinque, sei, sette, otto, nove, dieci
 * Spanish: uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez
 * Portuguese: um, dois, três, quatro, cinco, seis, sete, oito, nove, dez
 * Catalan: un, dos, tres, quatre, cinc, sis, set, vuit, nou, deu
 * Latin: unus, duo, tres, quattor, quinque, sex, septem, octo, novem, decem
 * Russian: odin, dva, tri, chetyre, pyat', shest', sem', vosem', devyat', desyat'
 * Polish: jeden, dwa, trzy, cztery, pięć, sześć, siedem, osiem, dziewięć, dziesięć
 * Welsh: un, dau, tri, pedwar, pump, chwech, saith, wyth, naw, deg
 * AncientGreek: eîs, dúo, treîs, téssares, pénte, hex, heptá, októ, ennéa, déka
 * ModernGreek: éna, dúo, tría, téssera, pénte, éxi, eptá, októ, ennéa, déka
 * Finnish: yksi, kaksi, kolme, neljä, viisi, kuusi, seitsemän, kahdeksan, yhdeksan, kymmenen
 * Basque: bat, bi, hiru, lau, bost, sei, zazpi, zortzi, beheratzi, hamar
 * Sanskrit: ekab, dvi, trayah, chatvarah, pancha, shash, sapta, ashta, nava, dasha
 * Swahili: moja, bili, tatu, 'nne, tano, sita, sabbah, nanne, tissa, kumi
 * Arabic: wahed, ithnain, thelatha, arba'a, hamza, sitta, seba'a, themania, tisa'a, ashara
 **/
class Solution {

    public static void main(String args[]) {
        String[] arr1 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] arr2 = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        String[] arr3 = {"ett", "två", "tre", "fyra", "fem", "sex", "sju", "åtta", "nio", "tio"};
        String[] arr4 = {"en", "to", "tre", "fire", "fem", "seks", "syv", "åtte", "ni", "ti"};
        String[] arr5 = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix"};
        String[] arr6 = {"uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci"};
        String[] arr7 = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        String[] arr8 = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};
        String[] arr9 = {"un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou", "deu"};
        String[] arr10 = {"unus", "duo", "tres", "quattor", "quinque", "sex", "septem", "octo", "novem", "decem"};
        String[] arr11 = {"odin", "dva", "tri", "chetyre", "pyat'", "shest'", "sem'", "vosem'", "devyat'", "desyat'"};
        String[] arr12 = {"jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć", "dziesięć"};
        String[] arr13 = {"un", "dau", "tri", "pedwar", "pump", "chwech", "saith", "wyth", "naw", "deg"};
        String[] arr14 = {"eîs", "dúo", "treîs", "téssares", "pénte", "hex", "heptá", "októ", "ennéa", "déka"};
        String[] arr15 = {"éna", "dúo", "tría", "téssera", "pénte", "éxi", "eptá", "októ", "ennéa", "déka"};
        String[] arr16 = {"yksi", "kaksi", "kolme", "neljä", "viisi", "kuusi", "seitsemän", "kahdeksan", "yhdeksan", "kymmenen"};
        String[] arr17 = {"bat", "bi", "hiru", "lau", "bost", "sei", "zazpi", "zortzi", "beheratzi", "hamar"};
        String[] arr18 = {"ekab", "dvi", "trayah", "chatvarah", "pancha", "shash", "sapta", "ashta", "nava", "dasha"};
        String[] arr19 = {"moja", "bili", "tatu", "'nne", "tano", "sita", "sabbah", "nanne", "tissa", "kumi"};
        String[] arr20 = {"wahed", "ithnain", "thelatha", "arba'a", "hamza", "sitta", "seba'a", "themania", "tisa'a", "ashara"};
        String[][] arr = {arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9, arr10, arr11, arr12, arr13, arr14, arr15, arr16, arr17, arr18, arr19, arr20};
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] subArray : arr) {
            for (int i = 0; i < subArray.length; i++) {
                map.put(subArray[i], i + 1);
            }
        }
        Scanner in = new Scanner(System.in);
        int howMany = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < howMany; i++) {
            String equation = in.nextLine();
            String[] parts = equation.split(" ");
            int result = map.get(parts[1]);
            switch (parts[2]) {
                case "+" -> result += map.get(parts[3]);
                case "-" -> result -= map.get(parts[3]);
                case "*" -> result *= map.get(parts[3]);
                case "/" -> result /= map.get(parts[3]);
            }
            System.out.printf("%s %d%n", parts[0], result);
        }
    }
}