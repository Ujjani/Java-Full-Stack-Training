class StringBufferMethods{
	public static void main(String[] args){
	
	
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println(sb);
		
		//APPEND
		sb.append("World");
		System.out.println(sb);
		
		//INSERT
		sb.insert(5,"Team");
		System.out.println(sb);

		//DELETE
		sb.delete(2,3); //deletes the  character between the start and end 
		System.out.println(sb);
	
		//replace
		sb.replace(2,3,"To");
		System.out.println(sb);
	}


}