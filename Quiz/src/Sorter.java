import java.util.Comparator;
public class Sorter implements Comparator <Job>
	{
		public int compare (Job s1, Job s2)
		{
if(s1.getScore() < s2.getScore())
	return 1;
else 
	return -1;
	}
	}
