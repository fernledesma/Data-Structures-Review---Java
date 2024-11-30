import java.util.HashMap;
public class HashmapExample {
    public static void main(String[] args){
        HashMap<String, String> courseTeacher = new HashMap<String, String>();

        courseTeacher.put("History", "Ben");
        courseTeacher.put("Mathematics", "Jeanette");
        courseTeacher.put("Physics", "Lily");

        System.out.println("Courses offered at our Institute");
        for(String i: courseTeacher.keySet()){
            System.out.println(i);
        }

        System.out.println("\nTeachers teaching at our Institute");
        for(String i: courseTeacher.values()){
            System.out.println(i);
        }
        
       alternativeHashMapExample();
    

    }
   
        public static void alternativeHashMapExample(){
            HashMap<String, String> courseTeacher = new HashMap<String, String>();

            courseTeacher.put("History", "Ben");
            courseTeacher.put("Mathematics", "Jeanette");
            courseTeacher.put("Physics", "Lily");

            getEntries(courseTeacher);

        }
        public static void getEntries(HashMap<String, String> getEntries){
            for(HashMap.Entry<String, String> entry: getEntries.entrySet()){
                System.out.printf("Course: %s",entry.getKey());
                System.out.printf("Teacher: %s \n", entry.getValue());
            }
        }
    
}

