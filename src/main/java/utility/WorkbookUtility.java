package utility;


//import model.Movie;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

public class WorkbookUtility {

//	public final static String INPUT_FILE = "assets//movies.xlsx";
//
//	public static List<Movie> retrieveMoviesFromWorkbook(final File inputFile)
//			throws IOException, InvalidFormatException {
//
//		final List<Movie> movies = new ArrayList<>();

//		final Workbook workbook = WorkbookFactory.create(inputFile);
//		final Sheet sheet = workbook.getSheetAt(0);
//
//		for(final Row row : sheet) {
//			final Cell titleCell = row.getCell(0);
//			final Cell plotCell = row.getCell(1);
//			final Cell directorCell = row.getCell(2);
//			final Cell lengthInMinutesCell = row.getCell(3);
//			final Cell yearReleasedCell = row.getCell(4);
//			final Cell ratingCell = row.getCell(5);
//			final Cell yearReleaseCell = row.getCell(6);
//			final Cell trailerCell = row.getCell(7);
//
//			final Movie movie = new Movie(
//					titleCell.getStringCellValue().trim(),
//					plotCell.getStringCellValue().trim(),
//					directorCell.getStringCellValue().trim(),
//					(int)lengthInMinutesCell.getNumericCellValue(),
//					(int)yearReleasedCell.getNumericCellValue(),
//					ratingCell.getStringCellValue().trim(),
//					yearReleaseCell.getStringCellValue().trim(),
//					trailerCell.getStringCellValue().trim());
//
//			movies.add(movie);
//		}
//
//		return movies;
//	}


}
