package com.example.user.mylistview;

import java.util.ArrayList;

public class PemainData {
    public static String[][] data = new String[][]{
            {"Szczesny", "Pemain Juventus FC", "https://en.wikipedia.org/wiki/Wojciech_Szcz%C4%99sny#/media/File:Wojciech_Szcz%C4%99sny_2018_(cropped).jpg"},
            {"De Sciglio", "Pemain Juventus FC", "https://en.wikipedia.org/wiki/Mattia_De_Sciglio#/media/File:20150616_-_Portugal_-_Italie_-_Gen%C3%A8ve_-_Mattia_De_Sciglio_1.jpg"},
            {"Chiellini", "Pemain Juventus FC", "https://en.wikipedia.org/wiki/Giorgio_Chiellini#/media/File:Giorgio_Chiellini_(edited).jpg"}
    };

    public static ArrayList<Pemain> getListData(){
        Pemain pemain = null;
        ArrayList<Pemain> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            pemain = new Pemain();
            pemain.setName(data[i][0]);
            pemain.setRemarks(data[i][1]);
            pemain.setPhoto(data[i][2]);

            list.add(pemain);
        }

        return list;
    }
}
