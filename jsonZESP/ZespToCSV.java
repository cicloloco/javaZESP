package jsonZESP;

import java.io.FileWriter;
import java.util.ArrayList;

import com.opencsv.bean.ColumnPositionMappingStrategy; 
import com.opencsv.bean.StatefulBeanToCsv; 
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException; 


public class ZespToCSV {
	
	private static class CustomMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {

	    String[] header;

	    public CustomMappingStrategy(String[] cols) {
	        header = cols;
	    }

	    @Override
	    public String[] generateHeader(T bean) throws CsvRequiredFieldEmptyException {
	        return header;
	    }
	}
	
	private String csv_path;
	private ArrayList<ZP_Result> zp_results;
	
	/**
	 * @param csv_path path completo del fichero .csv a generar
	 * @param zp_results el beanWriter requiere este ArrayList
	 */
	public ZespToCSV(String csv_path, ArrayList<ZP_Result> zp_results) {
		this.csv_path = csv_path;
		this.zp_results = zp_results;
	}

	public void convert(String[] cols) {
		try { 
			FileWriter writer = new FileWriter(this.csv_path); 

	        CustomMappingStrategy<ZP_Result> mappingStrategy = new CustomMappingStrategy<ZP_Result>(cols);
			mappingStrategy.setType(ZP_Result.class); 
			mappingStrategy.setColumnMapping(cols); 
			StatefulBeanToCsvBuilder<ZP_Result> builder = new StatefulBeanToCsvBuilder<ZP_Result>(writer); 
			StatefulBeanToCsv<ZP_Result> beanWriter = builder.withMappingStrategy(mappingStrategy).build(); 

			beanWriter.write(zp_results); 

			writer.close(); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}
	
} 