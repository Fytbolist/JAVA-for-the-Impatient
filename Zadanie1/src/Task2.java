public class Task2{
    static class myObject {
        String getName() {
           return {}
        }
        Str
    }
    public static void main(String[] args){

        myObject obj = new myObject("myName");
        changeName(obj);
        System.out.print(obj.getName()); // This prints "anotherName"
    }
    public static void changeName(myObject obj){
        obj.setName("anotherName");
    }
}