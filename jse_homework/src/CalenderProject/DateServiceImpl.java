package CalenderProject;

public class DateServiceImpl implements DateService{

	@Override
	public int getEndDayOfMonth(int year, int month) {
		int state = 0;
		
		switch (month) {
		case 1:case 3:case 5: case 7: case 8: case 10: case 12: state = 31;break;
		case 4:case 6: case 9: case 11: state = 30;break;
		case 2: state = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))? 29: 28;break;
        	 
		default:break;
		}
		
		return state;
	}

}
