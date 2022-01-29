package com.HiWorld;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Action in = new Action();
        Action perevod = new Action();
        
        System.out.println(in.select_replace("in.txt")); //Изымает из текста нужные строки

        perevod.input("in.txt", in.read_arr("perevod.txt")); //Берет переведенные строки вставляет в файл с текстом на вход
    }
}

class Action {

    public void input (String nameFile, ArrayList<String> arr) throws IOException { //Берет перевод вставляет в нужные строчки
        
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(nameFile));

        String line, result = "";
        int int_line = 2, i = 0;
        
        while ((line = br.readLine()) != null) {
            if(int_line == 4){
                int_line = 0;
                result = result + arr.get(i) + "\n";
                i ++;
                int_line ++;
                continue;
            }
            result = result + line + "\n";
            int_line ++;
        }
        System.out.println(result);
    }

    public ArrayList read_arr(String nameFile) throws IOException { // Берет перевод и преобразует в массив
        
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(nameFile));
        ArrayList<String> arr = new ArrayList();
        String line;
        
        while ((line = br.readLine()) != null) {
            line = "msgstr" + line.substring(6);
            arr.add(line);
        }
        return arr;
    }


    public String select_replace(String nameFile) throws IOException {  //Читает нужную строку и меняет первые символы
        
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(nameFile));

        String line, res = "";
        int int_line = 3;
        while ((line = br.readLine()) != null) {
            if (int_line == 4) {
                line = "msgstr" + line.substring(5);
                res = res + line + "\n";
                int_line = 0;
            }
            int_line ++;
        }
        return res;
    }
    
    public String read(String nameFile) throws IOException { // читает все и возвращает все

        BufferedReader br = null;
        br = new BufferedReader(new FileReader(nameFile));

        String line, res = "";
        while ((line = br.readLine()) != null) {
            res = res + line + "\n";
        }
        return res;
    }
}

