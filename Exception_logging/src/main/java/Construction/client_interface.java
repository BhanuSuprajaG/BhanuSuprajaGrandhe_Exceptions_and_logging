package Construction;
import java.util.*;
import java.util.logging.Logger;
public class client_interface extends Construction_cost {
		public static void main(String args[]) {
			Scanner obj=new Scanner(System.in);
			Logger log= Logger.getLogger(client_interface.class.getName());
			log.info("Enter the area of your house (in square feet)");
			float a=obj.nextFloat();
			log.info("Enter your choice of type of material for house construction:");
			log.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
			int ch=obj.nextInt();
			int special_ch=0;
			if(ch==3) {
				log.info("Do you want a fully automated house(0/1)?");
				special_ch=obj.nextInt();
			}
			if(ch>=1 && ch<=3) {
				log.info("Calculating house construction cost...");
				if(ch==3 && special_ch==1) {
						log.info("Your House Construction Cost--->  "+house_construction_cost(a,3)+" INR");
				}
				else
					log.info("Your House Construction Cost--->  "+house_construction_cost(a,ch-1)+" INR");
			}
			else
				log.warning("Invalid choice...");
			obj.close();
		}
	}