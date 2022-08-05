package com.saucedemo.Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

    public String [] getData(){

        String excel = "src/test/resources/datadriven/Data.xlsx";
        String user = null;
        String password = null;

        try {
            FileInputStream file = new FileInputStream(new File(excel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("Credentials");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            user = cell.toString();
            cell = row.getCell(1);
            password = cell.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String dataUser[] = { user, password };
        return dataUser;
    }

    public String [] getInfo(){

        String archivoExcel = "src/test/resources/datadriven/Data.xlsx";
        String name = null;
        String lastname = null;
        String zipCode = null;



        try {
            FileInputStream file = new FileInputStream(new File(archivoExcel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("Informations");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            name = cell.toString();
            cell = row.getCell(1);
            lastname = cell.toString();
            cell = row.getCell(2);
            zipCode = cell.toString();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String dataUser[] = { name, lastname, zipCode };
        return dataUser;
    }
}
