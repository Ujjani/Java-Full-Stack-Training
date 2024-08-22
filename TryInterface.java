interface I1{
	int id=78;
	

}

interface I2{
   int id =23;
   
}
interface I3 extends I2{


}
class TryInterface implements I1,I3{

	public static void main(String[] args){
				System.out.println("value of id"+I1.id);
					System.out.println("value of id"+I2.id);
	
	}


}