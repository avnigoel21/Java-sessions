public class prog2 {
    static class Base{
        int x;

        public int getX(){
            return x;
        }

        Base(int x){
            this.x = x;
        }

    }

    public static void main(String[] args) {
        Base b = new Base(5);
        System.out.println(b.getX());
    }
}

// this -> this is a way for us to reference an object of the class which is being created/ referenced


