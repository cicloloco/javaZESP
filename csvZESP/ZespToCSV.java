package csvZESP;

import java.io.FileWriter; 
import java.util.*; 
import com.opencsv.bean.ColumnPositionMappingStrategy; 
import com.opencsv.bean.StatefulBeanToCsv; 
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import jsonZESP.ZP_Result; 


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
	
	
	public ZespToCSV(String csv_path, ArrayList<ZP_Result> zp_results) {
		super();
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
	
/*
	public static void main(String[] args) 
	{ 

		// name of generated csv 
		final String CSV_LOCATION = "RaceResults.csv "; 

		try { 

			// Creating writer class to generate 
			// csv file 
			FileWriter writer = new
					FileWriter(CSV_LOCATION); 

			// create a list of employee 
			List<Employee> EmployeeList = new
								ArrayList<Employee>(); 
			Employee emp1 = new Employee 
					("Mahafuj", "24", "HTc", "75000"); 
			Employee emp2 = new Employee 
				("Aman", "24", "microsoft", "79000"); 
			Employee emp3 = new Employee 
					("Suvradip", "26", "tcs", "39000"); 
			Employee emp4 = new Employee 
					("Riya", "22", "NgGear", "15000"); 
			Employee emp5 = new Employee 
					("Prakash", "29", "Sath", "51000"); 
			EmployeeList.add(emp1); 
			EmployeeList.add(emp2); 
			EmployeeList.add(emp3); 
			EmployeeList.add(emp4); 
			EmployeeList.add(emp5); 

			// Create Mapping Strategy to arrange the 
			// column name in order 
			ColumnPositionMappingStrategy mappingStrategy= 
						new ColumnPositionMappingStrategy(); 
			mappingStrategy.setType(Employee.class); 

			// Arrange column name as provided in below array. 
			String[] columns = new String[] 
					{ "Name", "Age", "Company", "Salary" }; 
			mappingStrategy.setColumnMapping(columns); 

			// Createing StatefulBeanToCsv object 
			StatefulBeanToCsvBuilder<Employee> builder= 
						new StatefulBeanToCsvBuilder(writer); 
			StatefulBeanToCsv beanWriter = 
		builder.withMappingStrategy(mappingStrategy).build(); 

			// Write list to StatefulBeanToCsv object 
			beanWriter.write(EmployeeList); 

			// closing the writer object 
			writer.close(); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}
*/ 
} 