// package utils;

// import java.io.BufferedWriter;
// import java.io.FileInputStream;
// import java.io.FileWriter;

// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// public class FeatureFileGenerator {

//     public static void generateFeatureFile() {

//         String excelPath = "src/test/resources/testdata/loginData.xlsx";
//         String featurePath = "src/test/resources/features/generatedLogin.feature";

//         try {
//             FileInputStream file = new FileInputStream(excelPath);
//             XSSFWorkbook workbook = new XSSFWorkbook(file);
//             XSSFSheet sheet = workbook.getSheet("Sheet1");

//             BufferedWriter writer = new BufferedWriter(new FileWriter(featurePath));

//             // Write Feature Header
//             writer.write("Feature: OpenCart Login\n\n");
//             int rows = sheet.getPhysicalNumberOfRows();

//             for (int i = 1; i <= sheet.getLastRowNum(); i++) {

//             if (sheet.getRow(i) == null) continue;

//             if (sheet.getRow(i).getCell(0) == null) continue;
//             if (sheet.getRow(i).getCell(1) == null) continue;
//             if (sheet.getRow(i).getCell(2) == null) continue;

//     String username = sheet.getRow(i).getCell(0).toString().trim();
//     String password = sheet.getRow(i).getCell(1).toString().trim();
//     String result   = sheet.getRow(i).getCell(2).toString().trim();

//     writer.write("Scenario: Login with user " + username + "\n");
//     writer.write("  Given user is on login page\n");
//     writer.write("  When user enters username \"" + username + "\" and password \"" + password + "\"\n");
//     writer.write("  And clicks on login button\n");
//     writer.write("  Then login result should be \"" + result + "\"\n\n");
// }

//             writer.close();
//             workbook.close();

//             System.out.println("Feature file generated successfully!");

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }