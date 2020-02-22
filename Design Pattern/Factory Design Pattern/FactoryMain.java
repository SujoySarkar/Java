public class FactoryMain
{
public static void main(String[] args) {
    operatingsystemfactory osf= new operatingsystemfactory();
    OS object = osf.getinstance("closed");
    object.spec();
}
}