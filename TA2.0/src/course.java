import java.util.*;
import java.util.Map;

public class course {
	// assets
	public static String nameOfTeacher;
	public static double currentMark;
	public static double desiredMark;
	public static String nameOfCourse;
	public static String courseCode;
	public static String metadata;
	public static double percentagecomp;
	protected static Map<String, assessment> listofassessments = new HashMap<String, assessment>();

	public static void addassessment(assessment a) {
		listofassessments.put(a.name, a);

		double tempcur = (currentMark / 100) * percentagecomp;
		double tempper = (a.mark / 100) * a.weight;

		percentagecomp += a.weight;
		currentMark = 100 * (((tempcur / tempper) + (a.mark / a.weight)) / (percentagecomp));
	}

	public course() {

	}
}