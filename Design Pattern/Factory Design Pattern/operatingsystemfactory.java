public class operatingsystemfactory{
    public OS getinstance(String str){
        if(str.equals("open"))
            return new android();
        else if(str.equals("closed"))
            return new ios();
        else
            return new windows();
           

    }
}