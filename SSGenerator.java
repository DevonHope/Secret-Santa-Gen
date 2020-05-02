import java.util.*;
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.Phonenumber;
//import static spark.Spark;
//import spark.kotlin.*;


//ari cant have christ vv
//ven cant have ari vv
class SSGenerator{
	
	public static final String ACCOUNT_SID = "AC93a4aa97e99c13bebb7c8dbb044fcc59";
	public static final String AUTH_TOKEN = "f1e9d2dddb7e294f2d373a4e0121afed";
	
	public static<T> void shuffle(List<T> list){
		
		Random random = new Random();
		
		for(int i = list.size() - 1; i >= 1; i--){
			int j = random.nextInt(i + 1);
			
			T obj = list.get(i);
			list.set(i, list.get(j));
			list.set(j, obj);
		}
	}
	
	public static<T> void display(List<T> list){
		System.out.println("The Secret Santa List is: \n");
		for(int i = 0; i <= list.size()-1; i++){
			if( i == list.size() - 1){
				System.out.println(list.get(list.size()-1) + " has " + list.get(0) + "\n");
			}else{
				System.out.println(list.get(i) + " has " + list.get(i+1) + "\n");
			}
		}
	}
	
	public static void main (String[] args){
		/*Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message mess = Message.creator(
					new com.twilio.type.Phonenumber("+12563877195"),
					new com.twilio.type.Phonenumber("+19057513717"),
					"Test TExt").create();
		System.out.println(message.getSid());*/
		List<String> ss = new ArrayList(Arrays.asList("Lou", "Sterling", "AprilA", "Christian", "Ariana", "Vennessa", "Celeste"));
		shuffle(ss);
		display(ss);
	}
}