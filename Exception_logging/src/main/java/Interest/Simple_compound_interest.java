package Interest;
public class Simple_compound_interest {
	    public float simple_interest(float princpal_amt,int time_period,float rate_Of_interest)
		{
			return (princpal_amt*time_period*rate_Of_interest)/100;
		}
		public float compound_interest(float principal_amt,int num_Of_times,int time_period,float rate_Of_interest)
		{
			return (principal_amt)*(float)(Math.pow(1+(rate_Of_interest/num_Of_times),time_period));
		}
	}


