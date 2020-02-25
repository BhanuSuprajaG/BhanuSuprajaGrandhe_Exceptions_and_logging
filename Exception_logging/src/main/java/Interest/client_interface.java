package Interest;
import java.util.Scanner;
import java.util.logging.Logger;
public class client_interface extends Simple_compound_interest{
	  public static void main(String args[]) {
		  client_interface obj=new client_interface();
		  Logger log= Logger.getLogger(client_interface.class.getName());
		  Scanner s=new Scanner(System.in);
		  log.info("Which one do u wanna calculate?");
		  log.info("1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		  int ch=s.nextInt();
		  log.info("Enter principal amount...");
		  float principal_amt=s.nextFloat();
		  log.info("Enter the duration in years...");
		  int time_period=s.nextInt();
		  log.info("Enter rate of interest...");
		  float rate_Of_interest=s.nextFloat();
		  if(ch==1) {
			    log.info("performing Simple Interest...");
				log.info("Simple interest---> "+obj.simple_interest(principal_amt,time_period,rate_Of_interest));
		  }
		  else if(ch==2)
			{
				log.info("Enter the number of times to be calculated");
				int num_Of_Times=s.nextInt();
				log.info("performing Compound Interest...");
				log.info("Compound interest--->"+obj.compound_interest(principal_amt,num_Of_Times,time_period,rate_Of_interest));
			}
			else
				log.warning("Invalid option...TRY AGAIN!!");
		  s.close();
	}
	}




