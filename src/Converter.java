package br.com.tragaasvelas.java;  
  
import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;  
  
/** 
 * @author Joao Duarte
 *  
 */  
public class CsvToJavaObject {  
  
 public void convertCsvToJava() {  
  String csvFileToRead = "csvFiles/teste.csv";  
  BufferedReader br = null;  
  String line = "";  
  String splitBy = ",";  

  
  try {  
  
   br = new BufferedReader(new FileReader(csvFileToRead));  
   while ((line = br.readLine()) != null) {  
  
    // split on comma(',')  
    String[] post = line.split(splitBy);  
  
    // create car object to store values  
    Cars carObject = new Cars();  
  
    // add values from csv to car object  
    carObject.setYear(post[0]);  
    carObject.setMake(post[1]);  
    carObject.setModel(post[2]);  
    carObject.setDescription(post[3]);  
    carObject.setPrice(post[4]);  
  
    // adding car objects to a list  
    carList.add(carObject);  
  
   }  
   // print values stored in carList  
   printCarList(carList);  
  
  } catch (FileNotFoundException e) {  
   e.printStackTrace();  
  } catch (IOException e) {  
   e.printStackTrace();  
  } finally {  
   if (br != null) {  
    try {  
     br.close();  
    } catch (IOException e) {  
     e.printStackTrace();  
    }  
   }  
  }  
 }  
  
 public void printCarList(List<cars> carListToPrint) {  
  for (int i = 0; i < carListToPrint.size(); i++) {  
   System.out.println("CARS [year= " + carListToPrint.get(i).getYear()  
     + " , make=" + carListToPrint.get(i).getMake()  
     + " , model=" + carListToPrint.get(i).getModel()  
     + " , description="  
     + carListToPrint.get(i).getDescription() + " , price="  
     + carListToPrint.get(i).getPrice() + "]");  
  }  
 }  
}  