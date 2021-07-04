package DayCamps;

public class edcMainK {

	public static void main(String[] args) {
		parti ptc = new parti("Josephine","Joseph","female","012344567");
		
		print(ptc);
	}
	public static void print(Object ptc) {
		FitnessK fit=new FitnessK();
		SurvivalistK sur=new SurvivalistK();
		LeadershipK lea=new LeadershipK();
		
		System.out.println(ptc.toString()+fit);
		fit.benefit();
		System.out.println(ptc.toString()+sur);
		sur.benefit();
		System.out.println(ptc.toString()+lea);
	    lea.benefit();
	}

	String printinfo(String i) {
		FitnessK fit=new FitnessK();
		SurvivalistK sur=new SurvivalistK();
		LeadershipK lea=new LeadershipK();
		String j="";
		if(i=="FITNESS CAMP") {
			j=fit.toString();
		}else if(i=="SURVIVALIST CAMP") {
			j=sur.toString();
		}else if(i=="LEADERSHIP CAMP") {
			j=lea.toString();
		}
		return j;
	}

}