package service;

import model.Champion;

import java.io.*;

public class ChampionService {
    private static final String FILE_NAME = "champion.txt";

    public static void serializeChampion(Champion champion) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_NAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(champion);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if (fos != null) fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Champion deserializeChampion() {
        Champion champion = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(FILE_NAME);
            ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            champion = (Champion) object;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return champion;
    }

}


