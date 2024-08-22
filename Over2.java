class HexaTraining{
public void angularTrg(String intTr){
System.out.println("Internal trainer:"+intTr);
}
public void angularTrg(String exTr, int cost){
System.out.println("External trainer:"+exTr+"
}
public void angularTrg(String exTr, int cost,String venue){
System.out.println("External trainer:"+exTr+" "+"Cost:"+cost+" "+"Venue:"+venue);
}
public static void main(String[] args) {
HexaTraining hexa=new HexaTraining();
hexa.angularTrg("Vimala");
hexa.angularTrg("Thomas",40000);
hexa.angularTrg("Kavitha",70000,"Chennai");
}
}