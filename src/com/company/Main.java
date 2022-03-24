package com.company;

public class Main {

    public static void main(String[] args) {
        String encryptedText = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы " +
                "зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд " +
                "аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n Ф юэимюб чхни южздёюу ю " +
                "чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n Ю зъв гъ въгъъ, " +
                "еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ " +
                "жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, " +
                "жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
        StringBuilder decryptedText = new StringBuilder(encryptedText);
        for (int step = 0; step < 33; ++step) {
            for (int j = 0; j < encryptedText.length(); ++j) {
                decryptedText.setCharAt(j, Decrypter.getCharWithStep(encryptedText.charAt(j), step));
            }
            System.out.println("Step = " + step);
            System.out.println(decryptedText);
            System.out.println();
        }
    }
}
