class TrySbuffer{
		public static void main(String[] args){
		 String s1="Hydera";
		 String s2="bad";
		 String s3=s1.concat(s2);
		 System.out.println(s3);
		
		 String s4=s3.toUpperCase();
		 System.out.println(s4);
		 String s5=s4.replace('A','Z');
		 System.out.println(s5);
		 
		 
		 StringBuffer sb= new StringBuffer("Hello");
		 		 System.out.println(sb);
				 sb.append("World");
				 System.out.println(sb);
				 sb.insert(5,"Team");
				 System.out.println(sb);



		}

}














