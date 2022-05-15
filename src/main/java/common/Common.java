package common;

public class Common {
    public StringBuilder query = new StringBuilder();
    
    public String getCleanText(String Text){
        return Text.trim().replace("'", "").replace("/", "").replace("-", "");
    }
    
    public Integer testNat(String Number){
        try{
            return Integer.parseInt(Number);
        }catch(Exception e){
            return -1;
        }
    }
}
