import java.util.ArrayList;
import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class MedicalCheckupWithoutDB {
    public ArrayList ML(){

        ArrayList<HashMap> MedcalList = new ArrayList<HashMap>();
        HashMap<String, String> Information = new HashMap<String, String>();
        Information.put("NAME", "홍길동");
        Information.put("GENDER", "남");
        Information.put("AGE", "30");
        Information.put("HEIGHT", "175");
        Information.put("WEIGHT", "75");
        Information.put("BLOODPRESSURE", "120/80");
        Information.put("BLOODSUGAR", "90");
        Information.put("RESULT", "비정상");
        Information.put("PATIENT_INFORMATION", "폐암,갑상선");
        MedcalList.add(Information);

        Information = new HashMap<String, String>();
        Information.put("NAME", "김영희");
        Information.put("GENDER", "여");
        Information.put("AGE", "25");
        Information.put("HEIGHT", "160");
        Information.put("WEIGHT", "55");
        Information.put("BLOODPRESSURE", "110/70");
        Information.put("BLOODSUGAR", "85");
        Information.put("RESULT", "비정상");
        Information.put("PATIENT_INFORMATION", "간암, 뇌졸중");
        MedcalList.add(Information);

        Information = new HashMap<String, String>();
        Information.put("NAME", "박철수");
        Information.put("GENDER", "남");
        Information.put("AGE", "45");
        Information.put("HEIGHT", "180");
        Information.put("WEIGHT", "85");
        Information.put("BLOODPRESSURE", "130/85");
        Information.put("BLOODSUGAR", "100");
        Information.put("RESULT", "정상");
        Information.put("PATIENT_INFORMATION", "심장질환");
        MedcalList.add(Information);

        Information = new HashMap<String, String>();
        Information.put("NAME", "이지은");
        Information.put("GENDER", "여");
        Information.put("AGE", "35");
        Information.put("HEIGHT", "165");
        Information.put("WEIGHT", "60");
        Information.put("BLOODPRESSURE", "115/75");
        Information.put("BLOODSUGAR", "95");
        Information.put("RESULT", "비정상");
        Information.put("PATIENT_INFORMATION", "간암, 알츠하이머");
        MedcalList.add(Information);

       
        Information = new HashMap<String, String>();
        Information.put("NAME", "최민호");
        Information.put("GENDER", "남");
        Information.put("AGE", "28");
        Information.put("HEIGHT", "170");
        Information.put("WEIGHT", "70");
        Information.put("BLOODPRESSURE", "125/80");
        Information.put("BLOODSUGAR", "92");
        Information.put("RESULT", "정상");
        Information.put("PATIENT_INFORMATION", "간암");
        MedcalList.add(Information); 
      
        for(HashMap<String, String> ResultList : MedcalList){ // .get을 통해 HashMap에 저장되어 있는거 불러옴
            System.out.println(ResultList.get("NAME") + " " + 
            ResultList.get("GENDER") + " " +
            ResultList.get("AGE") + " " + 
            ResultList.get("HEIGHT") + " " +
            ResultList.get("WEIGHT") + " " +
            ResultList.get("BLOODPRESSURE") + " " +
            ResultList.get("BLOODSUGAR") + " " +
            ResultList.get("RESULT") + " " +
            ResultList.get("PATIENT_INFORMATION") + " "
            );
        } //foreach 돌릴때 arraylist만 쓰기
        System.out.println();
        return MedcalList;

    }
    public static void main(String[] args) {
        MedicalCheckupWithoutDB medicalCheckupWithoutDB = new MedicalCheckupWithoutDB();
        ArrayList MDLT = medicalCheckupWithoutDB.ML();
}
}