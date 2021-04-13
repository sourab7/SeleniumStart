package Covid.cov;

public class Strange {

  	public static void main(String[] args) {
		
		String s1="Chaski";
		String s2="BATMAN";
		String s3="logic is correct";
		
		String sub=s1.substring(1);
		
		System.out.println(sub);
		
		int t=s1.indexOf("r");
		System.out.println(t);
		String uppr= s1.toUpperCase();
		System.out.println(uppr);
		
		String lwr=s2.toLowerCase();
		System.out.println(lwr);
		
		int l= s1.length();
		System.out.println(l);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append(s3);
		
		sb.reverse();
		sb.deleteCharAt(8);
		
		
		System.out.println(sb);
		
	String rpl=	s2.replace("B", "C");
		System.out.println(rpl);
		
		
		
		
		
		
		
		
	}

}
