/**
 * flyingBirds
 */
/**
 * Teachers
 */
public class Teachers extends Student{
    String teachername;

    @Override
    void details(){
        System.out.println("Teacher name "+teachername);
        System.out.println("Teacher address "+address);
        System.out.println("Teacher age "+age);
    
    }

    
}