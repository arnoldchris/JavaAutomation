package software.testing.java.filehandling;

public class ExcelDemo {
    public static void main(String[] args) {

        ExcelReader myReader=new ExcelReader("Module - FileHandling/src/software/testing/java/filehandling/Test data.xlsx","TestData");

       // System.out.println(myReader.getCellValue(0,0));
        int rows=myReader.getRowCount();
        int cols= myReader.getColumnCount();

       // System.out.println("Total Rows "+rows);
       // System.out.println("Total Cols: "+cols);
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(myReader.getCellValue(i,j));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
